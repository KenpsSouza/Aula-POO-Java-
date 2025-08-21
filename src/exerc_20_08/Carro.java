package exerc_20_08;

public class Carro extends Veiculos {

	public Carro(String marca, String modelo, int ano, String cor) {
		super(marca, modelo, ano, cor);
	}
	
	@Override
	public void Iniciar() {
		super.Iniciar();
		System.out.println("O carro está iniciando...");
	}
	

}
