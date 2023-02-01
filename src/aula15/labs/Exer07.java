package aula15.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer07 {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = scan.nextInt();
         System.out.println("Digite o terceiro número inteiro:");
       int num3 = scan.nextInt();
        
        
        if (num1  > num2 && num1 > num3){
            System.out.println("Número 1 é o maior número inteiro de todos: " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("Número 2 o maior número inteiro de todos: " + num2);
        }else if (num3 > num1 && num3 > num2){
            System.out.println("Número 3 é o maior número inteiro de todos: " + num3);
        }else if (num1 == num2){
         System.out.println("Temos números iguais, dessa forma não vai dar para avaliar.");
        } else if (num1 == num3){
        System.out.println("Temos números iguais, dessa forma não vai dar para avaliar.");
        } else if (num2 == num3){
        System.out.println("Temos números iguais, dessa forma não vai dar para avaliar."); 
        }

            
            
        if (num1 < num2 && num1 < num3){
            System.out.println("Número 1 é o menor número inteiro de todos: " + num1);
        }else if (num2 < num1 && num2 < num3){
            System.out.println("Número 2 o menor número inteiro de todos: " + num2);
        }else if (num3 < num1 && num3 < num2){
            System.out.println("Número 3 é o menor número inteiro de todos: " + num3);
          } else if (num1 == num2){
         System.out.println("Temos números iguais, dessa forma não vai dar para avaliar.");
        } else if (num1 == num3){
        System.out.println("Temos números iguais, dessa forma não vai dar para avaliar.");
        } else if (num2 == num3){
        System.out.println("Temos números iguais, dessa forma não vai dar para avaliar.");
        }            
}
}
       
        
        


