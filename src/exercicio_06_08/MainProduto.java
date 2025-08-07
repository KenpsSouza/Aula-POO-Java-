package exercicio_06_08;

import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o preço original do produto: ");
        double preco = scanner.nextDouble();

        Produto prod = new Produto(nome, preco);

        System.out.println("Produto: " + prod.getNome());
        System.out.println("Preço original: " + prod.getPreco());

        System.out.print("Informe o percentual de desconto: ");
        double percentual = scanner.nextDouble();

        prod.aplicarDesconto(percentual);

        System.out.println("Preço com desconto: " + prod.getPreco());

        scanner.close();
    }
}