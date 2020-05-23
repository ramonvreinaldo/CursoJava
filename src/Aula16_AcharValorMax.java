import java.util.Scanner;

public class Aula16_AcharValorMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira tr�s n�meros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("O maior n�mero digitado � o " + a);
		}
		else if (b > c) {
			System.out.println("O maior n�mero digitado � o " + b);
		}
		else {
			System.out.println("O maior n�mero digitado � o " + c);
		}
		
		//ou
		
		int maior = max(a, b ,c); //chama funcao max
		
		showResult(maior); //chama funcao showResult
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int resultado) {
		System.out.println("Maior � igual a " + resultado);
	}

}
