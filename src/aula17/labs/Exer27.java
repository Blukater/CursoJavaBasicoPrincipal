/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer27 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         System.out.println("Entre com a quantidadde de temperaturas:");
         int qtdTemperaturas = scan.nextInt();
         
         double temp;
         double soma = 0;
         double menor = Double.MAX_VALUE;
         double maior = Double.MIN_VALUE;
                 
         
         for ( int i=1; i<=qtdTemperaturas; i++){
             
             System.out.println("Entre com a temperatura " + i);
             temp = scan.nextDouble();
             
             soma += temp;
             
             if (temp > maior){
                 maior = temp;
             }
             
             if (temp < menor){
                 menor = temp;
             }
            }   
              System.out.println("Média; " + (soma/qtdTemperaturas));
              System.out.println("Menor temperatura: " + menor);
              System.out.println("Maior temperatura: " + maior);
              
             
       
         
}
}
