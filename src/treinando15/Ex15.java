/*
Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex15 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         double lado1, lado2, lado3 = 0;
         
         System.out.println("Ente com o primeiro lado do triângulo:");
         lado1 = scan.nextDouble();
         
          System.out.println("Ente com o segundo lado do triângulo:");
         lado2 = scan.nextDouble();
         
          System.out.println("Ente com o terceiro lado do triângulo:");
         lado3 = scan.nextDouble();
         
         if (lado1 == lado2 && lado1 == lado2 && lado2 == lado3){
             System.out.println("esse triângulo é equilátero.");
           }else if (lado1 == lado2){
             System.out.println("Esse triângulo é isósceles.");
         }else if (lado1 != lado2 && lado1 != lado2 && lado2 != lado3){
             System.out.println("Esse triângulo é escaleno.");
         }
         
}
}
