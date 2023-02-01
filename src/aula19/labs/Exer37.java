/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
do elemento correspondente em A.
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer37 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
           int [] vetorA = new int[15];
            int [] vetorB = new int [vetorA.length];
       
                 
                 for (int i=0; i<vetorA.length;i++) {
                     
                     System.out.println("Entre com o número inteiro na posição A - " + i);
                     vetorA [i]= scan.nextInt();
       
                 }
                 for (int i=0; i<vetorA.length;i++) {
                     
                     
                     vetorB[i] = 1;
                     for(int j=1; j<=vetorA[i]; j++){
                           vetorB[i] *= j;
                         
                     }
                 }
         System.out.println("VetorA = ");
         for (int i=0; i<vetorA.length; i++){
             System.out.print(vetorA[i] + " ");

}
         System.out.println();
         
         System.out.println("VetorB = ");
         for (int i=0; i<vetorA.length; i++){
             System.out.print(vetorB[i] + " ");

}
         System.out.println();
}
}
