/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro lado");
        int lado1 = scan.nextInt();
        System.out.println("Digite o segundo lado");
        int lado2 = scan.nextInt();
        System.out.println("Digite o terceiro lado");
        int lado3 = scan.nextInt();

        if (((lado1 + lado2) > lado3)
                || ((lado1 + lado3) > lado2)
                || ((lado2 + lado3) > lado1)) {

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("é um triângulo equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("é um triângulo escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("é um triângulo escaleno");

            } else {
                System.out.println("Não é um triângulo.");
            }

        }
    }
}
