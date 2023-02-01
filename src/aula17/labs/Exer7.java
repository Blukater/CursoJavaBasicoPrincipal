/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer7 {
 public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
         int numero;
         int maior = Integer. MIN_VALUE;
         
         for (int i = 0; i < 5; i++ ){
         
         System.out.println("Digite o numero: ");
         numero = scan.nextInt();
               
             if (numero > maior){
                    maior = numero;
                    System.out.println("O número maior mudou: " + maior);
}
}

 
 System.out.println("O maior número digitado foi: " + maior);
}
}