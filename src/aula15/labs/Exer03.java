/*
VERIFICA SE A LETRA É V OU F, DIZ SE É FEMININO, MASCULIONO OU SEXO INVÁLIDO
 */
package aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite uma letra (F ou M):");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")){
                    System.out.println("F - FEMININO");
        } else if (input.equalsIgnoreCase ("m")){
                   System.out.println("M - MASCULINO");
        } else {
            System.out.println("Sexo inválido!");
        }
            }
        }

    



