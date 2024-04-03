/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;

//não repeti o loop
public class Exer5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double popA, popB, taxaA, taxaB;
        int cont = 0;

        popA = lerValorPositivo(scan, "Informe a população A:");
        popB = lerValorPositivo(scan, "Informe a população B:");
        taxaA = lerValorPositivo(scan, "Informe a taxa de crescimento da população A:");
        taxaB = lerValorPositivo(scan, "Informe a taxa de crescimento da população B:");

        while (popA <= popB) {
            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de anos para a população A chegar na B: " + cont + " anos");

    }

    public static double lerValorPositivo(Scanner scan, String mensagem) {
        double valor;
        boolean valido = false;

        do {
            System.out.println(mensagem);
            valor = scan.nextDouble();

            if (valor > 0) {
                valido = true;
            } else {
                System.out.println("Valor inválido. Deve ser maior que 0.");
            }
        } while (!valido);

        return valor;
    }
}

      
      
         
     
