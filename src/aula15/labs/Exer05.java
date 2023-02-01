/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula15.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer05 {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();
        
         System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextDouble();
        
        double media = ((nota1 + nota2) / 2);
        
        
        
         if (media == 10){
       System.out.println("Você foi aprovado com destinção!");
         }else if ((media >= 7)){
       System.out.println("Você foi aprovado.");
     } else{ 
       System.out.println("Você foi reprovado.");
 
   }

}
}