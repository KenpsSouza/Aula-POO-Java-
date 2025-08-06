package exercicio_06_08;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual < 0) {
            System.out.println("Percentual de desconto não pode ser realizado.");
        }
        double desconto = preco * (percentual / 100);
        setPreco(preco - desconto);
    }

    private void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }
}