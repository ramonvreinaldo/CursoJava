import java.util.Scanner;

public class Aula04_EntradaQuebraLinhas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		String nome, nmeio, sobrenome;
		
		idade = sc.nextInt();
		sc.nextLine();
		nome = sc.nextLine();
		nmeio = sc.nextLine();
		sobrenome = sc.nextLine();
		
		System.out.print(idade + " anos, ");
		System.out.printf("%s %s %s.", nome, nmeio, sobrenome);
		
		sc.close();
	}

}
