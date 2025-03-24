package Ex1;

import java.util.Locale;
import java.util.Scanner;
import entidade.Empregado;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);

		
		Empregado func = new Empregado();
		
		System.out.println("Nome:");
		func.nome = sc.nextLine();
		System.out.println("Salario:");
		func.salario = sc.nextDouble();
		System.out.println("Imposto:");
		func.imposto = sc.nextDouble();
		System.out.println("");
		System.out.println("Empregado:" + func);
		System.out.println("");
		System.out.println("Qual taxa deve ser o aumento?");
		double taxa = sc.nextDouble();
		func.aumentoSalario(taxa);
		System.out.println("");
		System.out.println("Dados atualizados:" + func);
		System.out.println("");
		sc.close();
		}

}
