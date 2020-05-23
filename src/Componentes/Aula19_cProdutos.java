package Componentes;

public class Aula19_cProdutos {
	
	private String nome;
	private double preco;
	private double qtd;
	
	public Aula19_cProdutos() {
	}
	
	public Aula19_cProdutos(String nome, double preco, double qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Aula19_cProdutos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQtd() {
		return qtd;
	}

	public double totalValorEstoque() {
		return preco * qtd;
	}
	
	public void addProduto(double qtd) {
		this.qtd += qtd;
	}
	
	public void removerProduto(double qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return  nome
				+ " - R$ "
				+ String.format("%.2f", preco)
				+ " x "
				+ String.format("%.2f", qtd)
				+" unidade(s) - Valor total: R$ "
				+ String.format("%.2f", totalValorEstoque());
	}

}
