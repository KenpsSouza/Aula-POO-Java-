package abstracao_conta_bancaria;

public class ContaPessoaJuridica extends Conta {
	
	private double tarifaMensal = 20.0;
	private double taxaSaque = 1.05; 
	
	public ContaPessoaJuridica(double numero, double agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);
	}

	
	
	@Override
	public double calcularTarifaMensal() {
		return tarifaMensal;
	}

	@Override
	public void Sacar(double valor) {
		double valorComTaxa = valor + taxaSaque;
	    if (valor > 0 && getSaldo() >= valorComTaxa) {
	        setSaldo(getSaldo() - valorComTaxa);
	        System.out.println("Saque de R$ " + valor + " realizado com sucesso. Taxa de saque: R$ " + (valorComTaxa - valor));
	    } else {
	        System.out.println("Saldo insuficiente ou valor inválido.");
	    }
	}

    
}
