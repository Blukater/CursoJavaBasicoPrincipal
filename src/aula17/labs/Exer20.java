/*
DIZER SE A MEDIA DAS IDADES É DE JOVEM, ADULTO OU IDOSO
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer20 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         System.out.println("Digite a quantidade de idades:");
          int idades = scan.nextInt();
         
         int idade;
         int soma = 0;
         
         
         
      for (int i=0; i<idades; i++) {
          
          System.out.println("Digite a idade da pessoa " + (i + 1));
          idade = scan.nextInt();
          
          soma += idade;
          
          
      }
      
      double media  = soma / idades;
      
      System.out.println("Média de idade: " + media);
      
      if (media >= 0 && media <= 25) {
          System.out.println("Jovem");
      }else if (media >= 26 && media <=60){
          System.out.println("Adulto");
          
      }else  {
          System.out.println("Idoso");
          
          /*loiane escreveu:   }else if (media > 60){
          System.out.println("Idoso");*/
      }
}
}
