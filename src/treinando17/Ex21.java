/*
 Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int num = 0;

        System.out.println("Entre com um número inteiro:");
        num = scan.nextInt();

        if (num <= 1) {
            System.out.println("Não é primo.");
        } else {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {

                    System.out.println("Não é primo.");
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println("É primo");

            }
        }
    }
}
