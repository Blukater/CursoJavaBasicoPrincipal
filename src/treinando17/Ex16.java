/*
A série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500.
 */

package treinando17;

import java.util.Locale;
import java.util.Scanner;


public class Ex16 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
          int primeiro = 1;
         int segundo = 1;
         int proximo = 0;
         
         System.out.println(primeiro);
    System.out.println(segundo);
         
         while(proximo<= 500){
             proximo = primeiro + segundo;
             primeiro = segundo;
             segundo =  proximo;
             
             
             System.out.println(proximo);
         }
}
}
