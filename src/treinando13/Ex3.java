/*
 Faça um Programa que peça dois números e imprima a soma.
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;


public class Ex3 {
 public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    
    int num1 = 0;
    int num2 = 0;
    
    
      System.out.println("Digite o primeiro número:");
      num1 = scan.nextInt();
            System.out.println("Digite o segundo número:");
      num2 = scan.nextInt();
      
      int soma = num1 + num2;
      System.out.println("A soma dos números digitados é: " + soma);
}
}