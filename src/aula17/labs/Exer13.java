/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer13 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
       
          
         System.out.println("Digite o número base:");
         int base = scan.nextInt();
         
         System.out.println("Digite o número potência:");
         int pot = scan.nextInt();
         
         int resultado = base;
         
for (int i=1; i < pot; i++){
    resultado *= base;
}

    System.out.println("Resultado; "  + resultado);
}
}
         
     