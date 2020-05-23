import java.util.Scanner;

public class Aula12_For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nvezes = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<nvezes; i=i+1) {
			int x = sc.nextInt();
			soma = soma + x;
			}
		
		System.out.println(soma);
		
		sc.close();
	}

}
