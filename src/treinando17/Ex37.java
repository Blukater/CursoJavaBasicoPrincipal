/*
Uma academia deseja fazer um senso entre seus clientes para
descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para
isto você deve fazer um programa que pergunte a cada um dos
clientes da academia seu código, sua altura e seu peso. O final da
digitação de dados deve ser dada quando o usuário digitar 0 (zero) no
campo código. Ao encerrar o programa também deve ser informados
os códigos e valores do clente mais alto, do mais baixo, do mais gordo
e do mais magro, além da média das alturas e dos pesos dos clientes
 */

/*package treinando17;
import java.util.Locale;
import java.util.Scanner;

public class Ex37 {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double alturaMenor = Double.MAX_VALUE;
        double alturaMaior = Double.MIN_VALUE;
        double pesoMenor = Double.MAX_VALUE;
        double pesoMaior = Double.MIN_VALUE;

        int codigoAlturaMaior = 0;  // Código do usuário com maior altura
        int codigoAlturaMenor = 0;  // Código do usuário com menor altura
        int codigoPesoMaior = 0;    // Código do usuário com maior peso
        int codigoPesoMenor = 0;    // Código do usuário com menor peso

        while (true) {
            System.out.println("Digite seu código de usuário (ou 0 para sair):");
            int codigo = scan.nextInt();

            if (codigo == 0) {
                System.out.println("Saindo...");
                break;
            }

            System.out.println("Digite sua altura:");
            double altura = scan.nextDouble();

            // Verifica se a altura é maior ou menor, e armazena o código correspondente
            if (altura > alturaMaior) {
                alturaMaior = altura;
                codigoAlturaMaior = codigo;  // Armazena o código do usuário com maior altura
            }
            if (altura < alturaMenor) {
                alturaMenor = altura;
                codigoAlturaMenor = codigo;  // Armazena o código do usuário com menor altura
            }

            System.out.println("Digite seu peso:");
            double peso = scan.nextDouble();

            // Verifica se o peso é maior ou menor, e armazena o código correspondente
            if (peso > pesoMaior) {
                pesoMaior = peso;
                codigoPesoMaior = codigo;  // Armazena o código do usuário com maior peso
            }
            if (peso < pesoMenor) {
                pesoMenor = peso;
                codigoPesoMenor = codigo;  // Armazena o código do usuário com menor peso
            }
        }

        // Cálculo da média (apenas entre os extremos)
        double mediaAltura = (alturaMaior + alturaMenor) / 2;
        double mediaPeso = (pesoMaior + pesoMenor) / 2;

        // Exibindo valores extremos e médias com os códigos dos usuários
        System.out.println("\nResumo dos dados dos usuários:");
        System.out.println("Código do usuário com maior altura: " + codigoAlturaMaior + " | Altura: " + alturaMaior);
        System.out.println("Código do usuário com menor altura: " + codigoAlturaMenor + " | Altura: " + alturaMenor);
        System.out.println("Código do usuário com maior peso: " + codigoPesoMaior + " | Peso: " + pesoMaior);
        System.out.println("Código do usuário com menor peso: " + codigoPesoMenor + " | Peso: " + pesoMenor);

        System.out.println();
        System.out.println("A média da altura entre o menor e maior usuário é: " + mediaAltura);
        System.out.println("A média do peso entre o menor e maior usuário é: " + mediaPeso);
    }
}*/






package treinando17;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex37 {
    int codigo;
    double altura;
    double peso;

    Ex37(int codigo, double altura, double peso) {
        this.codigo = codigo;
        this.altura = altura;
        this.peso = peso;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        ArrayList<Ex37> usuarios = new ArrayList<>();
        double alturaMenor = Double.MAX_VALUE;
        double alturaMaior = Double.MIN_VALUE;
        double pesoMenor = Double.MAX_VALUE;
        double pesoMaior = Double.MIN_VALUE;

        int codigoMenorAltura = 0;  // Código do usuário com menor altura
        int codigoMaiorAltura = 0;  // Código do usuário com maior altura
        int codigoMenorPeso = 0;    // Código do usuário com menor peso
        int codigoMaiorPeso = 0;    // Código do usuário com maior peso

        while (true) {
            System.out.println("Digite seu código de usuário (ou 0 para sair):");
            int codigo = scan.nextInt();

            if (codigo == 0) {
                System.out.println("Saindo...");
                break;
            }

            System.out.println("Digite sua altura:");
            double altura = scan.nextDouble();

            // Verificação e atualização da maior e menor altura
            if (altura > alturaMaior) {
                alturaMaior = altura;
                codigoMaiorAltura = codigo;  // Atualiza o código do usuário com maior altura
            }
            if (altura < alturaMenor) {
                alturaMenor = altura;
                codigoMenorAltura = codigo;  // Atualiza o código do usuário com menor altura
            }

            System.out.println("Digite seu peso:");
            double peso = scan.nextDouble();

            // Verificação e atualização do maior e menor peso
            if (peso > pesoMaior) {
                pesoMaior = peso;
                codigoMaiorPeso = codigo;  // Atualiza o código do usuário com maior peso
            }
            if (peso < pesoMenor) {
                pesoMenor = peso;
                codigoMenorPeso = codigo;  // Atualiza o código do usuário com menor peso
            }

            // Armazenando os dados do usuário
            usuarios.add(new Ex37(codigo, altura, peso));
        }

        // Cálculo da média (entre os extremos)
        double mediaAltura = (alturaMaior + alturaMenor) / 2;
        double mediaPeso = (pesoMaior + pesoMenor) / 2;

        // Exibindo valores extremos com os códigos correspondentes
        System.out.println("\nA altura maior é: " + alturaMaior + " (Código: " + codigoMaiorAltura + ")");
        System.out.println("A altura menor é: " + alturaMenor + " (Código: " + codigoMenorAltura + ")");
        System.out.println("O peso maior é: " + pesoMaior + " (Código: " + codigoMaiorPeso + ")");
        System.out.println("O peso menor é: " + pesoMenor + " (Código: " + codigoMenorPeso + ")");

        // Exibindo a média entre as alturas e pesos extremos
        System.out.println();
        System.out.println("A média da altura entre o menor e maior usuário é: " + mediaAltura);
        System.out.println("A média do peso entre o menor e maior usuário é: " + mediaPeso);
    }
}





