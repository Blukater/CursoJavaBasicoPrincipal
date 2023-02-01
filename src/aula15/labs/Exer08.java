/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro preço");
        double preco1 = scan.nextDouble();

        System.out.println("Digite o segundo preço");
        double preco2 = scan.nextDouble();

        System.out.println("Digite o terceiro preço");
        double preco3 = scan.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("VocÊ deve comprar com o primeiro preço: " + preco1);
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Você deve comprar com o segundo preço: " + preco2);
        } else {
            System.out.println("Você deve comprar com o terceiro preço: " + preco3);
        }

    }
}
