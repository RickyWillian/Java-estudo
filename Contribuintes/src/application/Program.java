package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

// exercicio de classe abstrata.
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();
			
		System.out.println("Enter the number fo tax payers:");
		 int n = sc.nextInt();
		 
		 for (int i = 1; i<=n; i++) {
			 System.out.println("Tax payer #" + i + " data");
			 System.out.println("Individual or Company (i/c)?");
			 char type = sc.next().charAt(0);
			System.out.print("Name:");
			String name = sc.next();
			System.out.print("Anual Income:");
			double anualIncome = sc.nextDouble();
			 if (type == 'i') {
				 System.out.print("Health expenditures:");
				 double healthExpenditures = sc.nextDouble();
				 list.add(new Individual(name, anualIncome, healthExpenditures));				 
			 }
			 else {
				 System.out.println("Number of employees:");
				 int numberEmployees = sc.nextInt();
				 list.add(new Company(name, anualIncome, numberEmployees));
			 }
		 }
		 System.out.println();
		 System.out.println();
		 double totalTaxes = 0;
		 System.out.println("TAXES PAID:");
		 for (Person person: list) {
			 
			 System.out.println(person.getName() + ": $" + String.format("%.2f", person.tax()));
			 totalTaxes += person.tax();
			 
		 }
		 System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalTaxes));
		 sc.close();
	}

}
