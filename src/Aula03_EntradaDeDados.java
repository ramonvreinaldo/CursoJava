import java.util.Scanner;

public class Aula03_EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		
		nome = sc.next();
		idade = sc.nextInt();
		altura = sc.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.printf("Altura: %.2f%n", altura);
		
		sc.close();
	}

}
