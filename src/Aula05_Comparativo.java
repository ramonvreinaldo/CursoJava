import java.util.Scanner;

public class Aula05_Comparativo {

	public static void main(String[] args) {
		// > (maior)
		// < (menor)
		// >= (maior ou igual)
		// <= (menor ou igual)
		// == (igual)
		// != (diferente)
		
		Scanner sc = new Scanner(System.in);
		
		double hora = sc.nextDouble();
				
		if (hora < 12) {System.out.println("Bom dia!");}
		else if (hora < 18) {System.out.println("Boa tarde!");}
		else {System.out.println("Boa noite!");}
		
		sc.close();		

	}

}
