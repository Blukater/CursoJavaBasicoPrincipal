/*
Numa eleição existem três candidatos. Faça um programa que peça o
número total de eleitores. Peça para cada eleitor votar e ao final
mostrar o número de votos de cada candidato.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int quantEleitores = 0;
        int voto = 0;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        System.out.println("Digite a quantidade de eleitores que irão votar:");
        quantEleitores = scan.nextInt();

        int i = 1;
        while (i <= quantEleitores) {
            System.out.println("Eleitor " + i + " vota no candidato (1, 2 ou 3):");
            voto = scan.nextInt();

            if (voto == 1) {
                candidato1++;
                System.out.println("Voto para o candidato1.");
            } else if (voto == 2) {
                candidato2++;
                System.out.println("Voto para o candidato2.");
            } else if (voto == 3) {
                candidato3++;
                System.out.println("Voto para o candidato3.");
            } else {
                System.out.println("O candidato votado não existe! Tente novamente.");
                continue; // Reinicia o loop para o mesmo eleitor
            }

            i++; // Incrementa o contador de eleitores somente se o voto foi válido
        }

        System.out.println();
        System.out.println("Quantidade de votos do candidato1: " + candidato1);
        System.out.println("Quantidade de votos do candidato2: " + candidato2);
        System.out.println("Quantidade de votos do candidato3: " + candidato3);
        System.out.println();

        if (candidato1 > candidato2 && candidato1 > candidato3) {
            System.out.println("Candidato1 vence as eleições!");
        } else if (candidato2 > candidato1 && candidato2 > candidato3) {
            System.out.println("Candidato2 vence as eleições!");
        } else if (candidato3 > candidato1 && candidato3 > candidato2) {
            System.out.println("Candidato3 vence as eleições!");
        } else {
            System.out.println("Eleições empatadas!");
        }

        scan.close();
    }
}
