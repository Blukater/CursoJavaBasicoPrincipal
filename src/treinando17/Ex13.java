/*
Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.
 */

package treinando17;



import java.util.Locale;
import java.util.Scanner;


public class Ex13 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int base = 0;
         int expoente = 0;
         
         System.out.println("Digite um número para a base:");
         base = scan.nextInt();
         
         System.out.println("Digite o número do expoente:");
         expoente = scan.nextInt();
         
         /*USANDO A FUNÇÃO DE POTÊNCIA
         
         double resultado = Math.pow(base, expoente);
         System.out.println("o resultado é: " + resultado);*/
         
         
         double resultado = base;
         
         for(int i=1; i < expoente; i++){
             resultado *= base;
         }

             System.out.println("O resultado é: " + resultado);
             
             }

}
