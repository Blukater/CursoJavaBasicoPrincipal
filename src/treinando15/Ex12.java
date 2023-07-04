/*
Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.
o Desconto do IR:
o Salário Bruto até 900 (inclusive) - isento
o Salário Bruto até 1500 (inclusive) - desconto de 5%
o Salário Bruto até 2500 (inclusive) - desconto de 10%
o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. 
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double valorHora = 0;
        int hTrab = 0;
        int percentual = 0;

        System.out.println("Entre com o valor da hora de trabalho:");
        valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas:");
        hTrab = scan.nextInt();

        double salBruto = valorHora * hTrab;

        if (salBruto <= 900) {
            System.out.println("Funcionário isento de desconto de IR.");
            percentual = 0;
        } else if (salBruto > 900 && salBruto <= 1500) {
            percentual = 5;
            System.out.println("Funcionário teve desconto de IR de: " + percentual);
        } else if (salBruto > 1500 && salBruto <= 2500) {
            percentual = 10;
            System.out.println("Funcionário teve desconto de IR de: " + percentual);
        } else if (salBruto > 2500) {
            percentual = 20;
            System.out.println("Funcionário teve desconto de IR de: " + percentual);

        
            

        }
        
            System.out.println();

            double sindicato = (salBruto / 100) * 3;
            double fgts = (salBruto / 100) * 11;
            double ir = (salBruto / 100) * percentual;
            double inss = (salBruto / 100) * 10;
            double totalDesc = sindicato + ir + inss;
            double salLiquido = salBruto - totalDesc;

            System.out.println();
            
            System.out.println("O salário bruto é: " + salBruto);
            System.out.println("FGTS do mês: " + fgts);
            System.out.println("Valor de Sindicato do mês: (-) " + sindicato);
            System.out.println("Desconto de IR do mês: (-) " + ir);
            System.out.println("Deswconto de INSS do mês: (-) " + inss);
            System.out.println("Total de descontos: (-) " + totalDesc);
            System.out.println("Salário líquido do mês: " + salLiquido);
    }
}
