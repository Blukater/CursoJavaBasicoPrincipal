/*
 .Faça um Programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
galões de 3,6 litros, que custam R$ 25,00.
o Informe ao usuário as quantidades de tinta a serem compradas
e os respectivos preços em 3 situações:
o comprar apenas latas de 18 litros;
o comprar apenas galões de 3,6 litros;
o misturar latas e galões, de forma que o preço seja o
menor. Acrescente 10% de folga e sempre arredonde os
valores para cima, isto é, considere latas cheias.
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        /*double metros = 0;

        System.out.println("Entre com a quantidade em metros da área a ser pintada:");
        metros = scan.nextDouble();

        double litroTintabalde = metros / 6;
        double baldeTinta = Math.ceil(litroTintabalde / 18); //Math.ceil(xxxxx) arredonda pra mais
        double valorBalde = 80;
        double totalTinta = baldeTinta * 80;

        double litroTintagalao = metros / 6;
        double galao = Math.ceil(litroTintagalao / 3.6); //Math.ceil(xxxxx) arredonda pra mais
        double valorGalao = 25;
        double totalGalao = galao * 25;

        double litroComDez = (metros / 6.0) * 1.1;
        int baldeT = (int) Math.ceil(litroComDez / 18.0);
        int galaoTinta = (int) Math.round((litroComDez - (baldeT * 18.0)) / 3.6);
        if (galaoTinta < 0) {
            galaoTinta = 0;
        }
        double totalBalde = baldeT * 80.0;
        double totalG = galaoTinta * 25.0;
        double totalMisto = totalBalde + totalG;

        System.out.println("SITUAÇÃO 1:");
        System.out.println();
        System.out.println("Precisamos de " + litroTintabalde + " litros de tinta.");
        System.out.println("Precisamos de " + baldeTinta + " balde(s) de tinta.");
        System.out.println("Seriam gastos no total R$ " + totalTinta + " em tinta para pintar a parede.");

        System.out.println();

        System.out.println("SITUAÇÃO 2:");
        System.out.println();
        System.out.println("Precisamos de " + litroTintagalao + " litros de tinta.");
        System.out.println("Precisamos de " + galao + " galão(ões) de tinta.");
        System.out.println("Seriam gastos no total R$ " + totalGalao + " em galão(ões) de tinta para pintar a parede.");

        System.out.println();

        System.out.println("SITUAÇÃO 3:");
        System.out.println("Precisamos de " + litroComDez + " litros de tinta.");
        System.out.println("Precisamos de " + baldeT + " balde(s) e " + galaoTinta + " galão(ões) de tinta para pintar a parede.");
        System.out.println("Total a pagar entre baldes e galões: R$ " + totalMisto);

    }
}*/
        
        
        //FORMA CORRETA E MAIS COMPLEXA PARA IDENTIFICAR O GALÃO E IR PRO MAIS , EX: 3 METROS
        //NA SITUAÇÃO 3
        //SE FOR PRA FAZER NO PE DA LETRA TEM Q ACHAR UMA FORMULA COM SWITCH CASE
        // UMA SOLUÇÃO É COLOCAR FORA DA CHAVE E VERIFICAR
        
        double metros = 0;
        System.out.println("Entre com a quantidade em metros da área a ser pintada:");
        metros = scan.nextDouble();
        
        
       
        
        
        
   double litroComDez = (metros / 6.0) * 1.1;
int baldeT = (int) Math.ceil(litroComDez / 18.0);
double totalBalde = baldeT * 80.0;

int galaoTinta = (int) Math.ceil(litroComDez / 3.6);
double totalGalao = galaoTinta * 25.0;

int balde = (int) Math.floor(litroComDez / 18.0);
int galao = (int) Math.ceil((litroComDez - (balde * 18.0)) / 3.6);
double totalMisto = (balde * 80.0) + (galao * 25.0);

if (totalMisto < totalBalde && totalMisto < totalGalao) {
    System.out.println("SITUAÇÃO 3:");
    System.out.println("Precisamos de " + litroComDez + " de tinta");
    System.out.println("Precisamos de " + balde + " baldes e " + galao + " galões de tinta para pintar a parede");
    System.out.println("Total a pagar entre baldes e galões: " + totalMisto);
} else if (totalBalde < totalGalao) {
    System.out.println("SITUAÇÃO 3:");
    System.out.println("Precisamos de " + litroComDez + " de tinta");
    System.out.println("Precisamos de " + baldeT + " balde(s) e 0 galão(ões) de tinta para pintar a parede.");
    System.out.println("Total a pagar: R$ " + totalBalde);
} else {
    System.out.println("SITUAÇÃO 3:");
    System.out.println("Precisamos de " + litroComDez + " de tinta");
    System.out.println("Precisamos de 0 balde(s) e " + galaoTinta + " galão(ões) de tinta para pintar a parede.");
    System.out.println("Total a pagar: R$ " + totalGalao);
}
    }
}