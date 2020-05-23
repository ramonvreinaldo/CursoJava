package aplicacao;

import java.util.Scanner;
import Componentes.Aula23_cVetor;

public class Aula23_Vetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Aula23_cVetor[] vetor = new Aula23_cVetor[n];
		
		for (int i=0; i<vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Aula23_cVetor(nome, preco);
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vetor[i].getPreco();
		}
		double media = soma / n;
		
		System.out.printf("%nMédia é igual a: %.2f", media);
		
		sc.close();

	}

}