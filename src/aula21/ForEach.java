/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula21;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class ForEach {
    

public static void main(String[] args) {
 Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Exemplo usando o for apenas:");
 
 int [] notas = new int [10];
 
 Random random = new Random();
 
 for (int i=0; i<notas.length; i++){
    
    notas[i] = random.nextInt(10);
    
}
 
 for (int i=0; i<notas.length; i++) {
     
     System.out.println(notas[i]);
 }
    System.out.println("Exemplo usando o For Eatch:");
    
    for (int nota : notas){
        System.out.println(nota);
    }
 
    //EXEMPLO 2 ARRAY MULTI
    
    System.out.println("Exemplo com arrays multi dimencionais:");
    double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
                
                for (double [] notasAluno : notasAlunos){
                    for (double nota : notasAluno){
                         System.out.print(nota + " ");
                      
                    }
                   
                    System.out.println("");
                }
 
}
}
