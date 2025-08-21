package exerc_20_08;

public class Main {

	public static void main(String[] args) {
	 Carro car = new Carro ("Toyota", "Corolla", 2020, "Preto");
	 
	 System.out.println("Marca: " + car.getMarca() + ", Modelo: " + car.getModelo() 
	 + ", Ano: " + car.getAno() + ", Cor: " + car.getCor());
	 
	 
	 car.Iniciar();
	 
  } 
}
