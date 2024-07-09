/*
 A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int n = 0;
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.print("Digine um número para a sequência de Fibonacci: ");
        n = scan.nextInt();

        System.out.println("Série de Fibonacci até o " + n + "º termo:");
        System.out.print(primeiroTermo + ", " + segundoTermo);

        for (int i = 2; i < n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;

        }

    }

}
