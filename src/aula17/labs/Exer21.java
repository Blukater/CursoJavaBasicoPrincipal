/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer21 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
 
         
         System.out.println("Digite a quantidade de turmas;");
         int numTurmas = scan.nextInt();
         
         
         int numAlunos;
         int soma = 0;
         boolean invalido = true;
         
         for (int i=1; i<=numTurmas; i++){
             
             
             invalido = true;
             
       do{      
             System.out.println("Digite o número de alunos da turma: " + i);
             numAlunos = scan.nextInt();
             
       if (numAlunos <= 40){
                  
                  invalido = false;
       } else {
               System.out.println("Número de alunos inválido, digite novamente:");
       
                          }
        }while(invalido);
             
             soma += numAlunos;
         }
             double media = soma / numTurmas;
                     System.out.println("Média: " + media);
       }
}
