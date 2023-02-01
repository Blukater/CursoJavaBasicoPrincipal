/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer11 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
         int [] vetorA = new int [10];
        
         
         for (int i=0; i<vetorA.length; i++) {
             
         System.out.println("Entre com um número inteiro da posição " + i);
         
         vetorA [i] = scan.nextInt(); //vetor a na posição i vai receber o valor q o usuário entrar
      
         
         }
         
          int qtdPares = 0;
          for (int i=0; i<vetorA.length; i++) {
              if (vetorA[i] % 2 == 0) {
                  qtdPares++;
                  
              }
}

System.out.print("Vetor A = ");

for (int i=0; i<vetorA.length; i++) {
    System.out.print(vetorA[i] + " ");
   
}
    System.out.println();
    
    System.out.println("Qtd números pares: " + qtdPares);

}
}