/*
Faça um programa que peça dois números e emprima a soma
 */

package aula13.labs;

import java.util.Scanner;


public class Exer03 {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
              
        System.out.println("Digite numero1:");
        int numero1 = scan.nextInt();
        System.out.println("Digite numero2:");
        int numero2 = scan.nextInt(); 
        
        int resultado = numero1 + numero2;              
        System.out.println("O resultado da soma foi: " + resultado);
        
          
            
        
    }
}
