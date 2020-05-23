package aplicacao;

import java.util.Scanner;

import Componentes.Aula20_cMoeda;

public class Aula20_ConverterMoeda {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aula20_cMoeda cambio = new Aula20_cMoeda();
		
		System.out.print("Informe a quantidade de moeda estrangeira: ");
		cambio.valor = sc.nextDouble();
		System.out.print("Informe a cotação do momento: ");
		cambio.cotacao = sc.nextDouble();
		
		System.out.println();
		System.out.println(cambio); //chamando String do componente
		
		sc.close();
		
	}

}
