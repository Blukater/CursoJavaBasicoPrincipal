/*
Faça um Programa que peça um número e informe se o número é
inteiro ou decimal. Dica: utilize uma função de arredondamento.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex23 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         double numero = 0;
         
         System.out.println("Entre com um número:");
         numero = scan.nextDouble();
         
         double arredondamento = Math.round(numero);
         
         if(numero ==  arredondamento){
             
             System.out.println("Esse número é inteiro");
             
             
         }else{
             System.out.println("esse número é decimal");
         }
}
}
