/*
João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.
 */

package treinando13;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double peso = 0;
        double pesoPeixeLimite = 50;

        System.out.println("Entre com o peso so peixe: ");
        peso = scan.nextDouble();

        if (peso > pesoPeixeLimite) {

            System.out.println("O peso do peixe é maior do que o limite regulatório.");

        } else {

            System.out.println("Está dentro do limite de peso!");
        }

        double exesso = peso - pesoPeixeLimite;
        double multa = exesso * 4;

        if (peso > pesoPeixeLimite) {

            System.out.println("Exesso de peso: " + exesso + " multa de: " + multa);
        } else {
            System.out.println("Exesso de peso: " + exesso + " multa de: " + multa);

        }

    }
}


/*OUTRA FORMA DE RESOLVER SEM O IF UTILIZANDO O OPERADOR TERNÁRIO  ?

public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    double peso = 0;
    double pesoPeixeLimite = 50;
    
    System.out.println("Entre com o peso do peixe: ");
    peso = scan.nextDouble();
    
    double exesso = (peso > pesoPeixeLimite) ? peso - pesoPeixeLimite : 0;
    double multa = (peso > pesoPeixeLimite) ? exesso * 4 : 0;
    
    System.out.println("Excesso de peso: " + exesso + ". Multa a ser paga: R$" + multa + ".");
}
}*/