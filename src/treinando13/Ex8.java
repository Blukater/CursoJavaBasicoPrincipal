/*
 Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;


public class Ex8 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    
      
         double ganhoHora = 0;
         int horasPorMes = 0;
         
    System.out.println("Quanto você ganha por hora?");
    ganhoHora = scan.nextDouble();
    
    System.out.println("VocÊ trabalha quantas hors por mês? ");
    horasPorMes =  scan.nextInt();
    
    
     double salarioMes = ganhoHora * horasPorMes;
    System.out.println("Meu salário total é: " + salarioMes);
    
    
}


}