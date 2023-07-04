/*
Faça um Programa que leia três números e mostre-os em ordem
decrescente.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex9 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int num1, num2, num3 = 0;
      
         
         System.out.println("Entre com o primeiro número: ");
         num1 = scan.nextInt();
         
          System.out.println("Entre com o segundo número: ");
          num2 = scan.nextInt();
          
           System.out.println("Entre com o terceiro número: ");
         num3  =scan.nextInt();
         
         if(num1 < num2 && num2 < num3 && num3 > num1){
             System.out.println("A ordem decrescente dos números é " + num3 + " - " + num2 + " - " + num1 );
             
         }else if(num1 < num3 && num1 > num2 && num2 < num3){
             System.out.println("A ordem decrescente dos números é " + num3 + " - " + num1 + " - " + num2 );
             
         }else if(num2 > num1 && num2 > num3 && num3 > num1){
             System.out.println("A ordem decrescente dos números é " + num2 + " - " +num3 + " - " + num1 );
         
         } else if(num2 > num1 && num2 > num3 && num3 < num1) { 
              System.out.println("A ordem decrescente dos números é " + num2 + " - " +num1 + " - " + num3 );
              
         }else if (num1 > num2 && num1 > num3 && num3 < num2){
                 System.out.println("A ordem decrescente dos números é " + num1 + " - " +num2 + " - " + num3 );
             
         }else if (num1 > num2 && num1 > num3 && num3 > num2){
                 System.out.println("A ordem decrescente dos números é " + num1 + " - " +num3 + " - " + num2 );
         }
}
}
