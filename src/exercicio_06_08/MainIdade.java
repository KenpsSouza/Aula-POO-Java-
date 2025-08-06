package exercicio_06_08;

import java.util.Scanner;

public class MainIdade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PessoaIdade pessoa = new PessoaIdade();

        System.out.println("Olá, vamos verificar sua idade!");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        pessoa.setNome(nome);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        pessoa.setIdade(idade);

        System.out.println("\nDados informados:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        sc.close();
    }
}