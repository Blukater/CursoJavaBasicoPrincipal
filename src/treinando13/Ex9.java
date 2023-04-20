/*
 Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;


public class Ex9 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         double f = 0;
         double c = 0;
         
          System.out.println("Digite a temperatura em Fahrenheit:");
          f = scan.nextDouble();
         
          c = (5 * (f-32) / 9); 
          System.out.println("Para " + f + " graus Fahrenheit, temos " + c + " graus celsius");


        
}
}