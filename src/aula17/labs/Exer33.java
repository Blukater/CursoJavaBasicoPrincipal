/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer33 {

 public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         System.out.println("Digite o valor de n:");
         
         int n = scan.nextInt();
         double soma = 0;
         
         
         for (int i=1,  j=1; i<=n; i++,  j +=2){ //podemos ver que podemos usar mais de uma variável no for
               
             System.out.print(i  +  "/" + j + " + "); //fazer com que o + do fim não apareça
                          
             soma += i/j;
                
         }
         
     System.out.println("\nSoma = " + soma );
}
}