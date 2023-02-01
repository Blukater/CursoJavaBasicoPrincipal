/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula20.labs;


import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exer1 {

  public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US); //não pprecisa dessa classe scan, coloquei por colocar
         
         
         int [] [] numerosAleatorios = new int [4] [4] ;
         
         
             Random numeroRandom = new Random ();  //variável que vai gerar os números ramdom
             
         for (int i=0; i<numerosAleatorios.length; i++) { //iterando (repetir) a matrix
            for (int j=0; j<numerosAleatorios[i].length; j++){ //aray de arays
            
                 numerosAleatorios [i] [j] = numeroRandom.nextInt(100); //começando a atribuir numeros aleatorios, o numero 100 foi uma escolha, e vai degar numeros de 0 a 100
           
                      }

        }

         int maior = 0; //se n soubessemos o valor (100) poderiamos usar o integr.max_value para o maior, se n soubessemos o valor poderiamos usar o integr.min_value para o menor
         int linha = 0;
         int col = 0;
         
           for (int i=0; i<numerosAleatorios.length; i++) { //itera a matriz novamente, poderia até fazer junto, mas loiane preferiu fazer separado
            for (int j=0; j<numerosAleatorios[i].length; j++){
                
                if (numerosAleatorios [i] [j] > maior) {
                    maior = numerosAleatorios [i] [j];
                    linha = i;
                    col = j;
            }
         
    }
}
           
           //isso aqui serve para imprimir a matriz antes de conferir, já que são números randomicos
           
     
           
           
           
           for (int i=0; i<numerosAleatorios.length; i++) { 
      for (int j=0; j<numerosAleatorios[i].length; j++){
          System.out.print(numerosAleatorios [i] [j] + " " ); //aqui imprime os valores na mesma linha
          
          
  }
      
          System.out.println(); //aqui troca de linha quando muda a minha da matriz
      }
      
  //aqui são feitos os outputs
  
           System.out.println("Maior valor = " + maior);
           System.out.println("Linha = " + linha);
           System.out.println("Coluna = " + col);
}
}