/*
 Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
o fatorial várias vezes e limitando o fatorial a números inteiros positivos
e menores que 16.
 */

package treinando17;

import java.util.Locale;
import java.util.Scanner;


public class Ex20 {

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            int num = 0;
            int fatorial = 1;

            // Solicitar um número ao usuário
            System.out.println("Digite um número inteiro positivo menor que 16 (ou digite -1 para sair):");
            num = scan.nextInt();

            // Verificar se o usuário deseja sair
            if (num == -1) {
                System.out.println("Saindo do programa...");
                break;
            }

            // Verificar se o número está dentro do intervalo permitido
            if (num < 0 || num >= 16) {
                System.out.println("Número inválido. Tente novamente.");
                continue;
            }

            // Calcular o fatorial
            System.out.print(num + "! = ");
            for (int i = num; i > 0; i--) {
                fatorial *= i;
                if (i == 1) {
                    System.out.print(1);
                } else {
                    System.out.print(i + " * ");
                }
            }

            // Exibir o resultado final
            System.out.println(" = " + fatorial);
            System.out.println();
        }
        
        scan.close(); // O scan.close() fecha o scanner para liberar recursos ao final do programa.
    }
}








