/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula15.labs;

import java.util.Locale;
import java.util.Scanner;

//Loiane fez a questão"incompleta", mas no caso dela se delta for 0 x1 e x2 ficam iguais, seria na minha o x.


public class Exer16 {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o valor a:");
        int a = scan.nextInt();

         if(a == 0){
             
             System.out.println("A equação não é de segunda grau, o programa será encerrado");
             
             return;
         }
         
        System.out.println("Digite o valor b:");
        int b = scan.nextInt();
        System.out.println("Digite o valor c:");
        int c = scan.nextInt();
        
        double delta = (b*b - (4*a*c));
       if (delta < 0){
           System.out.println("delta negativo");
       }else{
           
           System.out.println("delta: " + delta);
           
           double x1 = ((-b) + Math.sqrt (delta)) / (2*a);
           double x2 = ((-b) - Math.sqrt (delta)) / (2*a);
           
           System.out.println("x1 = " + x1);
           System.out.println("x2 = " + x2);
       }
}
}