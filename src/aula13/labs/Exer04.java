/*
 faça um programa que peça 4 notas bimestrais e mostre a média
 */

package aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer04 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in).useLocale(Locale.US);
        
        System.out.println("Digite a nota1:");
        double nota1 = scan.nextDouble();
        
      
        System.out.println("Digite a nota2:");
         double nota2 = scan.nextDouble();
        
        
        System.out.println("Digite a nota3:");
        double nota3 = scan.nextDouble();
        
        
        System.out.println("Digite a nota4:");
        double nota4 = scan.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das quatro notas é " + media);
        
        
        
     
       
        
        
        
        
        
    }
    
}
