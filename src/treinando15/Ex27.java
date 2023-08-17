/*
Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Até 5 Kg Acima de 5 Kg
Morango R$ 2,50 por Kg R$ 2,20 por Kg
Maçã R$ 1,80 por Kg R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da
compra ultrapassar R$ 25,00, receberá ainda um desconto de
10% sobre este total. Escreva um algoritmo para ler a
quantidade (em Kg) de morangos e a quantidade (em Kg) de maça
 */
package treinando15;

import java.util.Locale;
import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int quilosMorangos = 0;
        int quilosMacas = 0;

        System.out.println("Entre com a quantidade (em Kg) de morangos:");
        quilosMorangos = scan.nextInt();

        System.out.println("Entre com a quantidade (em Kg) de maças:");
        quilosMacas = scan.nextInt();

        double quilosTotais = quilosMorangos + quilosMacas;
        double precoQuiloMorango = 2.50;
        double precoQuiloMaca = 1.80;
        double valorFinal = (quilosMorangos * precoQuiloMorango) + (quilosMacas * precoQuiloMaca);

        if (quilosTotais <= 5) {

            precoQuiloMorango = 2.50;
            precoQuiloMaca = 1.80;

            System.out.println("Preço final é: " + valorFinal);

        } else if (quilosTotais > 5 && quilosTotais <= 8) {

            precoQuiloMorango = 2.20;
            precoQuiloMaca = 1.50;

            System.out.println("Preço final é: " + valorFinal);

        } else if (quilosTotais >= 8 || valorFinal >= 25){
            
            precoQuiloMorango = 2.20;
            precoQuiloMaca = 1.50;
            
            valorFinal = valorFinal + (valorFinal * 0.10);
            System.out.println("Valor final com mais 10% de desconto é " + valorFinal);
            
        }

    }
}
