package exercicio_07_08;

public class PersonaRPG {

	private String nome;
	private String classe;
	private int nivel;
	private int vida;
		
	public PersonaRPG(int nivel, int vida) {
		super();
		this.nivel = nivel;
		this.vida = vida;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		 if (nivel < 1) {
	            System.out.println("Nivel inválido, inserir número maior que 1.");
	        } else {
	            this.nivel = nivel;
	        }
	}
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		if (vida < 0 && vida > 100) {
            System.out.println("Número de vida inválido, inserir número entre 1 e 100!");
        } else {
            this.vida = vida;
        }
	}
	
}
