/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula15.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer10 {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
                /*FORMA1             
                
        System.out.println("Em que turno você estuda ( digite M, T ou N)?");
        String letra = scan.next();
        
        if (letra.equalsIgnoreCase ("M")){
            System.out.println("Tenha um bom dia!");
            
        } else if (letra.equalsIgnoreCase ("t")){
            System.out.println("Tenha uma boa tarde!");
            
        }else if (letra.equalsIgnoreCase ("N")){
            System.out.println("Tenha uma boa noite!");
        } else{
            System.out.println("Letra inválida.");
        }
}
}*/
                
                /*SEGUNDA FORMA*/
                
        System.out.println("Em que turno você estuda ( digite M, T ou N):");
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
}
