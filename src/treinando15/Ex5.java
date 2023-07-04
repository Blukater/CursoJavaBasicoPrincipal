/*
Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex5 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         double nota1 = 0;
         double nota2 = 0;
        
         
         System.out.println("Entre com a primeira nota:");
         nota1 = scan.nextDouble();
         
         System.out.println("Entre com a segunda nota:");
         nota2 = scan.nextDouble();
         
          double media = (nota1 + nota2)/2;
          
         if(media >= 7 && media < 10){
             
             System.out.println("Aluno foi aprovado!");
             
         }else if (media < 7){
                     
             System.out.println("Aluno foi reprovado!");      
          
         }else if (media == 10) {
      
             System.out.println("Aluno foi aprovado com destinção!");
         }
         
}
}
