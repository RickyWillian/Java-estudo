package exercicio3;

import java.util.Locale;
import java.util.Scanner;
import entidade.Aluno;

public class Pgm {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		Aluno estudante = new Aluno();
		
		System.out.println("Nome:");
		estudante.nome = sc.nextLine();
		System.out.println("Nota 1:");
		estudante.n1 = sc.nextDouble();
		System.out.println("Nota 2:");
		estudante.n2 = sc.nextDouble();
		System.out.println("Nota 3:");
		estudante.n3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", estudante.notaFim());
		
		if (estudante.notaFim() < 60) {
			System.out.println("Reprovou");
			System.out.printf("Falta %.2f% pontos",estudante.falta());
		}
		else
			System.out.println("Aprovado");
		sc.close();
	}

}
