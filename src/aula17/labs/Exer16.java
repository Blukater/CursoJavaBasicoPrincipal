/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer16 {
public static void main(String[] args) {
         //Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
          int primeiro = 1;
         int segundo = 1;
         int proximo = 0;
         
    System.out.println(primeiro);
    System.out.println(segundo);
         
          while (proximo <= 500){
          proximo = primeiro + segundo;
          primeiro = segundo;
          segundo = proximo;
          
             System.out.println(proximo);
         
}
}
}