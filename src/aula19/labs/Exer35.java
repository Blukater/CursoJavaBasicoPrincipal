/*
Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e a relação de todos os divisores do
respectivo elemento.
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer35 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
int[] vetorA = new int[10];
            
    for (int i = 0; i < vetorA.length; i++) {

        System.out.println("Entre com um número na posição A - " + i);
        vetorA[i] = scan.nextInt();
             
         }
         
         for (int i = 0; i < vetorA.length; i++) {
             System.out.println("Analizando o número " + vetorA[i]);
             
             for (int j=1; j<vetorA[i]; j++) {
                 if (vetorA[i] % j == 0)
                 {
                     System.out.println(j + " é divisor de " + vetorA[i] );
                 }
               
             }
             
               System.out.println();
         }
         }
}