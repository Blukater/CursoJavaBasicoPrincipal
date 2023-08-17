/*
Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;
b. inteiro ou decimal
 */
package treinando15;

import java.util.Locale;
import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double num1, num2 = 0;

        System.out.println("Entre com o primeiro número:");
        num1 = scan.nextInt();

        System.out.println("Enter com o segundo número:");
        num2 = scan.nextInt();

        String operador = ""; // Inicialização da variável operador com uma string vazia

        System.out.println("Qual o operador que deseja utilizar para o cálculo: -, +, / ou * ?");
        operador = scan.next(); // Atribuição da entrada do usuário à variável operador

        double resultado = 0;

        switch (operador) {

            case "-":

                resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);

                /*//SABER SE NÚMERO É IMPAR OU PAR
                if (resultado % 2 != 0) {
                    System.out.println("Esse número é impar!");
                } else {
                    System.out.println("Esse número é par!");
                }*/

                System.out.println();

                //SABER QUE É NEGATIVO OU POSITIVO
                if (resultado < 0) {
                    System.out.println("O número é negativo");
                } else if (resultado > 0) {
                    System.out.println("O número é positivo");
                } else {
                    System.out.println("O número é neutro.");
                }

                System.out.println();

                //SABER SE É INTEIRO OU DECIMAL
                double arredondamento1 = Math.round(resultado);

                if (resultado == arredondamento1) {

                    System.out.println("Esse número é inteiro");

                } else {
                    System.out.println("esse número é decimal");
                }

                break;

            case "+":

                resultado = num1 + num2;
                System.out.println("O resultado da adição é: " + resultado);

                /*//SABER SE NÚMERO É IMPAR OU PAR
                if (resultado % 2 != 0) {
                    System.out.println("Esse número é impar!");
                } else {
                    System.out.println("Esse número é par!");
                }*/

                System.out.println();

                //SABER QUE É NEGATIVO OU POSITIVO
                if (resultado < 0) {
                    System.out.println("O número é negativo");
                } else if (resultado > 0) {
                    System.out.println("O número é positivo");
                } else {
                    System.out.println("O número é neutro.");
                }

                System.out.println();

                //SABER SE É INTEIRO OU DECIMAL
                double arredondamento2 = Math.round(resultado);

                if (resultado == arredondamento2) {

                    System.out.println("Esse número é inteiro");

                } else {
                    System.out.println("esse número é decimal");
                }

                break;

            case "/":

                resultado = num1 / num2;
                System.out.println("O resultado da divisão é: " + resultado);

                /*//SABER SE NÚMERO É IMPAR OU PAR
                if (resultado % 2 != 0) {
                    System.out.println("Esse número é impar!");
                } else {
                    System.out.println("Esse número é par!");
                }*/

                System.out.println();

                //SABER QUE É NEGATIVO OU POSITIVO
                if (resultado < 0) {
                    System.out.println("O número é negativo");
                } else if (resultado > 0) {
                    System.out.println("O número é positivo");
                } else {
                    System.out.println("O número é neutro.");
                }

                System.out.println();

                //SABER SE É INTEIRO OU DECIMAL
                double arredondamento3 = Math.round(resultado);

                if (resultado == arredondamento3) {

                    System.out.println("Esse número é inteiro");

                } else {
                    System.out.println("Esse número é decimal");
                }

                break;

            case "*":

                resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);

                /*//SABER SE NÚMERO É IMPAR OU PAR
                if (resultado % 2 != 0) {
                    System.out.println("Esse número é impar!");
                } else {
                    System.out.println("Esse número é par!");
                }*/

                System.out.println();

                //SABER QUE É NEGATIVO OU POSITIVO
                if (resultado < 0) {
                    System.out.println("O número é negativo");
                } else if (resultado > 0) {
                    System.out.println("O número é positivo");
                } else {
                    System.out.println("O número é neutro.");
                }

                System.out.println();

                //SABER SE É INTEIRO OU DECIMAL
                double arredondamento4 = Math.round(resultado);

                if (resultado == arredondamento4) {

                    System.out.println("Esse número é inteiro");

                } else {
                    System.out.println("esse número é decimal");
                }

                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }
        System.out.println();
        //SABER SE NÚMERO É IMPAR OU PAR ( COMO NÃO TEM VARIÁVEL, PODE SER FEITO SÓ AQUI TAMBÉM)
                      if (resultado % 2 != 0) {
                            System.out.println("Esse número é impar!");
                        } else {
                            System.out.println("Esse número é par!");
                        }
    }
}
