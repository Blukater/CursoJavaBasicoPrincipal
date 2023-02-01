/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer24 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         System.out.println("Preço do pão - R$ 0,18");
         System.out.println("Panificadora O pãozinho - tabela de preços");
         
         System.out.println("Digite a quantidade de pães:");
         int qPaes =scan.nextInt();
         
         double precoPao = .18;
         double precoTotal = 0;
         
         for (int i=1; i<=qPaes; i++){
             
             precoTotal = precoPao * qPaes;
             System.out.println("O valor a pagar é R$ " + precoTotal);
             break;
             
         }
         
         
         
         
         
         
}
}

