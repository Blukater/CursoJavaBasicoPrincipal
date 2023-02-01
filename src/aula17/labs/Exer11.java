/*
 soma de todos os números entre num1 e num2
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer11 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         int num1;
         int num2;
         int soma = 0;
         
         System.out.println("Digite o primeiro número");
         num1 = scan.nextInt();
         
         System.out.println("Digite o segundo número");
         num2 = scan.nextInt();
         
         for (int i = num1; i <= num2; i++ ){
             soma += i;
}
         System.out.println("Soma: " + soma);
         
         
         
}

}

