/*
Faça um programa que leia uma quantidade indeterminada de
números positivos e conte quantos deles estão nos seguintes
intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados
deverá terminar quando for lido um número negativo.
 */

package treinando17;

import java.util.Locale;
import java.util.Scanner;


public class Ex42 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int intervalo0_25 = 0;
        int intervalo26_50 = 0;
        int intervalo51_75 = 0;
        int intervalo76_100 = 0;
        int numPositivo = 0;

        while (true) {
            System.out.println("Digite um número positivo entre 1 e 100:");
            numPositivo = scan.nextInt();

            if (numPositivo < 0) {
                System.out.println("Esse número é negativo, saindo...");
                break;

            } else if (numPositivo >= 0 && numPositivo <= 25) {
                intervalo0_25++;

            } else if (numPositivo >= 26 && numPositivo <= 50) {
                intervalo26_50++;

            } else if (numPositivo >= 51 && numPositivo <= 75) {
                intervalo51_75++;

            } else if (numPositivo >= 76 && numPositivo <= 100) {
                intervalo76_100++;
            }

        }
        System.out.println("Quantidade de números positivos no intervalo 0-25: " + intervalo0_25);
        System.out.println("Quantidade de números positivos no intervalo 26-50: " + intervalo26_50);
        System.out.println("Quantidade de números positivos no intervalo 51-75: " + intervalo51_75);
        System.out.println("Quantidade de números positivos no intervalo 76-100: " + intervalo76_100);
        System.out.println();
        System.out.println("Classificação concluída! Obrigado por usar o programa.");
    }
}


