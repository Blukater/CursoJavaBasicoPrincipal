/*
Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;


public class Ex12 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         double altura = 0;
         
         System.out.println("Digite sua altura: ");
         altura = scan.nextDouble();
         
         System.out.println("De acordo com sus altura seu peso ideal é: " + ((72.7 * altura) - 58));
}
}