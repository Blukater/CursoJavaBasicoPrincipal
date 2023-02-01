/*
 Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer28 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int [] vetorA = new int [10];
         int [] vetorB = new int [vetorA.length];
         
          boolean palindromo = true;
          
         for(int i=0; i<vetorA.length; i++){
             
             System.out.println("Entre com um número na posição: " + i);
             vetorA [i]= scan.nextInt();
             
            vetorB[vetorA.length - i - 1] = vetorA[i]; 
   
         }
    
        System.out.print("VetorA = ");
         for (int i=0; i < vetorA.length; i++){
             System.out.print(vetorA [i] + " ");
         
         }
         System.out.println();
         
         System.out.print("VetorB= ");
         for (int i=0; i < vetorB.length; i++){
             System.out.print(vetorB [i] + " ");
}
         System.out.println();
}
}