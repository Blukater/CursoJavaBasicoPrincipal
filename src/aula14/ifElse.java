/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula14;

import java.util.Locale;
import java.util.Scanner;


public class ifElse {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
        /* System.out.println("Entre com a idade:");
         
         int idade = scan.nextInt();
         
         if (idade >= 18){
         
             System.out.println("É maior de idade.");
             
         }        
         
          else                                                           
             System.out.println("Não é maior de idade.");
         }
    }*/
         
    
        System.out.println("Entre com o preço do item");
        double valor = scan. nextDouble();
        
   if (valor <= 10){
       System.out.println("Está bem barato, pode comprar.");
   } else if (valor > 10 && valor < 15){  
       System.out.println("Você vai pedir desconto.");
   } else if(valor >= 15 && valor <= 17){
        System.out.println("Você vai pesquisar mais.");
    } else { // quer dizer que o valor é >= 17
        System.out.println("Muito caro, não compre.");
    }
     
    }
}
   


