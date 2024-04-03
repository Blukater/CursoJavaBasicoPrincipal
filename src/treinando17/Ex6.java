/*
 Faça um programa que imprima na tela os números de 1 a 20, um
abaixo do outro. Depois modifique o programa para que ele mostre os
números um ao lado do outro.
 */

package treinando17;

import java.util.Locale;
import java.util.Scanner;


public class Ex6 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int numMax = 20;
         int i = 1;
         
         System.out.println("Contando de 1 a 20 " + numMax);
         
         while(i <= numMax){
             System.out.println("i " + i);
             //System.out.print(i + " "); pra ficar um do lado do outro
             i++;
             
             
         }
          
}
}