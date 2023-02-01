/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer12 {
public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite a altura da pessoa");
        double altura = scan.nextDouble();
        
        
        double pesoIdeal = (72.7 * altura) - 58;
        
        System.out.println("Seu peso ideal é " + pesoIdeal);
}
}