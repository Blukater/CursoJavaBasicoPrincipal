/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula15.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer12 {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Diga o valor da sua hora de trabalho:");
        double valorHora = scan.nextDouble();
        
        System.out.println("Diga quantas horas você trabalhou no mês:");
        double qtdHoras = scan.nextDouble();
        
        double salarioBruto = valorHora * qtdHoras;
        
        int percentuaIIR = 0;
        
        
       
        if (salarioBruto <= 900){
            percentuaIIR = 0;
        }else if (salarioBruto > 900 && salarioBruto <= 1500){
                        percentuaIIR = 5;
        }else if (salarioBruto > 1500 && salarioBruto <= 2500){
                        percentuaIIR = 10;
        }else if (salarioBruto > 2500){
                        percentuaIIR = 20;  
        }
        double ir = (salarioBruto / 100) * percentuaIIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts =  (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido =  salarioBruto - totalDescontos;
        
        System.out.println("Salario Bruto;  (" + valorHora + " + " + qtdHoras + ") : " + salarioBruto);
        System.out.println("(-) IR (" + percentuaIIR + "%) : " + ir);
        System.out.println("(-) INSS (10%) : " + inss);
        System.out.println("FGTS (11%) : " + fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salário líquido: " + salarioLiquido);
                        }
        
}

