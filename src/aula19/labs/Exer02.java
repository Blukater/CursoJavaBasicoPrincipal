/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer02 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
        int[] vetorA = new int [8];
        int[] vetorB = new int [vetorA.length];
         
          for (int i=0; i<vetorA.length; i++){
              
              System.out.println("Entre com o valor da posição: " + i );
              vetorA[i] = scan.nextInt();
              
               vetorB [i] = vetorA [i] * 2;
              
          }
         
          /*for (int i=0; i<vetorA.length; i++){
                vetorB [i] = vetorA [i];*/
         
         System.out.print("Vetor A = ");
         
          for (int i=0; i<vetorA.length; i++){
              System.out.print(vetorA [i] + " ");
              
          }
         System.out.println();
         
         System.out.print("Vetor B = ");
         
          for (int i=0; i<vetorA.length; i++){
              System.out.print(vetorB [i] + " ");
              
          }
         System.out.println();
          }
    }
         
         

