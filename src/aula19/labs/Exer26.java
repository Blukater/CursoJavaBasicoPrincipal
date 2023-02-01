/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer26 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int [] vetorA = new int[10];
         int [] vetorB = new int [vetorA.length];
         int [] vetorC = new int [vetorA.length];
                 
                 for (int i=0; i<vetorA.length;i++) {
                     
                     System.out.println("Entre com o número inteiro na posição A: " + i);
                     vetorA [i]= scan.nextInt();
       
                 }
                 for (int i=0; i<vetorA.length;i++) {
                     
                     System.out.println("Entre com o número inteiro na posição B: " + i);
                     vetorB [i]= scan.nextInt();
                     
                     
                     if (vetorA[i] == vetorB[i]) {
                         vetorC[i] = 0;
                     } else if (vetorA[i] > vetorB[i]) {
                            vetorC[i] = 1;
                 } else {
                         vetorC[i] = -1;
                         }
                 }
                 
                 System.out.print("VetorA = ");
                  
         for (int i=0; i < vetorB.length; i++){
             System.out.print(vetorA [i] + " ");
         
         }
         System.out.println();
         
         System.out.print("VetorB= ");
         for (int i=0; i < vetorB.length; i++){
             System.out.print(vetorB [i] + " ");
         
         }
         System.out.println();
         
           System.out.print("VetorC= ");
         for (int i=0; i < vetorC.length; i++){
             System.out.print(vetorC [i] + " ");
}
}
}

                 
                  






