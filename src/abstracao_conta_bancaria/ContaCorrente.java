package abstracao_conta_bancaria;

public class ContaCorrente extends Conta {
	    private double tarifaMensal = 12.0;
	    
		public ContaCorrente(double numero, double agencia, String titular, double saldo) {
		super(numero, agencia, titular, saldo);		
	}

				
				
		@Override
		public double calcularTarifaMensal() {
			return tarifaMensal;
		
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