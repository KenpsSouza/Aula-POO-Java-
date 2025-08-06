package exercicio_06_08;

public class MainProduto {
    public static void main(String[] args) {
        Produto prod = new Produto("Celular", 1500.0);

        System.out.println("Produto: " + prod.getNome());
        System.out.println("Preço original: " + prod.getPreco());

        prod.aplicarDesconto(10);

        System.out.println("Preço com desconto: " + prod.getPreco());

        prod.aplicarDesconto(100); 

        System.out.println("Preço após 100% de desconto: " + prod.getPreco()); 
    }
}