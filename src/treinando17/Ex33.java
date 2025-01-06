/*
O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex33 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int quantTemp = 0;
        int temp = 0;
        double tempMaior = Integer.MIN_VALUE;
        double tempMenor = Integer.MAX_VALUE;

        System.out.println("Informe a quantidade de temperaturas que serão usadas no comparativo: ");
        quantTemp = scan.nextInt();

        for (int i = 1; i <= quantTemp; i++) {

            System.out.println("Digite a temperatura " + (i < 10 ? "0" + i : i) + ": ");
            temp = scan.nextInt();
            System.out.println();

            if (temp > tempMaior) {
                tempMaior = temp;

            }
            if (temp < tempMenor) {
                tempMenor = temp;

            }

        }
        double tempMedia = (tempMenor + tempMaior) / 2;

        System.out.println("A menor temperatura informada é: " + tempMenor);
        System.out.println("A maior temperatura informada é: " + tempMaior);
        System.out.println("A média das temperaturas informadas é: " + tempMedia);
        scan.close();
    }

}
