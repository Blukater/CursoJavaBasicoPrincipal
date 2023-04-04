/*
 Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número].
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;


public class Ex2 {
    
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        int num = 0;
        
        System.out.println("Entre com um número inteiro: ");
        num = scan.nextInt();
        
        System.out.println("O número digitado foi: " + num);
        
    }

}
