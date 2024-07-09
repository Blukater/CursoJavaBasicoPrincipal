/*
 * Faça um programa que imprima na tela apenas os números ímpares
entre 1 e 50.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int i = 1;

        while (i <= 50) {
            System.out.println(i);
            i += 2;
        }
    }
}
