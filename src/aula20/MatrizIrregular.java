/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula20;

import java.util.Locale;
import java.util.Scanner;


public class MatrizIrregular {

    public static void main(String[] args) {
        System.out.println("Entre com o número de possoas que serão entrevistadas: ");
        
       Scanner scan = new Scanner(System.in).useLocale(Locale.US);
          int numEntrevistados = scan.nextInt();
        
          String [] [] nomesFilhos = new String[numEntrevistados] [];
          
          for (int i=0; i<nomesFilhos.length; i++) {
              
              System.out.println("Entre com a quantidade de filhos: ");
              int qtdFilhos = scan.nextInt();
              
              nomesFilhos [i] = new String[qtdFilhos];
              
              for (int j=0; j<nomesFilhos [i]. length; j++){
                  
                  System.out.println("Digite a no me do filho " + (j + 1 ));
                  
                  nomesFilhos [i] [j] = scan.next();
                  
                  
                  
            }

        }
             for (int i=0; i<nomesFilhos.length; i++) {
                 
                 System.out.println(" Pessoa " + i + " tem " + nomesFilhos [i]. length + " filho " );
                 
                 for (int j=0; j<nomesFilhos [i]. length; j++){
                     System.out.println(nomesFilhos [i] [j]);
                     
            }
        }

    }

}
