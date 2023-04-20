/*
 .Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).
 */

package treinando13;

import java.util.Locale;
import java.util.Scanner;


public class Ex18 {

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        
        double quantMb = 0;
        double velMbps = 0;
        
        
        System.out.println("Entre com a quantidade em megabytes do arquivo");
        quantMb = scan.nextDouble();
        
        System.out.println("Entre com a velocidade em Mbps");
        velMbps = scan.nextDouble();
        
        
        double tempoDownload = (quantMb / 1000) * 60;
        System.out.println("O tempo para baixar o arquivo é de: " + tempoDownload);
}
}
