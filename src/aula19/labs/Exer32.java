/*
TABUADA Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A.
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer32 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int[] vetorA = new int [5];
         
         for(int i=0; i<vetorA.length; i++){
             
             System.out.println("Entre com um número na posição: " + i);  
          vetorA[i] = scan.nextInt();

         }

    for (int i = 0; i < vetorA.length; i++) {

        System.out.println("Tabuada de " + vetorA[i]);

        for (int j = 1; j <= 10; j++) {

            System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i] * j));

        }

        System.out.println();


        }

    }
}
