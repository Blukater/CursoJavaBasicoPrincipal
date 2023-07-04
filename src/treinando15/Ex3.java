/*
Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex3 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
       
        
       /*System.out.println("Digite M ou F: ");
    String input = scan.next();
    
    if (input.equalsIgnoreCase("f")){
        
        System.out.println("Feminino");
    }else if(input.equalsIgnoreCase("M")){
        System.out.println("masculino");
    }else{
        System.out.println("Digitou a letra errada!");
        return;
    }*/
       
        boolean inputValido = false;

        while (!inputValido) {
            System.out.println("Digite M ou F: ");
            String input = scan.next();

            if (input.equalsIgnoreCase("f")) {
                System.out.println("Feminino");
                inputValido = true;
            } else if (input.equalsIgnoreCase("M")) {
                System.out.println("Masculino");
                inputValido = true;
            } else {
                System.out.println("Digite uma letra válida (M ou F)");
            }
        }

    }
}
