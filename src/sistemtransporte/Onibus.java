package sistemtransporte;

public class Onibus extends Veiculo {
    private int numeroParadas;

    public Onibus(String modelo, int numeroParadas) {
        super(modelo);
        this.numeroParadas = numeroParadas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidadeMedia = 60.0; 
        double tempoViagem = distancia / velocidadeMedia; 
        double tempoParadas = numeroParadas * 0.25 ; 
        return tempoViagem + tempoParadas;
    }
}