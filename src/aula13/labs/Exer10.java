/*
 Faça um programa que peça a temperatura em graus Celsius, transforme e mostre a temperatura em graus Farenheit
 */

package aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer10 {
    
        public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        
         System.out.println("Digite a temperatura em Celsios");
        
        double c = scan.nextDouble();
        
        double f = (c * 1.8) + 32;
        System.out.println("A temperatura em Celsios é " + c + " C e a temperatuar em Farenheit è " +  f + " F");
        
        
        }

}
