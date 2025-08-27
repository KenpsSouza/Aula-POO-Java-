package cache;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> banco = new ArrayList<>();
        banco.add(new Pessoa(1, "Ana", 25));
        banco.add(new Pessoa(2, "Bruno", 30));
        banco.add(new Pessoa(3, "Carla", 28));
        banco.add(new Pessoa(4, "Daniel", 35));
        banco.add(new Pessoa(5, "Eva", 22));

        ArrayList<Pessoa> cache = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o id da pessoa (ou 0 para sair):");
            int idProcurado = sc.nextInt();
            if (idProcurado == 0) break;

            Pessoa pessoaEncontrada = null;

            for (Pessoa p : cache) {
                if (p.getId() == idProcurado) {
                    pessoaEncontrada = p;
                    break;
                }
            }

            if (pessoaEncontrada != null) {
                System.out.println("Pessoa encontrada no cache: \n" + pessoaEncontrada);
            } else {
                for (Pessoa p : banco) {
                    if (p.getId() == idProcurado) {
                        pessoaEncontrada = p;
                        break;
                    }
                }
                if (pessoaEncontrada != null) {
                    if (cache.size() >= 10) {
                        cache.remove(0);
                    }
                    cache.add(pessoaEncontrada);
                    System.out.println("Pessoa buscada no banco e adicionada ao cache: \n" 
                    + pessoaEncontrada);
                } else {
                    System.out.println("Pessoa não encontrada.");
                }
            }
        }
        sc.close();
    }
}