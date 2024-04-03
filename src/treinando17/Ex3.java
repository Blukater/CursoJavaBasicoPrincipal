/*
Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
 */
package treinando17;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        
        String nome,sexo,estadoCivil = "";
        int idade = 0;
        double salario = 0;
      
        System.out.println("Digite o nome:");
        nome = scan.next();

        if (nome.length() > 3) {
            System.out.println(nome + " - " + " Nome válido");

        } else {
            System.out.println(nome + " - " + " Nome inválido");
        }

        System.out.println();

        System.out.println("Digite sua idade:");
        idade = scan.nextInt();

        if (idade > 0 && idade <= 150) {

            System.out.println(idade + " - " + "Idade válida");
        } else {
            System.out.println(idade + " - " + "Idade inválida");
        }

        System.out.println();

        System.out.println("Digite seu salário: ");
        salario = scan.nextDouble();

        if (salario > 0) {

            System.out.println(salario + " - " + "Salário válido");
        } else {

            System.out.println(salario + " - " + "Salário inválido");
        }
        System.out.println();

        System.out.println("Digite seu sexo, M para masculino e F para feminino:");
        sexo = scan.next();

        if (sexo.equals("m")) {

            System.out.println(sexo + " - " + "Sexo válido");
        } else if (sexo.equalsIgnoreCase("F")) {

            System.out.println(sexo + " - " + "Sexo válido");
        } else {
            System.out.println(sexo + " - " + "Sexo inválido");
        }

        System.out.println();

        System.out.println("Digite seu estado civil entre: S, C, V, D");
        estadoCivil = scan.next();

        if (estadoCivil.equalsIgnoreCase("S")) {

            System.out.println(estadoCivil + " - " + "Estado civil válido");
        } else if (estadoCivil.equalsIgnoreCase("C")) {

            System.out.println(estadoCivil + " - " + "Estado civil válido");
            
        } else if (estadoCivil.equalsIgnoreCase("V")) {

            System.out.println(estadoCivil + " - " + "Estado civil válido");

        } else if (estadoCivil.equalsIgnoreCase("d")) {

            System.out.println(estadoCivil + " - " + "Estado civil válido");
        } else {
            System.out.println(estadoCivil + " - " + "Estado civil inválido");
        }
    
    }
}


/*FORMA DE FAZER COM DO WHILE


 public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         boolean infoValidas = false;
         String nome, sexo, estadoCivil = "";
         int idade = 0;
         double salario = 0;
         
       do{  
         System.out.println("Digite seu nome:");
         nome = scan.next();
                 
        
        if (nome.length() >= 3){
              infoValidas = true;
         }else{
             System.out.println("O nome precisa ter n mínimo 3 caracteres");
        }
       } while (!infoValidas);
             
         infoValidas = false;
         
         do{  
         System.out.println("Digite sua idade entre 0 e 150:");
         idade = scan.nextInt();
                 
        
        if (idade >= 0 && idade <= 150){
              infoValidas = true;
         }else{
             System.out.println("Você tem que digitar uma idade entre 0 e 150!");
        }
       } while (!infoValidas);
         
                  infoValidas = false;
         
         do{  
         System.out.println("Digite seu salário:");
         salario = scan.nextDouble();
                 
        
        if (salario > 0){
              infoValidas = true;
         }else{
             System.out.println("O salário deve ser maior que 0!");
        }
       } while (!infoValidas);
         
          infoValidas = false;
         
         do{  
          System.out.println("Digite seu sexo:");
         sexo = scan.next();
         
             if (sexo.equalsIgnoreCase ("f") || 
                 sexo.equalsIgnoreCase ("m")){
                   infoValidas = true;   
        } else {
                    System.out.println("Digite uma letra correspondente com o sexo do usuário.");
          }
       } while (!infoValidas);
         
          infoValidas = false;
         
         do{  
       System.out.println("Qual seu estado civil:");
         estadoCivil = scan.next();
         
              if (estadoCivil.equalsIgnoreCase("s") ||  
                      estadoCivil.equalsIgnoreCase ("c") || 
                      estadoCivil.equalsIgnoreCase ("v") || 
                      estadoCivil.equalsIgnoreCase ("d")){
                    infoValidas = true;
   
        } else {
            
            System.out.println("Digite uma letra correspondente ao estado civil!");
}      
} while (!infoValidas);

         System.out.println("As seguintes informações foram coletadas:");
         System.out.println("Nome: " + nome);
         System.out.println("Idade: " + idade);
         System.out.println("Salário: " + salario);
         System.out.println("Nome: " + sexo);
         System.out.println("Estado civil: " + estadoCivil);
         
}
}
*/
