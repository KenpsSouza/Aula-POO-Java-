package exercicio_06_08;

public class PessoaIdade {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade não pode ser negativa.");
            this.idade = 0; // Define idade como 0 se negativa
        } else {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }
}