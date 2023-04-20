/*
 Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso.
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double altura = 0;
        double pesoIdeal = 0;
        char sexo;

        System.out.println("Entre com sua altura: ");
        altura = scan.nextDouble();

        System.out.println("Entre com sua sexualidade digitando M ou F");
        sexo = scan.next().charAt(0);

        if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;

            System.out.println("Você está dentro do peso ideal" + altura);

            System.out.println("Sexo: " + sexo);

            System.out.println("Seu peso ideal é: " + pesoIdeal);

        } else if (sexo == 'M') {

            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Você está dentro do peso ideal" + altura);

            System.out.println("Sexo: " + sexo);

            System.out.println("Seu peso ideal é: " + pesoIdeal);
        } else {
            System.out.println("Sexo inválido!");
           return;

        }
        System.out.println();
        
        
        double pesoAtual = 0;

        System.out.println("Digite seu peso atual: ");
        pesoAtual = scan.nextDouble();

        if (pesoIdeal < pesoAtual) {

            System.out.println("Você está fora do peso e você deve emagrecer: " + (pesoAtual - pesoIdeal));

        } else {

            System.out.println("Seu peso está bom, mas não pode emagrecer muito, para ficar ótimo e com o peso certinho você precisa de mais: " + (pesoIdeal - pesoAtual));
        }
    }

}
    
