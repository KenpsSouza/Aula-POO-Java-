package exercicio_07_08;

import java.util.Scanner;

public class MainRPG {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PersonaRPG per = new PersonaRPG(1, 0-100);
		
		System.out.println("Olá, bem-vindo");
		
		System.out.println("Inserir o nome:");
		String nome = sc.nextLine();
		per.setNome(nome);
		
		System.out.println("Inserir classe:");
		String classe = sc.nextLine();
		per.setClasse(classe);
		
		System.out.println("Inserir vida:");
		int vida = sc.nextInt();
		per.setVida(vida);
		
		
	}

}
