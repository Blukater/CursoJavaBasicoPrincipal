/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer14 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int [] vetorA = new int [10];
         
         for (int i=0; i<vetorA.length; i++) {
             System.out.println("Entro com o número inteiro na posição: " + i);
             vetorA [i] =  scan.nextInt();
           
         }
         
         int soma = 0;
         int impar = 0;
         
         for (int i=0; i<vetorA.length; i++) {
             if (vetorA [i] % 2 != 0) {
                 soma += vetorA[i];
                 impar++;
                 
             }
         }
         
         System.out.print("Vetor A: ");
         for (int i=0; i<vetorA.length; i++) {
             System.out.print(vetorA [i] + " ");
             
             
         }
         
         System.out.println();
         System.out.println("Soma: " + soma);
         System.out.println("Média: " + soma / impar);
}
}