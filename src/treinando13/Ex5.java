/*
Faça um Programa que converta metros para centímetros.
 */

package treinando13;

import java.util.Scanner;


public class Ex5 {

public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    
    int metro = 0;
    int centimetros = 100 ;
    
    System.out.println("Digite a quantidade de metros:");
    metro = scan.nextInt();
    
    System.out.println(metro + " metros equivale a " + centimetros * metro + " centimetros.");
}
}