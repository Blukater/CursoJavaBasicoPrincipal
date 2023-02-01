/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer14 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int num;
         int pares = 0;
         int impares = 0;
         
         for (int i=0; i<10; i++){
             System.out.println("Digite um número inteiro");
             num = scan.nextInt();
             
             if (num % 2 == 0){
                 pares++;
             }else{
                 impares++;
                 
             }
         }
         System.out.println("Pares: " + pares);
         System.out.println("Impares: " + impares);
         
         
         
         
}
}
