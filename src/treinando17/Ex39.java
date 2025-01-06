/*
Faça um programa que leia dez conjuntos de dois valores, o primeiro
representando o número do aluno e o segundo representando a sua
altura em centímetros. Encontre o aluno mais alto e o mais baixo.
Mostre o número do aluno mais alto e o número do aluno mais baixo,
junto com suas alturas.
 */
package treinando17;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex39 {

    int codigo;
    double altura;

    Ex39(int codigo, double altura) {
        this.codigo = codigo;
        this.altura = altura;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        ArrayList<Ex39> usuarios = new ArrayList<>();
        double alturaMenor = Double.MAX_VALUE;
        double alturaMaior = Double.MIN_VALUE;

        int codigoMenorAltura = 0;  // Código do usuário com menor altura
        int codigoMaiorAltura = 0;  // Código do usuário com maior altura

        boolean entrouDados = false;  // Verifica se algum dado foi inserido

        while (true) {
            System.out.println("Digite seu código de usuário (ou 0 para sair):");
            int codigo = scan.nextInt();

            if (codigo == 0) {
                // Se nenhum dado foi inserido, encerra sem exibir nada
                if (!entrouDados) {
                    System.out.println("Saindo...");
                    return;
                }
               System.out.println("Saindo...");
                break;
            }

            System.out.println("Digite sua altura:");
            double altura = scan.nextDouble();
            entrouDados = true;  // Marca que pelo menos um dado foi inserido

            // Verificação e atualização da maior e menor altura
            if (altura > alturaMaior) {
                alturaMaior = altura;
                codigoMaiorAltura = codigo;  // Atualiza o código do usuário com maior altura
            }
            if (altura < alturaMenor) {
                alturaMenor = altura;
                codigoMenorAltura = codigo;  // Atualiza o código do usuário com menor altura
            }

            // Armazenando os dados do usuário
            usuarios.add(new Ex39(codigo, altura));
        }

        // Exibindo valores extremos com os códigos correspondentes
        System.out.println("Código do aluno mais alto: " + codigoMaiorAltura + " | Altura: " + alturaMaior);
        System.out.println("Código do aluno mais baixo: " + codigoMenorAltura + " | Altura: " + alturaMenor);
    }
}
