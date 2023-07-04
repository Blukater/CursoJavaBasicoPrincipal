/*
 Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex17 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int ano = 0;
                 
                System.out.println("Entre com o ano:");
                ano = scan.nextInt();
                
                
                if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
           
                    System.out.println("É um ano bissexto!");
                }else {
                  
                    System.out.println("Não é um ano bissexto!");
                }
                
                
}
}
