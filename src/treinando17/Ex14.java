/*
 Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int num =0;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o número inteiro " + i);
            num = scan.nextInt();

            if (num % 2 == 0) {

                pares++;
            } else {

                impares++;
            }

        }
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
