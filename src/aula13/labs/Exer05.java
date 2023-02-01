/*
 Faça um programa que converta metros para centímetros
 */

package aula13.labs;


import java.util.Locale;
import java.util.Scanner;



public class Exer05 {

    public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println(" Digite a quantidade de metros");
        double metros = scan.nextDouble();
        
        double centimetros = metros * 100;
        System.out.println(metros + " metros equivale a " + centimetros + " cm");
        
        
        
        
        
        

        
    }
}
