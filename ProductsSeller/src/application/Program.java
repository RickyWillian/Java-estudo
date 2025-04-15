package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.print("Common, used, or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = Double.parseDouble(sc.nextLine());
			Product p;
			switch (ch) {
			
				case 'c':{
					p = new Product(name, price);
					list.add(p);
					break;
					}
				case 'u':{
					System.out.print("Manufacture Date: (dd/MM/aaa)");
					String date = sc.nextLine();
					LocalDate manufactureDate = LocalDate.parse(date, formatter);
					p = new UsedProduct (name, price, manufactureDate);
					list.add(p);
					break;
				}
				case 'i':{
					System.out.print("Customs Fee: ");
					Double customsFee = Double.parseDouble(sc.nextLine());
					p = new ImportedProduct(name, price, customsFee);
					list.add(p);
					break;
				}
				
			}	
		}
		System.out.println("PRICE TAGS:");
		for(Product p: list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
