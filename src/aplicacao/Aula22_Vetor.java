package aplicacao;

import java.util.Scanner;

public class Aula22_Vetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] vetor = new double[n]; //criacao do vetor
		
		for (int i=0; i<n; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i=0; i<n; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		
		System.out.printf("Média é igual a: %.2f", media);
		
		sc.close();

	}

}
