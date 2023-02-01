/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer16 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
         int [] vetorA = new int [10];
         
         for (int i=0; i<vetorA.length; i++) {
             System.out.println("Ente com um número inteiro na posição: " + i);
             vetorA [i] = scan.nextInt();
                                       
         }
         
         int somaMenor15 = 0;
         int somaMaior15 = 0;
         int igual15 = 0;
         int qtdMaior15=  0;
           
         for (int i=0; i<vetorA.length; i++) {
                  if (vetorA [i] == 15) {
                     igual15++;
             
             } else if (vetorA [i] < 15) {
              somaMenor15 += vetorA [i];
           
             } else { 
                 
                 qtdMaior15++;
                 somaMaior15 += vetorA [i];
                 
             }
         }
         
            System.out.print("Vetor A: ");
               for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA [i] + " ");
            
               }
               
            System.out.println();
            
            System.out.println("Qtd números == 15:  " + igual15);
            System.out.println("A soma dos números < 15:  " + somaMenor15);
            System.out.println("A média dos números > 15:  " + somaMaior15/qtdMaior15);
}
}
