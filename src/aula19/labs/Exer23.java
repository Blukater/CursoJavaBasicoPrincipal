/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer23 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int [] vetorA = new int [10];
       
         for (int i=0; i < vetorA.length; i++){
             
              System.out.println("Digite um número inteiro: " + i);
                   vetorA[i] = scan.nextInt();
            
             
             if (vetorA[i] % 2 != 0) {
               
                 
                 System.out.println("Existem números impares, o programa precisa ser encerrado");
                 
                 break;

}
}
}
}
