/*
 Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário
 */

package aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer07 {

    public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o tamanho do lado de um  quadrado");
        double lado = scan.nextDouble();
        
        double area = Math.pow(lado, 2);
        
        System.out.println(" A área do quadrado é " + area);
        System.out.println(" A área do quadrado multipliacando por 2 é " + area * 2);
        
    }
}
