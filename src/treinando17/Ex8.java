/*
 *Faça um programa que leia 5 números e informe a soma e a média
dos números.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double num = 0;
        double soma = 0;
        double media = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o número:");
            num = scan.nextInt();
            
            soma += num;
        }
        
        media = soma / 5;
        System.out.println();
        System.out.println("A soma dos números: " + soma);
        System.out.println("A média nos números é: " + media);
    }
}
