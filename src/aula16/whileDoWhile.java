/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula16;


public class whileDoWhile {
    public static void main(String[] args) {
        
    
    int i = 1; /*count ou cont tbem é comum utilizar para contar coisas*/
    int max = 10;
    
        System.out.println("Contando até "  + max);
        
        while(i <= max) /*enquanto o i for maior que o valor máximo*/ {
            System.out.println("Valor de i " + i);
            i++;       /*i = i + 1 ou i += 1;*/      
            
        }
        
        System.out.println(i); // valor de 11
        
        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);
        System.out.println(i);
    }
    
        
}
