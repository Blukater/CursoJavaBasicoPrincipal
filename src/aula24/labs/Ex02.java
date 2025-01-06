/*
Crie	uma classe Livro	que	represente	os	dados	básicos	de	um	livro,	sem	se	
preocupar	com	a	sua finalidade
 */
package aula24.labs;

import java.time.LocalDate;

public class Ex02 {

    public static void main(String[] args) {

        Livro Livro = new Livro();

        Livro.nome = "O conde de Monte Cristo";
        Livro.autor = "Shaikspeare";
        Livro.editora = "Nunance";
        Livro.isbn = 1223;
        Livro.dataLancamento = LocalDate.of(1900, 12, 12);
        Livro.preco = 15.50;

        System.out.println("Nome do livro: " + Livro.nome);
        System.out.println("Autor do livro: " + Livro.autor);
        System.out.println("Editora do livro: " + Livro.editora);
        System.out.println("ISBN do livro: " + Livro.isbn);
        System.out.println("Data de lançamento do livro: " + Livro.dataLancamento);
        System.out.println("preco do livro: R$ " + Livro.preco);

    }
}
