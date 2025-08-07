package exercicio_07_08;

public class Livro {

    private String titulo;
    private String autor;
    private int numPaginas;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        if (numPaginas < 5) {
            System.out.println("Número de páginas inválido, inserir número maior que (5).");
        } else {
            this.numPaginas = numPaginas;
        }
    }

  
}