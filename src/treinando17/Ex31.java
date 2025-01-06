/*
O Sr. Manoel Joaquim expandiu seus negócios para além dos
negócios de 1,99 e agora possui uma loja de conveniências. Faça um
programa que implemente uma caixa registradora rudimentar. O
programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser
informado pelo operador para indicar o final da compra. O programa
deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo
abaixo:
o Lojas Tabajara
o Produto 1: R$ 2.20
o Produto 2: R$ 5.80
o Produto 3: R$ 0
o Total: R$ 9.00
o Dinheiro: R$ 20.00
o Troco: R$ 11.00
o ...
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            int quantProd = 0;
            double precoProd = 0;
            double somaValores = 0;

            System.out.println("LOJA TABAJARA");

            System.out.println("Quantos produtos você vai registrar?");
            quantProd = scan.nextInt();

            for (int i = 1; i <= quantProd; i++) {
                System.out.println("Preço do produto " + (i < 10 ? "0" + i : i) + ": ");
                precoProd = scan.nextDouble();
                System.out.println();
                somaValores += precoProd;

            }

            System.out.println("Valor total da compra: " + somaValores);
            System.out.println();

            double dinheiro = 0;

            System.out.println("Qual valor forcecido pelo cliente: ");
            dinheiro = scan.nextDouble();
            System.out.println();
            System.out.println("O troco do cliente é: R$ " + (dinheiro - somaValores));
            System.out.println();

            int sairRegistradora = 0;
            System.out.println("Deseja sair da registadora? Se sim digite 0, se quizer continuar registrando tecle qualquer outro número");
            sairRegistradora = scan.nextInt();
// Verificar se o usuário deseja sair
            if (sairRegistradora == 0) {
                System.out.println("Saindo...");
                break;
            } else {
                continue;
            }

        }
    }
}
