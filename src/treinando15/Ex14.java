/*
.Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double nota1, nota2 = 0;

        System.out.println("Entre com a nota 1:");
        nota1 = scan.nextDouble();

        System.out.println("enter com a nota 2:");
        nota2 = scan.nextDouble();

        System.out.println();

        double media = (nota1 + nota2) / 2;
        System.out.println("A média é: " + media);

        System.out.println();
        if (media >= 9) {
            System.out.println(" A - APROVADO");

        } else if (media >= 7.5 && media <= 9) {
            System.out.println("B - APROVADO");

        } else if (media >= 6 && media <= 7.5) {
            System.out.println("C - APROVADO");

        } else if (media >= 4 && media <= 6) {
            System.out.println("D - REPROVADO");

        } else if (media < 4) {
            System.out.println("E - REPROVADO");

        }
    }
}
