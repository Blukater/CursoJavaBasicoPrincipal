/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer2 {
 public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    
         boolean infoValidas = false;
         String usuario;
        String senha;
        
         do {
             
         System.out.println("Digite nome de usuário:");
         usuario = scan.next();
         
         System.out.println("Digite a senha:");
         senha = scan.next();
         
         if (usuario.equalsIgnoreCase(senha)) {/*comparação de strings*/
         //  infoValidas = false;
         System.out.println("ERROR, nome de usuário deve ser diferente da senha");
         } else {
                 infoValidas = true;
                 System.out.println("Usuário e senha cadastrados.");
         }
} while (!infoValidas);
     
         }
         }
