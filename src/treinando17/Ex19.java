/*
 Altere o programa anterior para que ele aceite apenas números entre 0
e 1000.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            int numMaior = Integer.MIN_VALUE;
            int numMenor = Integer.MAX_VALUE;
            int soma = 0;
            int quantNum = 0;

            System.out.println("Digite a quantidade de números que serão digitados:");
            quantNum = scan.nextInt();

            boolean dentroDoIntervalo = true;

            for (int i = 1; i <= quantNum; i++) {
                System.out.println("Digite um número:");
                int num = scan.nextInt();

                if (num > 0 && num <= 1000) {
                    if (num > numMaior) {
                        numMaior = num;
                    }
                    if (num < numMenor) {
                        numMenor = num;
                    }
                    soma += num;
                } else {
                    System.out.println("Esse número é maior do que 1000, recomece");
                    dentroDoIntervalo = false;
                    break; // Sai do loop for
                }
            }

            if (dentroDoIntervalo) {
                System.out.println();
                System.out.println("O número maior é o: " + numMaior);
                System.out.println("O número menor é o: " + numMenor);
                System.out.println("A soma dos números é: " + soma);
                System.out.println();
                break; // Sai do loop while
            }
        }
    }
}
