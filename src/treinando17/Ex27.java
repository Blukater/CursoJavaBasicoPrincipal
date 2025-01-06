/*
 Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para
cada turma. As turmas não podem ter mais de 40 alunos.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        while (true) {  // Loop externo para reiniciar o processo desde o início

            int quantTurmas = 0;
            int limitAlunos = 40;
            int quantAlunos = 0;
            int somaAlunos = 0;

            System.out.println("Digite a quantidade de turmas: ");
            quantTurmas = scan.nextInt();

            boolean entradaValida = true;  // Variável para verificar se todas as entradas foram válidas

            for (int i = 1; i <= quantTurmas; i++) {
                System.out.println("Digite a quantidade de alunos na turma " + (i < 10 ? "0" + i : i) + ": ");
                quantAlunos = scan.nextInt();

                if (quantAlunos > limitAlunos) {
                    System.out.println("Quantidade de alunos está acima do limite de 40, reiniciando o processo...\n");
                    entradaValida = false;
                    break;  // Sai do loop for para reiniciar o processo
                }

                somaAlunos += quantAlunos;
            }

            if (!entradaValida) {
                continue;  // Retorna ao início do loop while para reiniciar o processo
            }

            double media = (double) somaAlunos / quantTurmas;

            System.out.println();
            System.out.println("O número total de alunos é: " + somaAlunos);
            System.out.println("O número médio de alunos por turma é: " + media);
            System.out.println();

            System.out.println("Deseja reiniciar o processo? (sim/não)");
            scan.nextLine();  // Consumir a nova linha
            String resposta = scan.nextLine();

            if (!resposta.equalsIgnoreCase("sim")) {
                break;  // Sai do loop externo e termina o programa se a resposta for diferente de "sim"
            }
        }

        scan.close();  // Fecha o scanner ao final do programa
    }
}



/* ou para reiniciar ser pedir a quantidade de turmas

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int quantTurmas = 0;
        int limitAlunos = 40;
        int quantAlunos = 0;
        int somaAlunos = 0;

        System.out.println("Digite a quantidade de turmas: ");
        quantTurmas = scan.nextInt();

        for (int i = 1; i <= quantTurmas; i++) {
            while (true) {  // Loop para garantir a entrada válida de alunos
                if (i < 10) {
                    System.out.println("Digite a quantidade de alunos na turma 0" + i + ": ");
                } else {
                    System.out.println("Digite a quantidade de alunos na turma " + i + ": ");
                }
                quantAlunos = scan.nextInt();

                if (quantAlunos <= limitAlunos) {
                    somaAlunos += quantAlunos;
                    break;  // Saímos do loop se a entrada for válida
                } else {
                    System.out.println("Quantidade de alunos está acima do limite, digite novamente!");
                }
            }
        }

        double media = (double) somaAlunos / quantTurmas;

        System.out.println();
        System.out.println("O número total de alunos é: " + somaAlunos);
        System.out.println("O número médio de alunos por turma é: " + media);
    }
}


*/
