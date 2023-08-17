/*
Um posto está vendendo combustíveis com a seguinte tabela de
descontos:
. Álcool:
a. até 20 litros, desconto de 3% por litro
b. acima de 20 litros, desconto de 5% por litro
Gasolina:
c. até 20 litros, desconto de 4% por litro
d. acima de 20 litros, desconto de 6% por litro Escreva um
algoritmo que leia o número de litros vendidos, o tipo de
combustível (codificado da seguinte forma: A-álcool, Ggasolina), calcule e imprima o valor a ser pago pelo cliente
sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço
do litro do álcool é R$ 1,90.
 */
package treinando15;

import java.util.Scanner;
import java.util.Locale;

public class Ex26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double litrosVendidos = 0;

        System.out.println("Entre com a quantidade de litros vendidos:");
        litrosVendidos = scan.nextDouble();

        String sigla = "";

        System.out.println("Digite (A) para álcool e (G) para gasolina:");
        sigla = scan.next().toUpperCase(); // Alterado para toUpperCase para aceitar maiúsculas

        double valorFinal = 0;

        switch (sigla) {

            case "A":

                if (litrosVendidos <= 20) {
                    valorFinal = (1.90 - 1.90 * 0.03) * litrosVendidos;
                    System.out.println("O valor a ser pago é: " + valorFinal);
                    System.out.println();
                    System.out.println("Você recebeu desconto de 3%");

                } else if (litrosVendidos > 20) {
                    valorFinal = (1.90 - 1.90 * 0.05) * litrosVendidos;
                    System.out.println("O valor a ser pago é: " + valorFinal);
                    System.out.println();
                    System.out.println("Você recebeu desconto de 5%");
                }

                break;

            case "G":

                if (litrosVendidos <= 20) {
                    valorFinal = (2.50 - 2.50 * 0.04) * litrosVendidos;
                    System.out.println("O valor a ser pago é: " + valorFinal);
                    System.out.println();
                    System.out.println("Você recebeu desconto de 4%");

                } else if (litrosVendidos > 20) {
                    valorFinal = (2.50 - 2.50 * 0.06) * litrosVendidos;
                    System.out.println("O valor a ser pago é: " + valorFinal);
                    System.out.println();
                    System.out.println("Você recebeu desconto de 6%");
                }
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
