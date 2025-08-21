package sistemtransporte;

public class Carro extends Veiculo {
    
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        float velocidadeMedia = 80.0f; 
        return distancia / velocidadeMedia; 
    }
}