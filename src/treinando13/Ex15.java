/*
 Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;


public class Ex15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    
        double valorHora = 0;
        double diasPorMes = 0;
        
    
        System.out.println("Entre com o valor da hora de trabalho:");
        valorHora = scan.nextDouble();
        
        System.out.println("Entre com os dias trabalhados no mês:");
        diasPorMes = scan.nextDouble();

        
        double salario = valorHora * diasPorMes;
        System.out.println("Você recebe o salário bruto de: RS$ " + salario);
        
    double impostoRenda = (salario * 11)/100 ;
    double inss = (salario * 8)/100 ;
    double sindicato = (salario * 5)/100 ;
    double totalDescontos = impostoRenda + inss + sindicato;
    double salarioLiquido = salario - totalDescontos;
    
        System.out.println("Imposto de renda - R$ " + impostoRenda);
        System.out.println("INSS - R$ " + inss);
        System.out.println("Sindicato - R$ " + sindicato);
        System.out.println();
        System.out.println("Todal de impostos " + totalDescontos + " Salário liquido - R$ " + salarioLiquido);

}
}

