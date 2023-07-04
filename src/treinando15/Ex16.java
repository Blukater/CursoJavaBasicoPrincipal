/*
.Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário;
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex16 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         double a,b,c = 0;
         
         System.out.println("Entre com o valor de a:");
         a = scan.nextDouble();
         
          if(a == 0){
             
             System.out.println("A equação não é de segunda grau, o programa será encerrado");
             
             return;
         }
         
           System.out.println("Entre com o valor de b:");
         b = scan.nextDouble();
         
           System.out.println("Entre com o valor de c:");
         c = scan.nextDouble();
         
         double delta = (b*b - (4*a*c));
         
         if(delta < 0){
             
             System.out.println("A equação não possui números reais.");
         }else if(delta == 0){
             
             System.out.println("Delta: "  + delta);
             
             double x = -b / (2*a);
             
         }else {
             
               System.out.println("delta: " + delta);
           
           double x1 = ((-b) + Math.sqrt (delta)) / (2*a);
           double x2 = ((-b) - Math.sqrt (delta)) / (2*a);
           
           System.out.println("x1 = " + x1);
           System.out.println("x2 = " + x2);
         }
         
        
}
}
