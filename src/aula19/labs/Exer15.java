/*
 *
porcentagem de pares e impares
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer15 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int [] vetorA = new int [10];
            for (int i=0; i<vetorA.length; i++) {
                System.out.println("Entre com número interiro na posição: " + i);
                vetorA[i] = scan.nextInt();
             
         }
         
         int qtdPares = 0;
     
             for (int i=0; i<vetorA.length; i++) {
                  if (vetorA [i] % 2 == 0) {
                  qtdPares++;
       }
             } 
             
               int qtdImpares = vetorA.length - qtdPares;
               
               double porcPares = (qtdPares * 100) / vetorA.length;
               double porcImpares = 100 - porcPares;
               
               System.out.print("Vetor A: ");
               for (int i=0; i<vetorA.length; i++) {
                   System.out.print(vetorA [i] + " ");
               }
            System.out.println();
            
            System.out.println("Porcentagem pares: " + porcPares + "%" );
            System.out.println("Porcentagem pares: " + porcImpares + "%");
                     }

               }
         


