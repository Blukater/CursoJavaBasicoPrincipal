/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package paraTestes;

import java.util.Locale;
import java.util.Scanner;


public class Prog1 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         System.out.println("Loja Quase Dois - Tabela de Preços, item: R$1,99");
                        
         
         for (int i=1; i <= 50; i++){
             
             System.out.println(i + " - R$ " +  (1.99 * i ));
                 
         }
                              
        
                      }    
}


