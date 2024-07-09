/*
Faça um programa que calcule o mostre a média aritmética de N
notas.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int quantNotas = 0;
        double n = 0;
        double soma = 0;
        
        System.out.println("Digite a quantIdade de notas que irá digitar: ");
        quantNotas = scan.nextInt();

        for (int i = 1; i <= quantNotas; i++) {

            // Formatar o número da nota para exibir com dois dígitos
            //String numeroFormatado = String.format("%02d", i);
            //System.out.println("Digite a nota " + numeroFormatado + " :"); 
            if (i < 10) {
                System.out.println("Digite a nota 0" + i + ": ");
            } else {
                System.out.println("Digite a nota " + i + ": ");

            }
            n = scan.nextDouble();
            soma += n;
        }
        
        double media = soma / quantNotas;
        
        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média das notas é: " + media);
    }
    
}
