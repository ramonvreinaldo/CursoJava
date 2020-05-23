package aplicacao;

import java.util.Scanner;

import Componentes.Aula21_cConta;

public class Aula21_Conta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Double lancamento;
		
		System.out.print("Insira o número da conta: ");
		int conta = sc.nextInt();
		System.out.print("Insira o nome do cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Fazer depósito inicial? (s/n) : ");
		
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Insira o valor do depósito inicial: ");
			lancamento = sc.nextDouble();
			}
		else {
			lancamento = 0.0;
			}
		

		Aula21_cConta movimento = new Aula21_cConta(conta, nome, lancamento);
		
		//imprimindo o resultado
		System.out.println();
		System.out.println("Saldo atualizado: " + movimento); //chamando String do componente
		
		//deposito
		System.out.println();
		System.out.print("Adicionar o valor de um novo depósito: ");
		lancamento = sc.nextDouble();
		movimento.depositoSaldo(lancamento);
		
		System.out.println();
		System.out.println("Saldo atualizado: " + movimento);
		
		//saque
		System.out.println();
		System.out.print("Fazer um saque no valor de: ");
		lancamento = sc.nextDouble();
		movimento.saqueSaldo(lancamento);
		
		System.out.println();
		System.out.println("Saldo atualizado: " + movimento);
		
		sc.close();
	}

}