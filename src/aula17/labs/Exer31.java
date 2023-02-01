/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer31 {
   public static void main(String[] args) {
         //Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         double salario = 1000;  //95
         
         double percentual = 1.5; // 96
         
         salario += (salario/100) * percentual; //96
         
         //DecimalFormat format = new DecimalFormat ("###,###.##"); não funfou, ver depois isso
         
         for ( int i=1997; i<=2015; i++){
             
             percentual *= 2;
             
             salario += (salario/100) * percentual;
             
             System.out.println(i + " = " + salario + " -- " + percentual +  " %");
             
         }
    
}
}