/*
PEDIR 2 NÚMEROS E VER QUAL É O MAIOR
 */
package aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        
        /*VERSÃO 1*/
        
        /* System.out.println("Digite número 1:");
        double num1 = scan.nextDouble();

        System.out.println("Digite número 2:");
        double num2 = scan.nextDouble();

        if (num1 > num2) {
            System.out.println("Numero 1 é maior que o número 2");
        }
        if (num1 < num2) {
            System.out.println("Número 2 é maior que número 1");
        } else {
            System.out.println("Os dois números são iguais");
        }
    }
}*/

 /*FORMA MAIS SIMPLIFICADA E O Q REALMENTE A QUESTÃO PEDE*/
 
        System.out.println("Digite número 1:");
        int num1 = scan.nextInt();

        System.out.println("Digite número 2:");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O número 1 é maior " + num1);
        } else {
            System.out.println("O número 2 é maior: " + num2);

        }
    }
}
