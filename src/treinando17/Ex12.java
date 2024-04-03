/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:
o Tabuada de 5:
o 5 X 1 = 5
o 5 X 2 = 10
o ...
o 5 X 10 = 50
 */

package treinando17;

import java.util.Locale;
import java.util.Scanner;


public class Ex12 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        int numero = 1;
               
        System.out.println("Digite um número entre 1 e 10:");
         numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido. Por favor, digite um número entre 1 e 10.");
        } else {
            System.out.println("Tabuada de " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
        }

          }
}
