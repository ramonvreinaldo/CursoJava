
public class Aula26_ForEach {

	public static void main(String[] args) {
		
		String[] vetor = new String[] {"Ramon", "Elaine", "Liz"};
		
		for (int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("--------");
		
		for (String obj : vetor) {
			System.out.println(obj);
		}
	}
	

}
