/*
Faça um Programa que leia três números e mostre o maior deles.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex6 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Entre com o primeiro número:");
        num1 = scan.nextInt();
        System.out.println("Entre com o segundo número");
        num2 = scan.nextInt();
        System.out.println("Entre com o terceiro número");
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {

            System.out.println("O primeiro número é o maior dos três.");
        } else if (num2 > num1 && num2 > num3) {

            System.out.println("Segundo número é o maior dos très.");
        } else if (num3 > num1 && num3 > num2) {

            System.out.println("O terceiro número é o maior dos três");

        }

    }
}
