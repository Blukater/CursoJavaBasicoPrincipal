/*
 Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.
 */

package treinando13;

import java.util.Scanner;


public class Ex7 {

public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    
    double ladoQuadrado = 0;
       
    System.out.println("Digite o lado de um quadrado:");
    ladoQuadrado = scan.nextDouble();
    
    double areaQuadrado = ladoQuadrado * ladoQuadrado; //pode usar também Math.pow(lado, 2);
    
     System.out.println("A área do quadrado mede: " + areaQuadrado);
    System.out.println("A área do quadrado  * 2 mede: " + areaQuadrado * 2 );
    
   
    
    
}
}