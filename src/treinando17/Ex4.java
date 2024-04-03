/*
Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double popA = 80000;
        double popB = 200000;
        double cont = 0;

        while (popA <= popB) {

            popA += (popA / 100) * 3;
            popB += (popB / 100) * 1.5;
            cont++;

        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("O número de anos para a população A igualar ou ultrapassar a população B é: " + cont);
    }
}
