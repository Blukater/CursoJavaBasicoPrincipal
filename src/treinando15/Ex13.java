/*
Faça um Programa que leia um número e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inválido
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex13 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int dia = 0;
        
       do{  
           
            System.out.println("Digite um número de 1 a 7 corresppondente o dia da semana que deseja:");
         dia = scan.nextInt();
         
         switch(dia){
             
             case 1: System.out.println("Domingo"); break;
             case 2: System.out.println("Segunda"); break;
             case 3: System.out.println("Terça"); break; 
             case 4: System.out.println("Quarta"); break;
             case 5: System.out.println("Quinta"); break;
             case 6: System.out.println("Sexta"); break;
             case 7: System.out.println("Sábado"); break;
             default: System.out.println("Dia Inválido"); 
         }
         }while (dia < 1 || dia > 7);
         
}
}
