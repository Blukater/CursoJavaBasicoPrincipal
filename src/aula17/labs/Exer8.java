/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer8 {
 public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         
          int num;
          double media;
          int soma = 0;
                 
                
         for (int i = 0; i < 5; i++ ){
                      
             System.out.println("Digite um número:");
             num = scan.nextInt();
             
             soma += num;
             
              }//SE VOCÊ RETIRAR A CHAVE DAQUI E COLOCAR LA EM BAIXO, PELO MENOS TESTANDO DEU O MESMO RESULTADO, MAS CONTAVA, FAZIA A SOMA E MEDIA EM TEMPO REAL
             media = soma /  5;
            
             System.out.println("Soma " + soma);
             System.out.println("Média " + media);
                 
                 
                   
         }
 
  }
