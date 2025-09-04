package abstracao_conta_bancaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
         
		System.out.println("Sistema Bancário");
		
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente cc = new ContaCorrente(123, 456, "João Silva", 1000.0);
		ContaPoupanca cp = new ContaPoupanca(789, 101, "Maria Souza", 500.0);
		ContaPessoaJuridica cj = new ContaPessoaJuridica(112, 131, "Empresa XYZ", 2000.0);
		
		Conta[] contas = {cc, cp, cj};
		
		while (true) {
		    System.out.println("\nEscolha uma conta:");
		    System.out.println("1. Conta Corrente");
		    System.out.println("2. Conta Poupança");
		    System.out.println("3. Conta Pessoa Jurídica");
		    System.out.println("4. Sair");
		    int escolhaConta = sc.nextInt();
		    
		    if (escolhaConta == 4) {
		        break;
		    }
		    
		    if (escolhaConta < 1 || escolhaConta > 4) {
		        System.out.println("Opção inválida. Tente novamente.");
		        continue;
		    }
		    
		    Conta contaSelecionada = contas[escolhaConta - 1];
		    
		    System.out.println("\nEscolha uma operação:");
		    System.out.println("1. Depositar");
		    System.out.println("2. Sacar");
		    System.out.println("3. Ver Saldo");
		    System.out.println("4. Calcular Tarifa Mensal");
		    int escolhaOperacao = sc.nextInt();
		    
		    switch (escolhaOperacao) {
		        case 1:
		            System.out.print("Digite o valor para depósito: R$ ");
		            double valorDeposito = sc.nextDouble();
		            contaSelecionada.Depositar(valorDeposito);
		            break;
		        case 2:
		            System.out.print("Digite o valor para saque: R$ ");
		            double valorSaque = sc.nextDouble();
		            contaSelecionada.Sacar(valorSaque);
		            break;
		        case 3:
		            System.out.println("Saldo atual: R$ " + contaSelecionada.getSaldo());
		            break;
		        case 4:
		            double tarifa = contaSelecionada.calcularTarifaMensal();
		            System.out.println("Tarifa mensal: R$ " + tarifa);
		            break;
		        default:
		            System.out.println("Opção inválida. Tente novamente.");
		    }
		}
		
	
	}

}
