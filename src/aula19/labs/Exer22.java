/*
PODE USAR ISSO PARA FAZER UM PROGRAMA PRA SORTEIO
 */

package aula19.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer22 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int [] vetorA = new int [10];
         int qtd0 = 0;
         int qtd1 = 0;
         
            for (int i=0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
             
             if (vetorA[i] == 0) {
                 qtd0++;
                 }else {
                         qtd1++;
         }
         
}
         
         double porc0 = (qtd0 * 100) / vetorA.length;
         double porc1 = (qtd1 * 100) / vetorA.length;
         
         System.out.print("VetorA = ");
         for (int i=0; i < vetorA.length; i++){
             System.out.print(vetorA [i] + " ");
         
         }
         System.out.println();
         
         System.out.println("Por 0 = " + porc0);
         System.out.println("Por 1 = " + porc1);
}


}