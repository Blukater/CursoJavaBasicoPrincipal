/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula20.labs;


import java.util.Locale;
import java.util.Scanner;

public class Exer3 {

  public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
         int [] [] numeros = new int [3] [3];
         
         for (int i=0; i<numeros.length; i++){
             for (int j=0; j<numeros.length; j++){
                 
                 System.out.println("Entre com o valor na posição [" + i + "," + j + "]");
                 numeros [i] [j] = scan.nextInt();
            
          }

      }

         
       int qtdPares = 0;
       int qtdImpares = 0;
         for (int i=0; i<numeros.length; i++){
             for (int j=0; j<numeros.length; j++){
                 
                 
                 if (numeros [i] [j] % 2 == 0){
                     qtdPares++;
                 } else {
                     qtdImpares++;
                     
                 }
            }
        }
         
           for (int i=0; i<numeros.length; i++){
             for (int j=0; j<numeros[i].length; j++){
                 System.out.print(numeros [i] [j] + " ");
             }
             
               System.out.println();
             
           }
               System.out.println("pares = " + qtdPares);
               System.out.println("impares = " + qtdImpares);
    }
}


