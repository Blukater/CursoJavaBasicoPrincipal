/*
Foi feita uma estatística em cinco cidades brasileiras para coletar
dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
1. Código da cidade;
2. Número de veículos de passeio (em 1999);
3. Número de acidentes de trânsito com vítimas (em
1999). 
Deseja-se saber:
a. Qual o maior e menor índice de acidentes de transito e a que
cidade pertence;
b. Qual a média de veículos nas cinco cidades juntas;
c. Qual a média de acidentes de trânsito nas cidades com menos
de 2.000 veículos de passeio.
 */
package treinando17;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex40 {

    int codigo;
    int numVeiculo;
    int numAcidentes;

    Ex40(int codigo, int numVeiculo, int numAcidentes) {
        this.codigo = codigo;
        this.numVeiculo = numVeiculo;
        this.numAcidentes = numAcidentes;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        ArrayList<Ex40> usuarios = new ArrayList<>();
        double acidentesMenor = Double.MAX_VALUE;
        double acidentesMaior = Double.MIN_VALUE;

        int codigoMenorAcidentes = 0;
        int codigoMaiorAcidentes = 0;

        int totalVeiculos = 0;
        int numCidades = 0;
        int totalAcidentesMenor2000 = 0;
        int cidadesMenor2000 = 0;
        boolean entrouDados = false;

        while (true) {
            System.out.println("Digite seu código da cidade (ou 0 para sair):");
            int codigo = scan.nextInt();

            if (codigo == 0) {
                if (!entrouDados) {
                    System.out.println("Saindo...");
                    return;
                }
                System.out.println("Saindo...");
                break;
            }
            int numVeiculo;
            do {
                System.out.println("Digite o número de veículos na cidade");
                numVeiculo = scan.nextInt();

                if (numVeiculo < 0) {
                    System.out.println("Número inválido! Digite um valor positivo.");
                }
            } while (numVeiculo < 0);

            totalVeiculos += numVeiculo;
            numCidades++;

            System.out.println("Digite o número de acidentes:");
            int numAcidentes = scan.nextInt();
            entrouDados = true;

            if (numAcidentes > acidentesMaior) {
                acidentesMaior = numAcidentes;
                codigoMaiorAcidentes = codigo;
            }
            if (numAcidentes < acidentesMenor) {
                acidentesMenor = numAcidentes;
                codigoMenorAcidentes = codigo;

            }
            if (numVeiculo < 2000) {
                totalAcidentesMenor2000 += numAcidentes;
                cidadesMenor2000++;
            }

            // Armazenando os dados do usuário
            usuarios.add(new Ex40(codigo, numVeiculo, numAcidentes));

        }
        System.out.println();
        
        double mediaVeiculos = (double) totalVeiculos / numCidades;
        double mediaAcidentesMenor2000 = cidadesMenor2000 > 0 ? (double) totalAcidentesMenor2000 / cidadesMenor2000 : 0;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("O número de cidade usadas na pesquisa é " + numCidades);
        System.out.println("O total de veículos usados na pesquisa é: " + totalVeiculos);
        System.out.println("A média de veículos usados na pesquisa por cidade é: " + mediaVeiculos);
        System.out.println("A média de acidentes com cidades com menos de 2000 veículos: " + mediaAcidentesMenor2000);
        System.out.println();
        System.out.println("Código da cidade com maior número de acidentes: " + codigoMaiorAcidentes + " | Acidentes MAIOR: " + acidentesMaior);
        System.out.println("Código da cidade com menor número de acidentes: " + codigoMenorAcidentes + " | Acidentes MENOR: " + acidentesMenor);
      
    }
}
