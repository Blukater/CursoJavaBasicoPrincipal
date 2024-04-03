/*
Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação.


"Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento."

 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double popA = 0;
        double popB = 0;
        double taxaCrescimentoAnoA = 0;
        double taxaCrescimentoAnoB = 0;

        

        while (true) {
         double cont = 0;
            
            System.out.println("Ente com o número da população inicial A:");
            popA = scan.nextDouble();

            System.out.println("Digite a taxa de crescimento anual da população A:");
            taxaCrescimentoAnoA = scan.nextDouble();

            System.out.println("Ente com o número da população inicial B:");
            popB = scan.nextDouble();

            System.out.println("Digite a taxa de crescimento anual da população B:");
            taxaCrescimentoAnoB = scan.nextDouble();

            while (popA <= popB) {
                popA += (popA / 100) * taxaCrescimentoAnoA;
                popB += (popB / 100) * taxaCrescimentoAnoB;
                cont++;
            }
            System.out.println();

            System.out.println("População A: " + popA);
            System.out.println("População B: " + popB);
            System.out.println("O número de anos para a população A igualar ou ultrapassar a população B é: " + cont);

        }

    }
}
