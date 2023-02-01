/*
 igual ao Exer18
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer28 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
                         
                  
          System.out.println("Digite um número");
                 int num = scan.nextInt();
                 
                 boolean primo =  true;
                 
                 
                 for (int i=2; i<num; i++){
                            
                     if (num % i == 0){
                         System.out.println("Não é primo - divisível por: " + i);
                         primo = false;
                    

        }

          }                 
                 if (primo){
                 System.out.println("É número primo");
     }
}
}
