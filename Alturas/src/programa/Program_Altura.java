package programa;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program_Altura {

	public static void main() {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		Pessoa[] vet = new Pessoa[n];
		
		for (int i=0;i<n;i++) {
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();
			vet[i]= new Pessoa(nome, idade, altura);
		}
		double totalAltura=0.0;
		int jovem=0;
		
		for (int i=0;i<vet.length;i++) {
			totalAltura += vet[i].getAltura();
			if (vet[i].getIdade()<16)
				jovem++;
		}
		System.out.printf("Altura media %.2f", totalAltura/vet.length );
		System.out.printf("Pessoas com menos de 16 anos %.1f", (jovem*100)/vet.length );
		for (int i=0;i<vet.length;i++) {
			if (vet[i].getIdade()<16)
				System.out.printf(vet[i].getNome());
		}
		
		sc.close();
	}

}
