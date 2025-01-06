/*
Encontrar números primos é uma tarefa difícil. Faça um programa que
gera uma lista dos números primos existentes entre 1 e um número
inteiro informado pelo usuário.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex35 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int n = 0;

        System.out.println("Digite um número inteiro:");
        n = scan.nextInt();

        System.out.println("Números primos entre 1 e " + n + ":");

        for (int num = 2; num <= n; num++) {
            boolean primo = true;
            int raiz = (int) Math.sqrt(num);

           for (int i = 2; i <= raiz; i++) {
             
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(num + " ");
            }
        }

    }
}
