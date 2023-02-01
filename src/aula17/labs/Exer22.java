/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer22 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         System.out.println("Digite a quantidade de CDs:");
        int cds = scan.nextInt();
         
    
         
         double soma = 0;
         double media;
         double preco;
         
         
         for (int i=1; i <= cds; i++){
                System.out.println("Digite o valor do CD" + i);
          preco = scan.nextInt();    
             
         soma += preco;
         
                }
                
                media = soma / cds;
                
         System.out.println("Valor Total: " + "R$ " + soma + " em CDs");
         System.out.println("Média: " + "R$ " + media + " por CD");
         
         
         
}
}

