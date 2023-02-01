/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula17.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        boolean notaValida = false;

        do {

            System.out.println("Digite uma nota entre 0 e 10:");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("A nota válida é: " + nota);

            } else {
               
           System.out.println("Digite uma nota válida, essa não serve:");
        }
           
    }   while (!notaValida);
    }
}


