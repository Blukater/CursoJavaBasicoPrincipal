/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer12 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int [] vetorA = new int [10];
         
         for (int i=0; i<vetorA.length; i++) {
             
             System.out.println("Entre com um número inteiro na posição: " + i);
             vetorA [i] = scan.nextInt();
   
         }
         
         int soma = 0;
         for (int i=0; i<vetorA.length; i++) {
                soma += vetorA[i];
         
}
        
         System.out.print("Vetor A: ");
         for (int i=0; i<vetorA.length; i++) {
             
             System.out.print(vetorA[i] + " " );
}
         System.out.println();
         
        System.out.println("A somas dos inteira é: " + soma);
}
}