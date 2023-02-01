/*
 Faça um programa que peça um número e então mostre a mensagemO NÚMERO INFORMADO FOI (NÚMERO);
 */
package aula13.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um número inteiro:");
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);
    }
}
