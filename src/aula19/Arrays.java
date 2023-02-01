/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula19;


public class Arrays {
    public static void main(String[] args) {
        
        
        
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;
      
        double[] temperaturas = new double[365];      //declarar array depois do double é uma boa prática
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        
        
        System.out.println("o valor da temperatura do dia  é: " + temperaturas[2]); //para saber o valor específico
        
        
        System.out.println("Otamanho do array: " + temperaturas.length); //para saber o tamanho da array geral
        
        
        System.out.println("Valores do array: " + temperaturas); //para saber o espaço onde a array está armazenada
        
        for (int i=0; i<temperaturas.length; i++){ //obter quais são todos os valores  que tem na array
            System.out.println("o valor da temperatura do dia " + (i + 1) + " é " + temperaturas[i]); 
            
            
        }
        
        for (double temp : temperaturas){ //esse é o for melhorado, mas você só tem acesso ao valor, o indice, o contador, o numero de vezes que está pasando pelo for não tem
            
            
        }
    }
}
