/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula15.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer22 {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite a quantidade em kg de morango");
        double qtdMorango = scan.nextDouble();
        System.out.println("Digite a quantidade em kg de maça");
        double qtdMaca = scan.nextDouble();
        
        double precoKgMorango = 0;
        if(qtdMorango <= 5){
            precoKgMorango = 2.5;
        }else {
            precoKgMorango = 2.2;
        }
            double precoKgMaca = 0;
            if (qtdMaca <= 5){
                precoKgMaca = 1.8;
            }else{
                 precoKgMaca = 1.5;
            }
           
            double precoTotalMorango = qtdMorango * precoKgMorango;
            double precoTotalMaca = qtdMaca * precoKgMaca;
            
            double precoParcial = precoTotalMorango + precoTotalMaca;
            double precoTotal = precoParcial;
            
        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
            
                     
      }
        System.out.println("Preço total = " + precoTotal);
}
}