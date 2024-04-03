/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.
 */

package treinando17;

import java.util.Locale;
import java.util.Scanner;


public class Ex1 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         double nota = 0;
         
         while (true) {
         System.out.println("Digite uma nota entre 0 a 10;");
         nota = scan.nextDouble();
         
         if (nota <= 10){
             
             System.out.println("Nota válida.");
             break;
         } else {
             
             System.out.println("Valor inválido, digite uma nota correspondente!");
             
         }
         }
}
}
