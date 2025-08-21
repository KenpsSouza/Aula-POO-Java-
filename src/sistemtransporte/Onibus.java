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
    public float calcularTempo(float distancia) {
        float velocidadeMedia = 60.0f; 
        float tempoViagem = distancia / velocidadeMedia; 
        float tempoParadas = numeroParadas * 0.25f ; 
        return tempoViagem + tempoParadas;
    }
}