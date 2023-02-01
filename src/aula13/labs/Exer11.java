/*
Faça um programa que peça dois números inteiros...
 */

package aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer11 {

     public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);


System.out.println("Digite o primeiro numero inteiro:");        
int numero1 = scan.nextInt();


System.out.println("Digite o segundo numero inteiro:");        
int numero2 = scan.nextInt();

System.out.println("Digite um numero real:");        
double numeroreal = scan.nextDouble();

/*int a = (numero1 * 2) * (numero2 / 2);
System.out.println("O dobro do primeiro número é " + a);  

double b = numero1 * 3 + numeroreal;
System.out.println("A soma do triplo do primeiro com o terceiro " + b);      

double c = Math.pow(numeroreal, 3);
System.out.println("O dobro do primeiro número é " + c);      ou*/
         
         
         int a = (numero1 * 2) * (numero2 / 2);
         double b = numero1 * 3 + numeroreal;
         double c = Math.pow(numeroreal, 3);
         
         System.out.println("O dobro do primeiro número é " + a);  
         System.out.println("A soma do triplo do primeiro com o terceiro " + b); 
         System.out.println("O dobro do primeiro número é " + c);
         
         
         



                
    
     } 
}
