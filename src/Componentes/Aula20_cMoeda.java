package Componentes;

public class Aula20_cMoeda {
	
	public double valor;
	public double cotacao;

	public double totalIof() {
		return (cotacao * valor * 0.0628) + (cotacao * valor);
	}
	
	public double total() {
		return cotacao * valor;
	}
	
	public double iof() {
		return cotacao * valor * 0.0628;
	}
	

	public String toString() {
		return  "O valor total para aquisição de "
				+ String.format("%.2f", valor)
				+ " USD é de R$ "
				+ String.format("%.2f", totalIof())
				+ ". Sendo R$ "
				+ String.format("%.2f", total())
				+" de conversão + IOF de R$ "
				+ String.format("%.2f", iof());
	}
}
