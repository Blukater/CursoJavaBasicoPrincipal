/*
Faça um programa que peça para n pessoas e a sua idade, ao final o
programa devera verificar se a média de idade da turma varia entre 0 e
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
ou idosa, conforme a média calculada.
 */

package treinando17;

import java.util.Locale;
import java.util.Scanner;


public class Ex25 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int numPessoas = 0;
         int idade = 0;
         double soma = 0;
         
         System.out.println("Digite a quantidade de pessoas para o teste: ");
         numPessoas = scan.nextInt();
         
         for(int i=1; i <= numPessoas; i++){
             
             if (i < 10) {
                System.out.println("Digite a nota 0" + i + ": ");
            } else {
                System.out.println("Digite a nota " + i + ": ");

            }
             idade = scan.nextInt();
             soma += idade;
             
         }
         System.out.println();
         
         double media = soma / numPessoas;
         
         if (media <= 25){
             System.out.println("Esa turma é jovem!");
         } else if(media <= 60){
             System.out.println("Essa turma é adulta!");
         }else{
             System.out.println("Essa turma é idosa!");
         }
      
         
}
}
