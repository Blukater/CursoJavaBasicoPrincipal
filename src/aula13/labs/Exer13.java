package aula13.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer13 {
 public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in).useLocale(Locale.US);
        
             
        
        System.out.println("Quanto você ganha por hora?");
        double valorhora = scan.nextDouble();
        
        System.out.println("Quantos horas você trabalha por mês?");
        double valormes = scan.nextDouble();
        
        double salarioBruto = valorhora * valormes;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double impostoDeRenda = (salarioBruto / 100) * 11; 
        double totalDeDescontos = inss + sindicato + impostoDeRenda;
        double salarioLiquido = salarioBruto - totalDeDescontos;  
             
        System.out.println("Seu salário bruto no mês è:" + salarioBruto);
        System.out.println("Você paga de INSS:" + inss);
        System.out.println("Você paga de SINDICATO:" + sindicato);
        System.out.println("Eu imposto de renda do ano:" + impostoDeRenda);
        System.out.println("O total de descontos no mê é:" + totalDeDescontos);
        System.out.println("Seu salário liquido no mês è:" + salarioLiquido);
        
        
    
        
 }
        
        
}
