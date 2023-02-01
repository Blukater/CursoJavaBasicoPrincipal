/*
DIZER SE A LETRA É VOGAL OU CONSOANTE
 */
package aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite uma letra:");
        String letra = scan.next();

        /*FORMA 1*/
 /*if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
                || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("Essas letras são vogais;");
        } else {
            System.out.println("Essas letras são consoantes:");
        }

    }
}*/
 /*FORMA 2*/
 
 
 if (letra.length() > 1) {
     System.out.println("Não é uma letra válida.");
 } else {
        switch (letra) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U": System.out.println("Vogal"); break;
            default:    System.out.println("Consoante");
                    
        }
    }
}
}

