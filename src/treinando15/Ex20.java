/*
Faça um Programa para leitura de três notas parciais de um aluno. O
programa deve calcular a média alcançada por aluno e presentar:
. A mensagem "Aprovado", se a média for maior ou igual a 7,
com a respectiva média alcançada;
a. A mensagem "Reprovado", se a média for menor do que 7, com
a respectiva média alcançada;
b. A mensagem "Aprovado com Distinção", se a média for igual a
10.
 */
package treinando15;

import java.util.Locale;
import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double n1 = 0;
        double n2 = 0;
        double n3 = 0;

        System.out.println("Entre com a nota1");
        n1 = scan.nextDouble();

        System.out.println("Entre com a nota2");
        n2 = scan.nextDouble();

        System.out.println("Entre com a nota3");
        n3 = scan.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media >= 7 && media < 10) {

            System.out.println("Você foi aprovado");
        } else if (media < 7) {

            System.out.println("Você foi reprovado!");
        } else if (media == 10) {

            System.out.println("Você foi aprovado com destinção!");
        }

    }
}
