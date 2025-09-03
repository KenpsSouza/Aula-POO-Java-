package abstracao;

public enum Cores {
	
	AZUL (10),
	VERMELHO (20),
	VERDE (30),
	ROSA (40);
	
	
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	private int i;
	
	Cores(int i) {
		this.i = i;
	}
}
