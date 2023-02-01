/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula15.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer21 {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite a quantidade de litros vendidos:");
        double litros = scan.nextDouble();
        
        System.out.println("Digite o tipo de combustível");
        String tipo = scan.next();
        
        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percentualDesconto = 0;
        double total = 0;
        double totalDesconto = 0;
        
if (tipo.equalsIgnoreCase("a")){
    
    if (litros <= 20){
        percentualDesconto = 3;
    }else{
        percentualDesconto = 5;
    }
    total = litros * precoAlc;
    
    
    }else if (tipo.equalsIgnoreCase("g")){
            if (litros <= 20){
            percentualDesconto = 4;
            
            }else{
                percentualDesconto = 6;
                
            }
             total = litros * precoGas;
}        
        
       totalDesconto = total / 100 * percentualDesconto;
       
       double precoAPagar = total - totalDesconto;
       System.out.println("Valor a ser pago: " + precoAPagar);
        
}
}