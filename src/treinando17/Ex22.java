/*
 Altere o programa de cálculo dos números primos, informando, caso o
número não seja primo, por quais número ele é divisível.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Entre com um número inteiro:");
        int num = scan.nextInt();

        if (num <= 1) {
            System.out.println("Não é primo.");
        } else {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    System.out.println("Não é primo.");
                    primo = false;

                    System.out.println("Números divisíveis por " + num + ":");
                    for (int j = 2; j < num; j++) {
                        if (num % j == 0) {
                            System.out.print(j + " ");
                        }
                    }
                    System.out.println();
                    break;
                }
            }

            if (primo) {
                System.out.println("É primo");
            }
        }
    }
}
    

