/*
 Faça um Programa para um caixa eletrônico. O programa deverá
perguntar ao usuário a valor do saque e depois informar quantas notas
de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5,
10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600
reais. O programa não deve se preocupar com a quantidade de notas
existentes na máquina.
. Exemplo 1: Para sacar a quantia de 256 reais, o programa
fornece duas notas de 100, uma nota de 50, uma nota de 5 e
uma nota de 1;
a. Exemplo 2: Para sacar a quantia de 399 reais, o programa
fornece três notas de 100, uma nota de 50, quatro notas de 10,
uma nota de 5 e quatro notas de 1.
 */
package treinando15;

import java.util.Locale;
import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int valorSaque = 0;

        while (true) {
            System.out.println("Entre com o valor do saque:");
            valorSaque = scan.nextInt();

            int nota_1 = 0;
            int nota_5 = 0;
            int nota_10 = 0;
            int nota_50 = 0;
            int nota_100 = 0;

            if (valorSaque <= 600 && valorSaque >= 10) {

                nota_100 = valorSaque / 100;
                valorSaque = valorSaque % 100;

                nota_50 = valorSaque / 50;
                valorSaque = valorSaque % 50;

                nota_10 = valorSaque / 10;
                valorSaque = valorSaque % 10;

                nota_5 = valorSaque / 5;
                valorSaque = valorSaque % 5;

                nota_1 = valorSaque;

                System.out.println("Sacou " + nota_100 + " nota de 100 " + nota_50 + " nota de 50 " + nota_10 + " nota de 10 " + nota_5 + " nota de 5 " + nota_1 + " nota de 1.");
                break;
            } else {

                System.out.println("Não pode sacar valor menor que 10 nem maior que 600.");
            }

        }
    }
}


/*FORMA 2

 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int valorSaque = 0;

        while (true) {
            System.out.println("Entre com o valor do saque:");
            valorSaque = scan.nextInt();

            int nota_100 = valorSaque / 100;
            valorSaque %= 100;

            int nota_50 = valorSaque / 50;
            valorSaque %= 50;

            int nota_10 = valorSaque / 10;
            valorSaque %= 10;

            int nota_5 = valorSaque / 5;
            int nota_1 = valorSaque % 5;

            System.out.println("Sacou " + nota_100 + " nota(s) de 100, " + nota_50 + " nota(s) de 50, " + nota_10 + " nota(s) de 10, " + nota_5 + " nota(s) de 5 e " + nota_1 + " nota(s) de 1.");
            break;
        }
    }
}*/
