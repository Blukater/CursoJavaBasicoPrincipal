/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer05 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int [] vetorA = new int [10];
         int [] vetorB = new int [vetorA.length];

         for (int i=0; i<vetorA.length; i++) {

    System.out.println("Entre com o velor da posição; " + i);
    
       
           vetorA [i] = scan.nextInt();
           
           vetorB [i] = vetorA[i] * i;
           
       }
       
       System.out.println("VetorA = ");
       
            for (int i=0; i<vetorA.length; i++) {
                
                System.out.print(vetorA [i] + " ");
           
        
    }
        System.out.println();
    
         System.out.println("VetorB = ");
         
         for (int i=0; i<vetorA.length; i++) {
    
            System.out.print(vetorB [i] + " ");
    
}
         System.out.println();
}
}

                     
           


