/*
 Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int quantNum = 0;
        int num = 0;
        int numMaior = Integer.MIN_VALUE;
        int numMenor = Integer.MAX_VALUE;
        int soma = 0;

        System.out.println("Digite a quantidade de números que serão digitados:");
        quantNum = scan.nextInt();

        for (int i = 1; i <= quantNum; i++) {
            System.out.println("Digite um número:");
            num = scan.nextInt();

            if (num > numMaior) {
                numMaior = num;

            }
            if (num < numMenor) {
                numMenor = num;

            }
            soma = numMenor + numMaior;
        }

        System.out.println();

        System.out.println("O número maior é o: " + numMaior);
        System.out.println("O número menor é o: " + numMenor);
        System.out.println("A soma dos 2 números é: " + soma);
    }
}
