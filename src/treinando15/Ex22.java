/*
Faça um Programa que peça um número inteiro e determine se ele é
par ou impar. Dica: utilize o operador módulo (resto da divisão).
 */
package treinando15;

import java.util.Locale;
import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int numero = 0;

        System.out.println("Entre com um número inteiro:");
        numero = scan.nextInt();

        if (numero % 2 != 0) {

            System.out.println("Esse número é impar!");
        } else {

            System.out.println("Esse número é par!");
        }

    }
}
