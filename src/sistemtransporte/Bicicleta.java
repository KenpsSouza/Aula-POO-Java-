package sistemtransporte;

public class Bicicleta extends Veiculo {
    
    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidadeMedia = 20.0; 
        return distancia / velocidadeMedia; 
    }
}