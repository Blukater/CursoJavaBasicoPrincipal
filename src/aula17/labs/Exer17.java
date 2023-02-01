/*
calculando fatorial
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer17 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
                           
           
         System.out.println("Digite o número inteiro a ser fatorado:");
         int num = scan.nextInt();
        
         System.out.println(num + "! = " );
                         
            int fatorial = 1; 
                
                for (int i=num; i > 0; i--){
                    fatorial *= i;
                    System.out.println(i);
                }
                
                System.out.println("Resultado: " + fatorial);
         }
}
