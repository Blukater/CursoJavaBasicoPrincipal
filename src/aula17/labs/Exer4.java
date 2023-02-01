/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer4 {
 public static void main(String[] args) {
         //Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int popA = 80000; //pode ser double tbém
         int popB = 200000;
         int cont = 0;
         
      
        while (popA <= popB){
         
       popA += (popA/100) * 3;
       popB += (popB/100) * 1.5;
        cont++; 
 }
 
 System.out.println("População A: " + popA);
 System.out.println("População B: " + popB);
 System.out.println("Quantidade de anos para a população A chegar na B: : " + cont);
}
}