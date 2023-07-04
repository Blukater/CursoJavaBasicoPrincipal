/*
As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex11 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
                 double salario = 0;
                 int percentual = 0;
                 
                 
        System.out.println("Digite o salário do colaborador: ");
        salario = scan.nextDouble();

      
        
        if (salario <= 280) {
            percentual = 20;
        } else if (salario > 280 && salario <= 700) {
            percentual = 15;
        } else if (salario > 700 && salario <= 1500) {
            percentual = 10;
        } else if (salario > 1500) {
            percentual = 5;
        }
        System.out.println();
        
        double valorAumento = (salario / 100) * percentual;
        double novoSalario = salario + valorAumento;
        
       System.out.println("Salario: " + salario);
       System.out.println("Percentual de aumento: " + percentual);
       System.out.println("Valor do aumento: " + valorAumento);
       System.out.println("Salario atualizado após ajuste: " + novoSalario); 
        
    }
}
