/*
Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total.
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;


public class Ex16 {
    
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        double metros = 0;
        
        
                
        System.out.println("Entre com a quantidade em metros da área a ser pintada:");
        metros = scan.nextDouble();
        
        
        double litroTinta = metros / 3;
        double baldeTinta = litroTinta / 18; //Math.ceil(xxxxx) arredonda pra mais
        double valorBalde = 80;
        double total = baldeTinta * 80;
        
        System.out.println("Precisamos de " + litroTinta + " litros de tinta.");
         System.out.println("Precisamos de " + baldeTinta + " balde de tinta.");
         System.out.println("Foi gasto no total R$ " + total + " em tinta para pintar a parede." );
        
      
        
        
}
}
