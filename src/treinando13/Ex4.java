/*
 Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */

package treinando13;

import java.util.Scanner;


public class Ex4 {

public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    double nota1 = 0;
    double nota2 = 0;
    double nota3 = 0;
    double nota4 = 0;
    
    
    System.out.println("Digite a nota 1:");
    nota1 = scan.nextDouble();
    System.out.println("Digite a nota 2:");
    nota2 = scan.nextDouble();
    System.out.println("Digite a nota 3:");
    nota3 = scan.nextDouble();
    System.out.println("Digite a nota 4:");
    nota4 = scan.nextDouble();
    
    System.out.println();
    
    double media = (nota1 + nota2 + nota3 + nota4) / 4;
    System.out.println("A média das notas é: " + media);
    
    
}
}
