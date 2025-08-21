package sistemtransporte;

public class Carro extends Veiculo {
    
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidadeMedia = 80.0; 
        return distancia / velocidadeMedia; 
    }
}