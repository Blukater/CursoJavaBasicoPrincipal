/*
 *arumar uma forma quando o usuário digitar arrado ele peça para digitar o que foi solicitado corretamente
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer30 {
    
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
 
          System.out.println("Digite um número para gerar tabuada");
                 int num = scan.nextInt();
         
         boolean invalido = true;
         int numFinal, numInicio;
         
         do { /*esse do, while foi feito para que quando o usuário digitar errado, até 
que o usuário digite o q foi solicitado*/
                
                 System.out.println("Digite o início ta tabuada");
                  numInicio = scan.nextInt();

                 System.out.println("Digite o final da tabuada");
                 numFinal = scan.nextInt();
                 
         if (numFinal > numInicio){
             invalido = false;
 
 }
             
         } while (invalido);
       
    
        
                   
         System.out.println("Tabuada de " + num + ":");
         System.out.println("Começar por: " + numInicio);
         System.out.println("Terminar em: " + numFinal);
         System.out.println(); // pula 1 linha
         
         for (int i=numInicio; i<=numFinal; i++){
             System.out.println(num + " x "  + i + " = " + (num+i));
             
         
                    }
   }
   }
    
       
         
         
         
         
         
         
         
         

