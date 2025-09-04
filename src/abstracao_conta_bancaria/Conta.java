package abstracao_conta_bancaria;

abstract class Conta {
	private double numero;
	private double agencia;
	private String titular;
	private double saldo;
	
	
	public Conta(double numero, double agencia, String titular, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public double getNumero() {
		return numero;
	}
	public void setNumero(double numero) {
		this.numero = numero;
	}
	public double getAgencia() {
		return agencia;
	}
	public void setAgencia(double agencia) {
		this.agencia = agencia;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
	
	public void Depositar(double valor) {
	     if (valor > 0) {
	         saldo += valor;
	         System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
	     } else {
	         System.out.println("Valor de depósito inválido.");
	     }
	 
		
	};
	
	
       public void ExibirSaldo() {
    	   System.out.println("Saldo atual: R$ " + saldo);
	};
	
	public abstract void Sacar(double valor);
	
	public abstract double calcularTarifaMensal();
	
	

	
}