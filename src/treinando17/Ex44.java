/*
Em uma eleição presidencial existem quatro candidatos. Os votos são
informados por meio de código. Os códigos utilizados são:
o 1, 2, 3, 4 - Votos para os respectivos candidatos
o (você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
o 5 - Voto Nulo
o 6 - Voto em Branco
Faça um programa que calcule e mostre:
o O total de votos para cada candidato;
o O total de votos nulos;
o O total de votos em branco;
o A percentagem de votos nulos sobre o total de votos;
o A percentagem de votos em branco sobre o total de votos. Para
finalizar o conjunto de votos tem-se o valor zero.
 */

package treinando17;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex44 {

    int codigoCand;
    String nomeCand;

    Ex44(int codigoCand, String nomeCand) {
        this.codigoCand = codigoCand;
        this.nomeCand = nomeCand;
    }

    @Override
    public String toString() {
        return codigoCand + " - " + nomeCand;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        ArrayList<Ex44> candidatos = new ArrayList<>();
        candidatos.add(new Ex44(1, "José"));
        candidatos.add(new Ex44(2, "Antonio"));
        candidatos.add(new Ex44(3, "Bruno"));
        candidatos.add(new Ex44(4, "Carlos"));

        int votosNulo = 0;
        int votosBranco = 0;
        int votosValidos = 0;
        int[] votosCandidatos = new int[candidatos.size()];

        System.out.println("Lista de candidatos:");
        for (Ex44 cand : candidatos) {
            System.out.println(cand);
        }
        System.out.println("5 - Nulo");
        System.out.println("6 - Branco");

        while (true) {
            System.out.println("Digite seu voto de 1 a 6 (ou 0 para sair):");
            int voto = scan.nextInt();

            if (voto == 0) {
                System.out.println("Votação finalizada.");
                break;
            }

            if (voto < 1 || voto > 6) {
                System.out.println("Voto inválido!");
                continue;
            }

            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos[voto - 1]++;
                    votosValidos++;
                    break;
                case 5:
                    votosNulo++;
                    break;
                case 6:
                    votosBranco++;
                    break;
            }
        }

        int totalVotos = votosNulo + votosBranco + votosValidos;

        System.out.println("\nResultado da votação:");
        System.out.println();
        System.out.println("Votos válidos: " + votosValidos);
        System.out.println();
        for (int i = 0; i < candidatos.size(); i++) {
            System.out.println(candidatos.get(i).nomeCand + ": " + votosCandidatos[i] + " votos");
        }

        System.out.println("Votos Nulos: " + votosNulo);
        System.out.println("Votos em Branco: " + votosBranco);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", (votosNulo * 100.0 / totalVotos));
        System.out.printf("Percentual de votos em branco: %.2f%%\n", (votosBranco * 100.0 / totalVotos));
    }
}

