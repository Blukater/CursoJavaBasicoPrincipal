/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer3 {
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

       


