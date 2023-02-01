/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer5 {
 public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
                      
         double popA;
         double popB;
         double taxaA;
         double taxaB;
         double cont = 0;
      
         boolean valido = false;
         
         do{
            System.out.println("Informe a população A:");
         popA = scan.nextDouble();
         
         if (popA > 0){
             valido = true;
         } else{
             System.out.println("População A precisa ser maior que 0");
         }
         } while (!valido);
         
           valido = false;
         
         do{
            System.out.println("Informe a população da população B:");
         popB = scan.nextDouble();
         
         if (popB > 0){
             valido = true;
         } else{
             System.out.println("Populaçõa B precisa ser maior que 0");
         }
         } while (!valido);
         
           valido = false;
         
         do{
            System.out.println("Informe a taxa de crescimento da população A:");
        taxaA = scan.nextDouble();
         
         if (taxaA > 0){
             valido = true;
         } else{
             System.out.println("taxa de crescimento A precisa ser maior que 0");
         }
         } while (!valido);
         
          valido = false;
         
         do{
            System.out.println("Informe a taxa de crescimento B:");
         taxaB = scan.nextDouble();
         
         if (taxaB > 0){
             valido = true;
         } else{
             System.out.println("taxa de crescimento B precisa ser maior que 0");
         }
         } while (!valido);
         
           popA += (popA/100) * taxaA;
       popB += (popB/100) * taxaB;
        cont++;
        
        
 System.out.println("População A: " + popA);
 System.out.println("População B: " + popB);
 System.out.println("Quantidade de anos para a população A chegar na B: : " + cont + " ano");
         }
}

      
      
         
     
