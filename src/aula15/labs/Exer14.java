/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula15.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer14 {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite nota parcial 1");
        double nota1 = scan.nextDouble();
         System.out.println("Digite nota parcial 2");
        double nota2 = scan.nextDouble();
     
        
        double media = (nota1 + nota2) / 2;
        
        String aproveitamento = "";
       
        
        
        
        if (media > 9 && media <= 10){
                aproveitamento = "A";
}else if (media >7.5 && media < 9){
                aproveitamento = "B";
}else if (media > 6 && media < 7){
                aproveitamento = "C";
}else if (media >= 4 && media < 6){
                aproveitamento = "D";
}else if ( media < 4 && media >= 0){
                aproveitamento = "E";
                
       
      
               
}
        System.out.println("Nota parcial1:" + nota1);
        System.out.println("Nota parcial2:" + nota2);
        System.out.println("media " + media);
        System.out.println("conceito " + aproveitamento);
        
       switch (aproveitamento){
           
           case "A": 
           case "B": 
           case"C": System.out.println("APROVADO"); break;
           case "D": 
           case "E": System.out.println("REPROVADO"); break;
           
        
       }
}
}
