/*
 Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
. "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir
uma classificação sobre a participação da pessoa no crime. Se
a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex25 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int contadorSim = 0;
         int contadorNao = 0;

        String pergunta1, pergunta2, pergunta3, pergunta4, pergunta5;

        // Pergunta 1
        System.out.println("Telefonou para a vítima?");
        pergunta1 = scan.next().toLowerCase();
        if (pergunta1.equals("sim")) {
            contadorSim++;
        } else if (pergunta1.equals("não")) {
            contadorNao++;
        }

        // Pergunta 2
        System.out.println("Esteve no local do crime?");
        pergunta2 = scan.next().toLowerCase();
        if (pergunta2.equals("sim")) {
            contadorSim++;
        } else if (pergunta2.equals("não")) {
            contadorNao++;
        }

        // Pergunta 3
        System.out.println("Mora perto da vítima?");
        pergunta3 = scan.next().toLowerCase();
        if (pergunta3.equals("sim")) {
            contadorSim++;
        } else if (pergunta3.equals("não")) {
            contadorNao++;
        }

        // Pergunta 4
        System.out.println("Devia para a vítima?");
        pergunta4 = scan.next().toLowerCase();
        if (pergunta4.equals("sim")) {
            contadorSim++;
        } else if (pergunta4.equals("não")) {
            contadorNao++;
        }

        // Pergunta 5
        System.out.println("Já trabalhou com a vítima?");
        pergunta5 = scan.next().toLowerCase();
        if (pergunta5.equals("sim")) {
            contadorSim++;
        } else if (pergunta5.equals("não")) {
            contadorNao++;
        }

        System.out.println();
        
        if (contadorSim == 2){
          System.out.println("Essa pessoa é suspeita!");
       }else if(contadorSim == 3 || contadorSim == 4){
            System.out.println("Essa pessoa é cúmplice!");
        }else if(contadorSim == 5){
            System.out.println("Essa pessoa é assassina!");
        }else{
            System.out.println("Essa pessoa é inocente!");
        }
    }
}      
      
