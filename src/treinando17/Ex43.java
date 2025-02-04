/*
 O cardápio de uma lanchonete é o seguinte:
o Especificação Código Preço
o Cachorro Quente 100 R$ 1,20
o Bauru Simples 101 R$ 1,30
o Bauru com ovo 102 R$ 1,50
o Hambúrguer 103 R$ 1,20
o Cheeseburguer 104 R$ 1,30
o Refrigerante 105 R$ 1,00
Faça um programa que leia o código dos itens pedidos e as
quantidades desejadas. Calcule e mostre o valor a ser pago por
item (preço * quantidade) e o total geral do pedido. Considere
que o cliente deve informar quando o pedido deve ser
encerrado.
 */

package treinando17;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class Ex43 {
    
    int codigoProduto;
    String nomeProduto;
    double precoProduto;
    
    Ex43(int codigoProduto, String nomeProduto, double precoProduto) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }
    
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        int codigo = 0;
        int quantidade = 0;
        double totalPedido = 0;
        
        ArrayList<Ex43> cardapio = new ArrayList<>();
        
        cardapio.add(new Ex43(100, "Cachorro Quente", 1.20));
        cardapio.add(new Ex43(101, "Bauru Simples", 1.30));
        cardapio.add(new Ex43(102, "Bauru com Ovo", 1.50));
        cardapio.add(new Ex43(103, "Hambúrguer", 1.20));
        cardapio.add(new Ex43(104, "ChesebUrguer", 1.30));
        cardapio.add(new Ex43(105, "Refrigerante", 1.00));

        while (true) {

            System.out.println("Insira o código do produto (ou -1 para finalizar):");
            codigo = scan.nextInt();

            if (codigo == -1) {
                System.out.println("Pedido finalizado.");
                break;

            }

            if (codigo < 100 || codigo > 105) {
                System.out.println("Código inválido!");
                continue;

            }

            System.out.println("Insira a quantidade desejada:");
            quantidade = scan.nextInt();

            Ex43 produtoSelecionado = null;
            for (Ex43 produto : cardapio) {
                if (produto.codigoProduto == codigo) {
                    produtoSelecionado = produto;
                    break;
                }
            }

            if (produtoSelecionado != null) {
                double valorItem = produtoSelecionado.precoProduto * quantidade;
                System.out.printf("Item: %s | Quantidade: %d | Total: R$ %,2f%n",
                        produtoSelecionado.nomeProduto, quantidade, valorItem);

                totalPedido += valorItem;
            }
        }

        System.out.println(String.format("O total do pedido foi: R$ %.2f", totalPedido));
        System.out.println();
        System.out.println("Pagamento realizado, obrigado pela preferência!");
    }

}
