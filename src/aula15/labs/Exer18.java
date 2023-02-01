/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula15.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer18 {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite um número:");
        int num = scan.nextInt();
        
        if (num % 2 == 0){ /*resto da divisão por 2 for 0*/
            System.out.println("É um número par.");
        }else{
            System.out.println("É um número impar.");
        }
}
}