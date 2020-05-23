package aplicacao;
import java.util.Scanner;
import Componentes.Aula24;
public class Aula24_VetorExercicio {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quartos = 10;
		Aula24[] vetor = new Aula24[quartos];
		
		System.out.print("Quantidade de quartos ocupados: ");
		int ocupados = sc.nextInt();
		
		for (int i=0; i<ocupados; i++) {
			sc.nextLine();
			System.out.println();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Número do quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aula24(nome, email);
		}
			
		System.out.println();
		System.out.println("Quartos ocupados:");
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
		sc.close();
	}

}
