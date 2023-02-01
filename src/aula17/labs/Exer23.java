/*
FAZER TABELA DE PREÇOS DE PRODUTOS DE 1 A 50, SENDO CADA ITEM R$1.99
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer23 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         System.out.println("Lojas Quase Dois - Tabela de Preços");
                        
         
         for (int i=1; i <= 50; i++){
             
             System.out.println(i + " - R$ " +  (1.99 * i ));
                 
         }
                              
        
                      }    
}

