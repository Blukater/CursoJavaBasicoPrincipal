/*
 Faça um programa que receba o valor de uma dívida e mostre uma
tabela com os seguintes dados: valor da dívida, valor dos juros,
quantidade de parcelas e valor da parcela.
o Os juros e a quantidade de parcelas seguem a tabela abaixo:
Quantidade de Parcelas % de Juros sobre o valor inicial da dívida
1 0
3 10
6 15
9 20
12 25
Exemplo de saída do programa:
Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela
R$ 1.000,00 0 1 R$ 1.000,00
R$ 1.100,00 100 3 R$ 366,00
R$ 1.150,00 150 6 R$ 191,67
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex41 {

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        // Entrada do valor da dívida
        System.out.println("Digite o valor da dívida:");
        double divida = scan.nextDouble();

        // Definição das opções de parcelamento e juros
        int[] parcelas = {1, 3, 6, 9, 12};
        double[] juros = {0, 10, 15, 20, 25};

        // Cabeçalho da tabela
        System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");
        System.out.println("--------------------------------------------------------------------------");

        // Construção da tabela
        for (int i = 0; i < parcelas.length; i++) {
            int numParcelas = parcelas[i];
            double percentualJuros = juros[i];

            // Cálculo dos juros e do valor da parcela
            double valorJuros = (divida * percentualJuros) / 100;
            double valorTotal = divida + valorJuros;
            double valorParcela = valorTotal / numParcelas;

            // Exibição formatada dos dados
            System.out.printf("R$ %.2f         | R$ %.2f        | %d                    | R$ %.2f%n",
                    valorTotal, valorJuros, numParcelas, valorParcela);
        }

        scan.close();
    }
}
