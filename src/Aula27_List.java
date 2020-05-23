import java.util.ArrayList;
import java.util.List;

public class Aula27_List {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Ramon");
		lista.add("Elaine");
		lista.add("Liz");

		lista.add(1, "Sonia"); //Adicionando item na posi��o "1" da lista
		
		System.out.println(lista.size()); //Exibir n�mero de posi��es na lista
		System.out.println("------");
		
		for (String a : lista) {
			System.out.println(a);}
			
		lista.remove("Sonia"); //Remover valor da lista
		lista.remove(0); //remover posi��o 0
		
		System.out.println("------");
		
		for (String b : lista) {
			System.out.println(b);}
		
		System.out.println("------");
		
		System.out.println("Encontrar posi��o de Liz: " + lista.indexOf("Liz"));
	}

}
