/*
Faça um Programa que peça uma data no formato dd/mm/aaaa e
determine se a mesma é uma data válida.
 */

package treinando15;

import java.util.Locale;
import java.util.Scanner;


public class Ex18 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         int[] dias = new int[1];
        int[] meses = new int[1];
        int[] anos = new int[1];
        boolean dataValida = false;
        
        while (!dataValida) {
        System.out.print("Digite o dia: ");
        dias[0] = scan.nextInt();
        System.out.print("Digite o mês: ");
        meses[0] = scan.nextInt();
        System.out.print("Digite o ano: ");
        anos[0] = scan.nextInt();
  if (validarData(dias[0], meses[0], anos[0])) {
            System.out.println("A data é válida.");
            dataValida = true;
        } else {
            System.out.println("A data é inválida.");
        }
    }
}
    public static boolean validarData(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            diasPorMes[1] = 29; // ano bissexto, fevereiro tem 29 dias
        }

        if (dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }
}

/* OUTRA FORMA, A PESSOA DIGITANDO A DATA INTEIRA


 System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataString = input.nextLine();

        if (validarData(dataString)) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
        }
    }

    public static boolean validarData(String dataString) {
        String[] partes = dataString.split("/");

        if (partes.length != 3) {
            return false;
        }

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            diasPorMes[1] = 29; // ano bissexto, fevereiro tem 29 dias
        }

        if (dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }
}

*/



