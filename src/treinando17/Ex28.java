/*
Faça um programa que calcule o valor total investido por um
colecionador em sua coleção de CDs e o valor médio gasto em cada
um deles. O usuário deverá informar a quantidade de CDs e o valor
para em cada um.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        // Variáveis
        String nome = "";
        int quantCds = 0;
        double valorCd = 0;
        double somaValores = 0;

        // Entrada do nome do usuário
        System.out.println("Qual seu nome?");
        nome = scan.nextLine();

        // Entrada da quantidade de CDs comprados
        System.out.println("Informe a quantidade de CDs que você comprou: ");
        quantCds = scan.nextInt();

        // Loop para coletar o valor de cada CD
        for (int i = 1; i <= quantCds; i++) {
            // Formatação do número do CD (01, 02, etc.)
            System.out.println("Valor do CD " + (i < 10 ? "0" + i : i) + ": ");
            valorCd = scan.nextDouble();

            // Soma dos valores dos CDs
            somaValores += valorCd;
        }

        // Cálculo da média dos valores
        double media = somaValores / quantCds;

        // Saída dos resultados
        System.out.println("A soma dos valores dos CDs é: " + somaValores);
        System.out.println("Você gasta em média: " + media + " por CD.");
    }
    
    
}
