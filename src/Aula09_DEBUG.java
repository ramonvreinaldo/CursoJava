import java.util.Locale;
import java.util.Scanner;

public class Aula09_DEBUG {
	public static void main(String[] args) {
		// (Run -> Toggle Breakpoint) - Para marcar uma linha de breakpoint
		// (Botão direito na classe -> Debug as -> Java Application) - Para iniciar o debug
		// (F6) - Para executar uma linha
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}
}