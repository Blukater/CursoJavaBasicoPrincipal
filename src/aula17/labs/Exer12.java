/*
 tabuada de +, fazer testes
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer12 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         System.out.println("Entre com o número para gerar a tabuada:");
         int num = scan.nextInt();
         
         
         System.out.println("Tabuada de " + num + ":");
         
         for (int i=1; i<=10; i++){
             System.out.println(num + " + "  + i + " = " + (num+i));
             
         
                 }
}
}
