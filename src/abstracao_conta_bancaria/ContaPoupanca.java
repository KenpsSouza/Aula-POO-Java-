package abstracao_conta_bancaria;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(double numero, double agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
	}

	@Override
	public double calcularTarifaMensal() {
		return 0.0;
	}

	@Override
	public void Sacar(double valor) {
		if (valor > 0 && getSaldo() >= valor) {
	        setSaldo(getSaldo() - valor);
	        System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
	    } else {
	        System.out.println("Saldo insuficiente ou valor inválido.");
	    }
		
	}
		

}
