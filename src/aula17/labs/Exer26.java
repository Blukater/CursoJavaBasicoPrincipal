/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer26 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
    System.out.println("Digite o número inteiro a ser fatorado:");
         int num = scan.nextInt();
        
         System.out.println("Fatorial de " + num);
         
         System.out.print(num + "! = ");
                         
            int fatorial = 1; 
            for (int i=num; i>1; i--){
                    fatorial *= i;
                    System.out.print(i + " . ");
                   
                }
            
                 System.out.print("1 = " + fatorial);
                 
          
         }
}


