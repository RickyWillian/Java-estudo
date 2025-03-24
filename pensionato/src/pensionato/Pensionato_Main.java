package pensionato;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Pensionato_Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		Rent[] quarto = new Rent[10];
		
		for(int i =1;i<=n;i++) {
			System.out.println();
			System.out.println("Rent #" + i +":");
			System.out.println("Name:");
			sc.nextLine();
			String nome =  sc.nextLine();
			System.out.println("E-mail:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int position = sc.nextInt();
			quarto[position] = new Rent (nome, email);
		}
		System.out.println("Bussy rooms:");
		for (int i =0;i<10;i++) {
			if(quarto[i]!= null) {
				System.out.println(i + ": " + quarto[i]);
			}
		}
		sc.close();
	}

}
