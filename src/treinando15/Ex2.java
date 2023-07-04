/*
Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex2 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
         
         int num = 0;
         
         System.out.println("Entre com um número");
         num = scan.nextInt();
         
         if (num > 0){
             System.out.println( num + " é um número positivo!" );
         }else{
             System.out.println(num + " é um número negativo!");
         }
}
}
