/*
 Faça um programa que pergunte quando você ganha por hora e o número de horas trablhadas no mês. Calcule e mostre o total do seu salário no referido mês
 */

package aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer08 {
 public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        
             
        
        System.out.println("Quanto você ganha por hora?");
        double valorhora = scan.nextDouble();
        
        System.out.println("Quantos horas você trabalha por mês?");
        double valormes = scan.nextDouble();
        
        double salario = valorhora * valormes;
        System.out.println("Seu salário no mês è:" + salario);
        
 }
        
        
}
