/*
PRIMOS   Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e uma mensagem indicando se o
respectivo elemento é um número primo ou não.
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer33 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int[] vetorA = new int[5];
         
      boolean primo = true;
        String msn;
            
    for (int i = 0; i < vetorA.length; i++) {

        System.out.println("Entre com um número na posição - " + i);
        vetorA[i] = scan.nextInt();
             
         }
         
         for (int i = 0; i < vetorA.length; i++) {
                        
             primo = true;
             for (int j=2; j<vetorA[i]; j++) {
                 if (vetorA[i] % j == 0) {
                     primo = false;
                     break;
                 }
                 
             }
             
             msn = "";
             if (primo){
                 msn = " primo";
                 
             }else {
                 msn = " não é primo";
             }
             System.out.println(vetorA[i] + msn);
        }
    System.out.println();
    }
}
