/*
 O Hipermercado Tabajara está com uma promoção de carnes que é
imperdível. Confira:
o Até 5 Kg Acima de 5 Kg
o File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
o Picanha R$ 6,90 por Kg R$ 7,80 por Kg
Para atender a todos os clientes, cada cliente poderá levar
apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se compra for
feita no cartão Tabajara o cliente receberá ainda um desconto
de 5% sobre o total a compra. Escreva um programa que peça
o tipo e a quantidade de carne comprada pelo usuário e gere
um cupom fiscal, contendo as informações da compra: tipo e
quantidade de carne, preç
 */
package treinando15;

import java.util.Locale;
import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        String tipo1 = "1 - file duplo";
        String tipo2 = "2 - alcatra";
        String tipo3 = "3 - picanha";

        System.out.println("Digite o tipo da carne:");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int tipo = scan.nextInt();

        double quantidade = 0;

        System.out.println("Digite a quantidade de carne: ");
        quantidade = scan.nextDouble();

        double precoKg = 0;

        switch (tipo) {

            case 1:

                if (quantidade <= 5) {
                    precoKg = 4.9;

                } else if (quantidade > 5) {
                    precoKg = 5.8;

                }

                break;

            case 2:

                if (quantidade <= 5) {
                    precoKg = 5.9;

                } else if (quantidade > 5) {
                    precoKg = 6.8;

                }

                break;

            case 3:

                if (quantidade <= 5) {
                    precoKg = 6.9;

                } else if (quantidade > 5) {
                    precoKg = 7.8;

                }

                break;

        }

        double totalDinheiro = quantidade * precoKg;
        double totalCartao = totalDinheiro - (totalDinheiro * 0.05);

        System.out.println("O pagamento será no dinheiro ou cartão:");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão");
        int formaPagamento = scan.nextInt();

        if (formaPagamento == 1) {

            System.out.println("Valor total em dinheiro a pagar é: " + totalDinheiro);
        } else {

            System.out.println("Valor total  a pagar no cartão com desconto é: " + totalCartao);
        }

    }
}
