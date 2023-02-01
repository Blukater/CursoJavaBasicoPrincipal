/*
PEDIR VALOR E MOSTRAR SE O VALOR É POSITIVO OU NEGATIVO
 */

package aula15.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer02 {
    
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);

         
         System.out.println("Digite um valor qualquer:");
         double valor = scan.nextDouble();
         
         if (valor >= 0){
             System.out.println("O valor é positivo: " + valor);
         } else 
             System.out.println("O valor é negativo: " + valor);
}
}