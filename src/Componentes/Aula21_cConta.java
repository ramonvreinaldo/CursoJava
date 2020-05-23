package Componentes;

public class Aula21_cConta {
	
	private int conta;
	private String nome;
	private double lancamento;
	
	public Aula21_cConta(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	public Aula21_cConta(int conta, String nome, double inicialDeposito) {
		this.conta = conta;
		this.nome = nome;
		depositoSaldo(inicialDeposito);
	}

	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLancamento() {
		return lancamento;
	}
	
	public void depositoSaldo(double lancamento) {
		this.lancamento += lancamento;
	}
	
	public void saqueSaldo(double lancamento) {
		this.lancamento -= lancamento + 5.0;
	}
	
	public String toString() {
		return  "Conta "
				+ conta
				+ ", titular: "
				+ nome
				+ ", Saldo: R$ "
				+ String.format("%.2f", lancamento);
	}
	

}
