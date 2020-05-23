import java.util.Scanner;

public class Aula08_CondicaoTernaria {

	public static void main(String[] args) {
		// (condicao) ? <valor se verdadeiro> : <valor se falso>
		
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double desconto = (preco < 100) ? preco * 0.05 : preco * 0.1;
		
		System.out.println(preco + " - " + desconto + " = " + (preco - desconto));
		
		sc.close();		

	}

}
