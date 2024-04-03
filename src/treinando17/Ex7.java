/*
Faça um programa que leia 5 números e informe o maior número.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int num = 0;
        int numMaior = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número");
            num = scan.nextInt();

            if (num > numMaior) {
                numMaior= num;
                System.out.println("O número maior mudou para: " + numMaior);

            }

        }
        System.out.println();
        System.out.println("O maior dos 5 números é: " + numMaior);
    }
}

/*
Essa expressão em Java é um programa que solicita ao usuário que insira cinco números e determina qual deles é o maior. Aqui está o que acontece em cada parte do código:

Scanner scan = new Scanner(System.in).useLocale(Locale.US);: Isso cria um objeto Scanner para ler a entrada do usuário. useLocale(Locale.US) é usado para garantir que o scanner interprete números com o ponto decimal como separador decimal, independentemente das configurações regionais do sistema.

int num = 0;: Isso declara uma variável inteira chamada num e a inicializa com o valor 0. Essa variável será usada para armazenar cada número digitado pelo usuário.

int numMaior = Integer.MIN_VALUE;: Isso declara uma variável inteira chamada numMaior e a inicializa com o menor valor possível para um inteiro em Java. Isso é feito para garantir que qualquer número digitado pelo usuário será maior que numMaior inicialmente.

for (int i = 0; i < 5; i++) { ... }: Isso inicia um loop que se repete cinco vezes. Em cada iteração do loop, o usuário é solicitado a digitar um número e esse número é comparado com o numMaior atual. Se o número digitado for maior que o numMaior atual, numMaior é atualizado para armazenar esse novo valor.

System.out.println("O maior dos 5 números é: " + numMaior);: Após o loop, o programa imprime na tela o maior dos cinco números que o usuário digitou.

Em resumo, o programa solicita ao usuário que insira cinco números, determina qual deles é o maior e o imprime na tela.*/
