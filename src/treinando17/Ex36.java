/*
Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário, conforme exemplo
abaixo:
o Montar a tabuada de: 5
o Começar por: 4
o Terminar em: 7
o
o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
o 5 X 4 = 20
o 5 X 5 = 25
o 5 X 6 = 30
o 5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor
que o inicial.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex36 {

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int num = 0;
        int tabuadaComeca = 0;
        int tabuadaTermina = 0;
        boolean reiniciar = true;

        while (reiniciar) {  // Loop para reiniciar todo o processo
            System.out.println("Digite um número inteiro entre 1 e 10 para iniciarmos a tabuada:");
            num = scan.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("Número fora do intervalo permitido. Por favor, tente novamente.");
                continue;
            }

            while (true) {
                System.out.println("A tabuada começa no número (No mínimo 1):");
                tabuadaComeca = scan.nextInt();

                if (tabuadaComeca < 1 || tabuadaComeca > 10) {
                    System.out.println("Número fora do intervalo permitido. Por favor, tente novamente.");
                    continue;
                }

                System.out.println("E termina em (até 10):");
                tabuadaTermina = scan.nextInt();

                if (tabuadaTermina < tabuadaComeca || tabuadaTermina > 10) {
                    System.out.println("Número fora do intervalo permitido. Por favor, tente novamente.");
                    continue;
                }

                System.out.println("Tabuada de " + num);
                System.out.println("Entre " + tabuadaComeca + " e " + tabuadaTermina + ":");

                for (int i = tabuadaComeca; i <= tabuadaTermina; i++) {
                    int resultado = num * i;
                    System.out.println(num + " X " + i + " = " + resultado);
                }

                System.out.println("Deseja reiniciar? (Digite '1' para reiniciar ou qualquer outro número para encerrar)");
                int opcao = scan.nextInt();
                if (opcao == 1) {
                    break;  // Sai do loop interno e reinicia o processo desde o início
                } else {
                    reiniciar = false;
                    break;  // Sai do loop externo e encerra o programa
                }
            }
        }
        
        scan.close();  // Fechando o scanner
        System.out.println("Programa encerrado.");
    }
}