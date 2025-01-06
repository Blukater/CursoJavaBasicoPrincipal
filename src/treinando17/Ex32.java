/*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser
conforme o exemplo abaixo:
o Fatorial de: 5
o 5! = 5 . 4 . 3 . 2 . 1 = 120
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int num = 0;
        int fatorial = 1;

        System.out.println("Digite um número inteiro para calculo do fatorial: ");
        num = scan.nextInt();
        System.out.println();
        
        System.out.print("O fatorial de " + num + "! é = ");

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
        
        scan.close();

    }

}
