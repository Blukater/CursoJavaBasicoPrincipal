/*
Faça um Programa que peça dois números e imprima o maior deles.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex1 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
         int num1 = 0;
         int num2 = 0;
         
         System.out.println("Entre com o primeiro número: ");
         num1 = scan.nextInt();
         
         System.out.println("Entre com o segundo número:");
         num2 = scan.nextInt();
         
      if(num1 > num2){
          
          System.out.println("O maior número entre os 2 é: " + num1);
      }else{
          System.out.println("O maior número entre os dois é: " + num2);
      }
}
         
}