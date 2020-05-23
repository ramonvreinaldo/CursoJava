package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Componentes.Aula28_cEmpregados;

public class Aula28_Empregados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Aula28_cEmpregados> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			list.add(new Aula28_cEmpregados(id, nome, salario));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Aula28_cEmpregados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.reajuste(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (Aula28_cEmpregados obj : list) {
			System.out.println(obj);
		}
		
		
		sc.close();

	}
	
	public static boolean hasId(List<Aula28_cEmpregados> list, int id) {
		Aula28_cEmpregados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
