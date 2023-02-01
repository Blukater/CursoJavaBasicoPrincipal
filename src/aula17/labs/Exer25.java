/*
pequeno caixa
 */

package aula17.labs;

import java.util.Locale;
import java.util.Scanner;


public class Exer25 {
public static void main(String[] args) {
         Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
         //System.out.println("LOJAS TABAJARA");
         
       boolean sair = false;
       String continuarCompra;
       int qtdProdutos;
       double preco;
       double total;
       double valorPago, troco;
       String output;
       
       
       do {
           System.out.println("Deseja informar uma nova compra? S/N");
           continuarCompra =scan.next();
           
           if (continuarCompra. equalsIgnoreCase ("s")){
               
               output = "LOJAS BATAJARA/n";
               
                System.out.println("Digite a quantidade de produtos da compra:");
                qtdProdutos = scan.nextInt();
                
                
                total = 0;
                
                for (int i=1; i <=qtdProdutos; i++){
               System.out.println("Informe o preço do produto " + i);  
               preco = scan.nextDouble();
               total += preco;
               
               output += "Produto " + i + ": R$ " + preco + "\n"; 
               
           }
               output += "Total: R$ " + total;
               
               System.out.println("Total: R$ " + total);
               
               
               
               System.out.println("Entre com o valor pago:");
               valorPago = scan.nextDouble();
               
               output += " Dinheiro: R$ " + valorPago + "\n";
               
               troco = total - valorPago;
               
              output += "Troco: R$ " + troco;
              
               System.out.println(output);
                
           } else {
               sair = true;
           }
           
          
       }while (!sair);
       
       
}
}
