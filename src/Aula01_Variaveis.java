
public class Aula01_Variaveis {

	public static void main(String[] args) {
		// int -> Numero Inteiro
		// double -> Numero Decimal
		// String -> Texto
		// boolean -> Verdadeiro ou Falso
		
		// %f -> ponto flutuante
		// %d -> inteiro
		// %s -> texto
		// %n -> quebra de linha
		
		String Nome = "Ramon";
		int idade = 31;
		double altura = 1.70;
		
		System.out.printf("Meu nome é " + Nome + ", tenho " + idade + " anos e " + altura + " de altura.%n%n");
		
		System.out.printf("Meu nome é %s, tenho %d anos e %.2f de altura", Nome, idade, altura);		

	}

}
