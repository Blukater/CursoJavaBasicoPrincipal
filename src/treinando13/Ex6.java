/*
 * Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área.
 */

package treinando13;

import java.util.Scanner;


public class Ex6 {

public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    
    
    double raio = 0;
    double circunferencia = 2 * 3.14;
    
    System.out.println("Dirite o valor do raio de um circulo qualquer:");
    raio = scan.nextDouble();
    
     System.out.println("A área do circulo é: " + raio / circunferencia);
            
            
}
}