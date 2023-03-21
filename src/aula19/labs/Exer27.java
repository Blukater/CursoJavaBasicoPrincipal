/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) Bi deverá receber 'a' quando Ai for menor que 7; b) Bi deverá
receber 'b' quando Ai for igual a 7; c) Bi deverá receber 'c' quando Ai for
maior que 7 e menor que 10; d) Bi deverá receber 'd' quando Ai for
igual a 10; e e) Bi deverá receber 'e' quando Ai for maior que 10.
Sugestão: char B[10];
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer27 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
         
        int [] vetorA = new int[10];
         char [] vetorB = new char [vetorA.length];
      
                 
                 for (int i=0; i<vetorA.length;i++) {
                     
                     System.out.println("Entre com o número inteiro na posição A: " + i);
                     vetorA [i] = scan.nextInt();
       
            
                     if(vetorA[i] < 7){
                         vetorB[i] = 'a';
                     } else if (vetorA[i] == 7){
                         vetorB [i] = 'b';
                       } else if (vetorA[i] > 7 && vetorA[i] < 10){
                         vetorB [i] = 'c';
                    } else if (vetorA[i] == 10){
                         vetorB [i] = 'd';
                    } else if (vetorA[i] > 10){
                         vetorB [i] = 'd';
                 }
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
       
}
}