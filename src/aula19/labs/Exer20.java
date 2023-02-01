/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer20 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         double [] vetorA = new double [20];
         double cotacao;
         
         System.out.println("Entre com a cotação:");
         cotacao = scan.nextDouble();
         
         for (int i=0; i<vetorA.length; i++){
             vetorA[i] = cotacao * (i + 1);
             
         }
         
         System.out.print("vetorA = ");
         for (int i=0; i<vetorA.length; i++){
             System.out.print(vetorA [i] + " " );
         }
         
         System.out.println();
             
             
         }

}
