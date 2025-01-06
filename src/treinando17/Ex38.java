/*
 Um funcionário de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
. Esse funcionário foi contratado em 1995, com salário inicial de
R$ 1.000,00;
a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b. A partir de 1997 (inclusive), os aumentos salariais sempre
correspondem ao dobro do percentual do ano anterior. Faça um
programa que determine o salário atual desse funcionário. Após
concluir isto, altere o programa permitindo que o usuário digite o
salário inicial do funcionário.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex38 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double salarioBase = 1000;
        double porcentagemBase = 1.5 / 100;
        double salarioAtual = salarioBase;
        int anoSolicitado = 0;

        salarioAtual += salarioAtual * porcentagemBase;

        System.out.println("Qual ano que você deseja verificar a partir de 1997:");
        anoSolicitado = scan.nextInt();

        for (int i = 1997; i <= anoSolicitado; i++) {

            porcentagemBase *= 2;
            salarioAtual += salarioAtual * porcentagemBase;

        }

        System.out.println("O salário em " + anoSolicitado + " é: " + salarioAtual);
    }
}
