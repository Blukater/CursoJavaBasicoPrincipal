/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17;


public class formando {
    public static void main(String[] args) {
        /*FOR COM UMA VARIÁVEL*/
        for (int i = 0; i < 5; i++){
        System.out.println("i tem valor: " + i);
    }
        /*FOR COM UMA VARIÁVEL*/
     for (int i = 5; i > 0; i--){
         System.out.println("i tem valor: " + i);
     }
     
     /*FOR COM MAIS DE 1 VARIÁVEL*/
     for (int i = 0, j = 10; i < j; i++, j--){
         System.out.println("i = " + i + "; j = " + j);
     }
    /*COM PARTES AUSENTES*/
    int count = 0;
    for (; count < 10;) {
        System.out.println("count tem valor: " + count);
        count += 2;
        
        /*O QUE É IGUAL A*/
    }
    for (int cont = 0; cont < 10; cont += 2){
        System.out.println("cont tem valor: " + cont);
        
    
    /*LOOP INFINITO (NÃO FAZER PQ TEM Q TIRAR A TOMADA DO COMPUTADOR).*/
    /*for (; ; );*/    
}
    
    /*SOMA*/
    
    int soma = 0;
    for (int i = 1; i < 5; soma += i++);
    System.out.println("O valor da soma é: " + soma);
}
}


