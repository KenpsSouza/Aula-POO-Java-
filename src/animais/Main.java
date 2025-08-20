package animais;

public class Main {

	public static void main(String[] args) {
       
		Vaca vaca = new Vaca("Mimosa", "Pintada",2 );
		Gato gato = new Gato("Mia", "Branco", 0.5);
		Cachorro cachorro = new Cachorro("Rex", "Marrom", 1.5);
	
		System.out.println("Animal: " + vaca.getNome() + ", Cor: " + vaca.getCor()
		+ ", Tamanho: " + vaca.getTamanho() + "m" );
		vaca.fazerSom();
		System.out.println();
		
		System.out.println("Animal: " + gato.getNome() + ", Cor: " + gato.getCor()
		+ ", Tamanho: " + gato.getTamanho() + "m" );
		gato.fazerSom();
		System.out.println();
		
		System.out.println("Animal: " + cachorro.getNome() + ", Cor: " + cachorro.getCor()
		+ ", Tamanho: " + cachorro.getTamanho() + "m" );
		cachorro.fazerSom();
			
	}

}
