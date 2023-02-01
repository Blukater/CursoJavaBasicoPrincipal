
package aula15;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um dia da semana:");
        int diaDaSemana = scan.nextInt();
        
        
/*FORMA SEM O SWITCH CASE
if (diaDaSemana == 1) {
            System.out.println("Domingo");
} else if (diaDaSemana == 2){
            System.out.println("Segunda");
} else if (diaDaSemana == 3){
            System.out.println("Terça");
} else if (diaDaSemana == 4){
            System.out.println("Quarta");
} else if (diaDaSemana == 5){
            System.out.println("Quinta");
} else if (diaDaSemana == 6){
            System.out.println("Sexta");
} else if (diaDaSemana == 7){
            System.out.println("Sábado");
} else {
    System.out.println("Não é um dia da semana válido");*/



/* ESSA UTILIZAÇÃO LÊ APENAS 1 LINHA
switch (diaDaSemana){
    case 1: System.out.println("Domingo"); break;
    case 2: System.out.println("Segunda"); break;
    case 3: System.out.println("Terça"); break;
    case 4: System.out.println("Quarta"); break;
    case 5: System.out.println("Quinta"); break;
    case 6: System.out.println("Sexta"); break;
    case 7: System.out.println("Sábado"); break;
    default: System.out.println("Não é um dia da semana válido"); break;*/


//NESSE CASO O CÓDIGO SERÁ LIDO PARA DIZER OS DIAS ÚTEIS OU NÃO
switch (diaDaSemana){
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: System.out.println("Dia útil"); break;   
    case 1: 
    case 7: System.out.println("Fim de semana."); break;
    default: System.out.println("Não é um dia da semana válido");
}
}
}



