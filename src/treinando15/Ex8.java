/*
Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex8 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         double produto1 = 0;
         double produto2 = 0;
         double produto3 = 0;
         
         System.out.println("Entre com o preço do produto1:");
         produto1 = scan.nextDouble();
         
          System.out.println("Entre com o preço do produto2:");
          produto2 = scan.nextDouble();
          
           System.out.println("Entre com o preço do produto3:");
           produto3 = scan.nextDouble();
           
           
           if(produto1 < produto2 && produto1 < produto3){
               System.out.println("Vou comprar esse produto, o 1, pois é mais barato, com preço de: R$ " + produto1);
           }else if(produto2 < produto1 && produto2 < produto3){
               System.out.println("Vou comprar esse produto, o 2, pois é mais barato, com o preço de: R$ " + produto2);
           }else if(produto3 < produto1 && produto3 < produto2){
               System.out.println("Vou comprar esse produto, o 3, pois é mais barato, com o preço de: R$ " + produto3);
               
               
           }
}
}
