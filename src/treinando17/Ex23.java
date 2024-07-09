/*
 Faça um programa que mostre todos os primos entre 1 e N sendo N
um número inteiro fornecido pelo usuário. O programa deverá mostrar
também o número de divisões que ele executou para encontrar os
números primos. Serão avaliados o funcionamento, o estilo e o número
de testes (divisões) executados.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int n, divisoes = 0;

        System.out.println("Digite um número inteiro:");
        n = scan.nextInt();

        System.out.println("Números primos entre 1 e " + n + ":");

        for (int num = 2; num <= n; num++) {
            boolean primo = true;
            int raiz = (int) Math.sqrt(num);

            for (int i = 2; i <= raiz; i++) {
                divisoes++;
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println("Número de divisões realizadas: " + divisoes);
    }
}