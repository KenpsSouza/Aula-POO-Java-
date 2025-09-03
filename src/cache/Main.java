package cache;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> banco = new ArrayList<>();
        banco.add(new Pessoa(1, "Immanuel Kant", 25));
        banco.add(new Pessoa(2, "Fiódor Dostoiévski", 30));
        banco.add(new Pessoa(3, "Clarice Lispector", 28));
        banco.add(new Pessoa(4, "Manuel Bandeira", 35));
        banco.add(new Pessoa(5, "Friedrich Nietzsche", 22));

        ArrayList<Pessoa> cache = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Buscar pessoa por ID");
            System.out.println("2 - Inserir nova pessoa no banco");
            System.out.println("3 - Visualizar pessoas no banco");
            System.out.println("4 - Visualizar pessoas no cache");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o id da pessoa: ");
                    int idProcurado = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer
                    boolean achou = false;
                    for (Pessoa p : cache) {
                        if (p.getId() == idProcurado) {
                            System.out.println("A Pessoa foi encontrada no cache: \n" + p);
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        for (Pessoa p : banco) {
                            if (p.getId() == idProcurado) {
                                if (cache.size() >= 10) cache.remove(0);
                                cache.add(p);
                                System.out.println("A Pessoa foi buscada no banco e adicionada ao cache:\n" + p);
                                achou = true;
                                break;
                            }
                        }
                        if (!achou) {
                            System.out.println("A Pessoa não foi encontrada.");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Digite o id da nova pessoa: ");
                    int novoId = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer
                    System.out.print("Digite o nome da nova pessoa: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Digite a idade da nova pessoa: ");
                    int novaIdade = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer

                    // Verifica se o id já existe
                    boolean existe = false;
                    for (Pessoa p : banco) {
                        if (p.getId() == novoId) {
                            existe = true;
                            break;
                        }
                    }
                    if (existe) {
                        System.out.println("Já existe uma pessoa com esse id!");
                    } else {
                        banco.add(new Pessoa(novoId, novoNome, novaIdade));
                        System.out.println("Pessoa inserida com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("\nPessoas no banco:");
                    if (banco.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        for (Pessoa p : banco) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nPessoas no cache:");
                    if (cache.isEmpty()) {
                        System.out.println("Nenhuma pessoa no cache.");
                    } else {
                        for (Pessoa p : cache) {
                            System.out.println(p);
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }
}