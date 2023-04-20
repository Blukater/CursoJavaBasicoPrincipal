/*
 .Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;


public class Ex11 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
         int num1 = 0;
         int num2 = 0;
         double real = 0;
         
         System.out.println("Digite o primeiro número inteiro:");
         num1 = scan.nextInt();
         
         System.out.println("Digite o segundo número inteiro:");
         num2 = scan.nextInt();
         
         System.out.println("Digite o número real:");
         real = scan.nextDouble();
         
         System.out.println("A - O produto do dobro do primeiro com metade do segundo: " + ((num1 * 2) * num2/2));
         System.out.println("B - A soma do triplo do primeiro com o terceiro: " + (( 3 * num1) + real));
         System.out.println("C - O terceiro elevado ao cubo: " + (real * real * real ));
       
    }
}
