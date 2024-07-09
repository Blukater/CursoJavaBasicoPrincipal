/*
Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int num = 0;
        int fatorial = 1;

        System.out.println("Digite um número inteiro, vamos calcular seu fatorial:");
        num = scan.nextInt();

        System.out.print(num + "! = ");

        for (int i = num; i > 0; i--) {
            fatorial *= i;
            if (i == 1) {
                System.out.print(1);
            } else {
                System.out.print(i + " * ");
            }
        }

        System.out.println(" = " + fatorial);

    }
}


/*com while


public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int num = 0;
        int fatorial = 1;

        System.out.println("Digite um número inteiro, vamos calcular seu fatorial:");
        num = scan.nextInt();
        
        System.out.print(num + "! = ");

        int i = num;
        while (i > 0) {
            fatorial *= i;
            System.out.print(i);
            if (i != 1) {
                System.out.print(" * ");
            }
            i--;
        }

        System.out.println(" = " + fatorial);
    }
}





*/