/*
 * Altere o programa anterior para mostrar no final a soma dos números.
 */

package treinando17;

import java.util.Locale;
import java.util.Scanner;


public class Ex11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int num1 = 0;
        int num2 = 0;
        int soma = 0;

        System.out.println("Digite o primeiro número inteiro:");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        num2 = scan.nextInt();

        System.out.println("Os números que estão no intervalo entre esse dois são:");
        System.out.println();
        for (int i = num1 + 1; i < num2; i++) {

            System.out.println(i);
            soma += i;
        }

        System.out.println();

        System.out.println("A soma nos números dos intervalos são: " + soma);
    }

}

