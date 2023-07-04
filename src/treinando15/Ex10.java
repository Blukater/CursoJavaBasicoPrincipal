/*
 .Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex10 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         System.out.println("Em que turno você estuda? Escreva uma das letras (M, V ou N)");
         String letra = scan.next();
         
         if(letra.equalsIgnoreCase("m")){
             System.out.println("Bom dia!");
         }else if(letra.equalsIgnoreCase("V")){
             System.out.println("Boa tarde!");
         }else if(letra.equalsIgnoreCase("n")){
             System.out.println("Boa noite!");
         }else{
         System.out.println("Inválido, recomece!"); 
         
         }
}
}


//COM SWITCH


     /*System.out.println("Em que turno você estuda ( digite M, T ou N):");
        String turno = scan.next();
        
        
        switch (turno) {
            case "m": 
            case "M": System.out.println("Bom dial"); break;
            case "t": 
            case "T": System.out.println("boa tarde"); break;
            case "n": 
            case "N": System.out.println("Boa noite"); break;
            default: System.out.println("Valor inválido");
            
}
}
}*/