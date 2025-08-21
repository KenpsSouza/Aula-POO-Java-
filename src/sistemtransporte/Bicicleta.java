package sistemtransporte;

public class Bicicleta extends Veiculo {
    
    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
        float velocidadeMedia = 20.0f; 
        return distancia / velocidadeMedia; 
    }
}