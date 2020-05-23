package aplicacao;

import java.util.Scanner;

import Componentes.Aula19_cProdutos;

public class Aula19_Produtos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto: ");
		System.out.println();
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		Double preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		Double qtd = sc.nextDouble();
		
		Aula19_cProdutos produto = new Aula19_cProdutos(nome, preco, qtd);
		
		//imprimindo os resultados de duas formas
		System.out.println("Você deu entrada em: " + produto); //chamando String do componente
		
		//adicionando unidades ao estoque
		System.out.println();
		System.out.print("Adicionar mais itens ao estoque: ");
		qtd = sc.nextDouble();
		produto.addProduto(qtd);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		//removendo unidades do estoque
		System.out.println();
		System.out.print("Remover itens do estoque: ");
		qtd = sc.nextDouble();
		produto.removerProduto(qtd);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();
	}

}
