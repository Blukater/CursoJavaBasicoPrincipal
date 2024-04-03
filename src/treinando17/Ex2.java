/*
Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.
 */

package treinando17;

import java.util.Locale;
import java.util.Scanner;


public class Ex2 {

public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         String nomeUsuario = "";
         String senha = "";         
         
         while(true){
         System.out.println("Digite o nome de usuário:");
         nomeUsuario = scan.next();
         
         System.out.println("Digite a senha:");
         senha = scan.next();
         
         if (!nomeUsuario.equals(senha)){
             
             System.out.println("Usuário e senha válidos!");
             break;             
         }else{
             
             System.out.println("O usuário e senha não podem ser iguais, escolha outra!");
         }
         
         }
}
}
