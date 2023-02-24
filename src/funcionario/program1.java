package funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;
public class program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();
		
		//INSERINDO FUNCIONARIOS NO SISTEMA
		
		System.out.print("Quantos clientes serão registrados? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i+1) + ":");
			
			System.out.print("Id:");
			Integer Id = sc.nextInt();
			
			System.out.print("Nome:");
			String name = sc.nextLine();
			
			sc.nextLine();

			System.out.print("Salario:");
			Double salary= sc.nextDouble();
			
			Funcionarios fun = new Funcionarios(Id, name, salary);
			
			list.add(fun);
			
		}
		
		//ATUALIZANDO SALARIO DE FUNCIONARIO
		
		System.out.print("Id do funcionario que terá o salario aumentado: ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		
		if(pos == null) {
			System.out.println("Esse Id não existe!");
		}
		else {
			System.out.println("Insira a porcentagem: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for(Funcionarios fun : list) {
			System.out.println(fun);
		}
		
		
		
		
		
		
		
		sc.close();
		

	}
	
	public static Integer position(List<Funcionarios> list, int id) {
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	

}
