/*
. Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex4 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
         System.out.println("Entre com uma letra do alfabeto:");
         String letra= scan.next();
         
         if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
           letra.equalsIgnoreCase("i") ||letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
             
             System.out.println("Você digitou uma vogal!");
           
         }else{
             
             System.out.println("Você digitou uma consoante");
         }
         
}
}


/*FORMA 2 com tolowercase

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Entre com uma letra do alfabeto:");
    String letra = scan.next();
    
    switch(letra.toLowerCase()) {
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
            System.out.println("Você digitou uma vogal!");
            break;
        default:
            System.out.println("Você digitou uma consoante!");
    }
}
*/

/*FORMA 3

public class VerificaVogal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra do alfabeto:");
        String letra = scan.next().toLowerCase();
        String vogais = "a,e,i,o,u";

        if (letra.length() != 1 || !vogais.contains(letra)) {
            System.out.println("Você digitou uma consoante!");
        } else {
            System.out.println("Você digitou uma vogal!");
        }
    }
}
Nessa solução, utilizamos o método toLowerCase() para garantir que a letra digitada seja sempre comparada em minúsculas, e o método contains() para verificar se a string com as vogais contém a letra digitada. Se a letra não for uma vogal, ou se o usuário digitar mais de uma letra, o programa exibirá a mensagem "Você digitou uma consoante!". Caso contrário, será exibida a mensagem "Você digitou uma vogal!".











*/