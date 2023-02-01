/*
ex: depois de num, até max, qual o primeiro número divisível por 7
 */

package aula18;

import java.util.Scanner;


public class BreakEContinue {
    public static void main(String[] args) {
        
        /*Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com um número:");
        int num = scan.nextInt();
        
        System.out.println("Entre com um limite:");
        int max = scan.nextInt();
        
        for ( int i=num; i<=max; i++){
            System.out.println(i); //só para conferir onde ele para, depois fazer sem o break e verá q ele continuacatalogando os números
        if (i % 7 == 0){ //qual o primeiro número divisível por 7
            System.out.println("O valor de i é: " + i);
                break;
            
        
        
        
        
        
            }

        }*/
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com um número:");
        int num = scan.nextInt();
        
        System.out.println("Entre com um limite:");
        int max = scan.nextInt();
        
        for ( int i=num; i<=max; i++){
                 if (i % 7 == 0){ 
                 continue; //aqui ele vai pular todos os divisores de 7
    }
        
        System.out.println("O valor de i é: " + i);
}
    }
}