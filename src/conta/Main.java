package conta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria(0);
		
        System.out.println("Olá, vamos consultar sua conta! ");
        
       
int opcao;

do {
    System.out.println("--------------------");
    System.out.println("1 - Depositar");
    System.out.println("2 - Sacar");
    System.out.println("3 - Consultar saldo");
    System.out.println("0 - Sair");
    System.out.println("--------------------");

    System.out.print("Escolha uma opção: ");
    opcao = sc.nextInt();

    switch (opcao) {
        case 1:
            System.out.print("Digite o valor para depósito: R$ ");
            double valorDeposito = sc.nextDouble();
            conta.depositar(valorDeposito);
            break;

        case 2:
            System.out.print("Digite o valor para saque: R$ ");
            double valorSaque = sc.nextDouble();
            conta.sacar(valorSaque);
            break;

        case 3:
            System.out.println("Saldo atual: R$" + conta.getSaldo());
            break;

        case 0:
            System.out.println("Saindo... Obrigado por usar nosso banco :)");
            break;

        default:
            System.out.println("Opção inválida! Tente novamente.");
    }

} while (opcao != 0);

sc.close();
}
}


