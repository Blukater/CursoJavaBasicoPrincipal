/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer10 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int num1;
         int num2;
         
         
         System.out.println("Digite o primeiro número");
         num1 = scan.nextInt();
         
         System.out.println("Digite o segundo número");
         num2 = scan.nextInt();
         
         for (int i = num1; i <= num2; i++ ){
             System.out.println(i);    
}
}

}
