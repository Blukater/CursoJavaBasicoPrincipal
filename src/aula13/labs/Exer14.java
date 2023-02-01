/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer14 {
public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        
             System.out.println("Digite o tamanho do arquivo:");
             double arquivo = scan.nextDouble();
             
             
          System.out.println("Digite a velocidade da internet:");
             double velocidade = scan.nextDouble();
             
             double tempo = arquivo / velocidade;
             
             System.out.println("Tempo de download é: "  +  tempo);
             
   
}
}