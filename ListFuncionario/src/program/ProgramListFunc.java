package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramListFunc {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcionarios serão cadastrados?");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++ ) {
			System.out.println("Funcionario #" + i+1 + ":");
			System.out.println("ID:");
			Integer id = sc.nextInt();
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario:");
			Double salario = sc.nextDouble();
			
			Funcionario func = new Funcionario (id, nome, salario);
			list.add(func);			
		}
		System.out.print("Entre com o id do funcionario que vai receber o aumento:");
		int idSla = sc.nextInt();
		Integer pos = temId(list, idSla);
		if (pos == null) {
			System.out.print("Esse id não existe");
		}
		else {
			System.out.print("Qual a porcentagem do aumento?");
			double percent = sc.nextDouble();
			list.get(pos).aumento(percent);
			for (Funcionario func: list) {
				System.out.print(func);
			}
			
		}
				
		sc.close();
	}
	
	public static Integer temId(List<Funcionario> list, int id){
		for (int i = 0; i<list.size(); i++) {
			if (list.get(i).getId() == id )
				return i;
		}
	return null;
	}
	}


