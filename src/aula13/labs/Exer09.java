/*
 Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius
 */

package aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer09 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite a temperatura em Farenheit");
        
        double f = scan.nextDouble();
        
        double c = (5 * (f - 32) / 9);
        System.out.println("A temperatura em Farenheit é " + f + " F e a temperatuar em Celsios è " +  c + " C");
        
        
        
        
        
        
    }
}
