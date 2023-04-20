/*
Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;


public class Ex10 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
        double c = 0;
        double f = 0;
        
        System.out.println("Digite a temperatura em celsius:");
        c = scan.nextDouble();
        
         f = (c * 9/5) + 32;
        System.out.println("Para " + c + " graus celsios equivale a " + f + " em Fahrenheit");
      
}
}