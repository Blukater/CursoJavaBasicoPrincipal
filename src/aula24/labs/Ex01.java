/*
 Escreva	uma classe para	representar	uma	lâmpada	que	está	à	venda	em	
um supermercado.
 */
package aula24.labs;

public class Ex01 {

    public static void main(String[] args) {

        Lampada lampadaPequena = new Lampada();

        lampadaPequena.modelo = "Pequena";
        lampadaPequena.tensao = "Bivolt";
        lampadaPequena.cor = "Amarela";
        lampadaPequena.tipoLuz = "Amarela";
        lampadaPequena.potenciaW = 7;
        lampadaPequena.garantiaMeses = 12;

        lampadaPequena.tipos = new String [2];
        lampadaPequena.tipos[0] = "Abajur";
        lampadaPequena.tipos[1] = "Teto";
        
        
        System.out.println("Lampada");
        System.out.println();
        System.out.println("Modelo: " + lampadaPequena.modelo);
        System.out.println("Todelo: " + lampadaPequena.tensao);
        System.out.println("Cor: " + lampadaPequena.cor);
        System.out.println("Tipo Luz : " + lampadaPequena.tipoLuz);
        System.out.println("Potencia: " + lampadaPequena.potenciaW);
        System.out.println("Garantia Meses: " + lampadaPequena.garantiaMeses);
        System.out.println("Tipo: " + lampadaPequena.tipos[0]);
    }
}
