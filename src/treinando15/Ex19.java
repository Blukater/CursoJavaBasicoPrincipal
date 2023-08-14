/*
.Faça um Programa que leia um número inteiro menor que 1000 e
imprima a quantidade de centenas, dezenas e unidades do mesmo.
o Observando os termos no plural a colocação do "e", da vírgula
entre outros. Exemplo:
o 326 = 3 centenas, 2 dezenas e 6 unidades
o 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320,
310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 */
package treinando15;

import java.util.Locale;
import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int inteiro = 0;
        while (true) {
            System.out.println("Entre com um número inteiro menor que 1000:");
            inteiro = scan.nextInt();

            int unidade = 0;
            int dezena = 0;
            int centena = 0;

            if (inteiro <= 1000) {

                centena = inteiro / 100;
                dezena = (inteiro / 10) % 10;
                unidade = inteiro % 10;

                System.out.println("Temos " + centena + "  centenas " + dezena + " dezenas e " + unidade + " unidades.");
                break;
            } else {
                System.out.println("Número inválido, reinicie!");

            }

        }
    }
}

//OUTRA ALTERNATIVA
/*int inteiro = 0;
        while (true) {
            System.out.println("Entre com um número inteiro menor que 1000:");
            inteiro = scan.nextInt();

            if (inteiro <= 1000 && inteiro >= 0) {
                break; // Sai do loop se o número for válido
            } else {
                System.out.println("Número inválido, tente novamente!");
            }
        }

        int[] unidades = new int[1];
        int[] dezenas = new int[1];
        int[] centenas = new int[1];

        centenas[0] = inteiro / 100;
        dezenas[0] = (inteiro / 10) % 10;
        unidades[0] = inteiro % 10;

        System.out.println("Temos " + centenas[0] + " centenas, " + dezenas[0] + " dezenas e " + unidades[0] + " unidades.");
    }
}*/
