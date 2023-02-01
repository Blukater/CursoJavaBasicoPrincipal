/*
 Faça um programa que peça o raio de um círculo, calcule e mostre sua área
 */
package aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer06 {

     public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        
        
        System.out.println("O raio de um circulo mede:");
        double raio = scan.nextDouble();
         
         
         double area = Math.PI * Math.pow (raio, 2);
         System.out.println("A área de um círculo com  " + raio + " tem a área " + area);
         
        
        
        
        
        
}
}