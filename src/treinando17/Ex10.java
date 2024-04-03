/*
 * Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.
 */

package treinando17;

import java.util.Locale;
import java.util.Scanner;


public class Ex10 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int num1 = 0;
         int num2 = 0;
         
         System.out.println("Digite o primeiro número inteiro:");
         num1 = scan.nextInt();
         
         System.out.println("Digite o segundo número inteiro:");
         num2 = scan.nextInt();
         
         System.out.println("Os números que estão no intervalo entre esse dois são:");
         System.out.println();
      for (int i=num1 + 1; i < num2; i++){
          
          System.out.println(i);
         
          }
         
          }

}
