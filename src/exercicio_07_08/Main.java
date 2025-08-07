package exercicio_07_08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.println("Olá, vamos a livraria!");
        System.out.println();

        System.out.print("Informe o nome do título: ");
        String titulo = sc.nextLine();
        livro.setTitulo(titulo);

        System.out.print("Informe o nome do autor: ");
        String autor = sc.nextLine();
        livro.setAutor(autor);

        System.out.print("Informe o número de páginas: ");
        int numPagina = sc.nextInt();
        livro.setNumPaginas(numPagina);

        System.out.println();
        if (livro.getNumPaginas() >= 5) {
            System.out.println("Livro cadastrado com sucesso!");
            System.out.println(livro.getAutor());
            System.out.println(livro.getTitulo());
            System.out.println(livro.getNumPaginas());

            
        } else {
        }

        sc.close();
    }
}