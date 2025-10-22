package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;
import exceptions.BusinessException;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		Account account;
		
		System.out.print("Enter acount number:");
		int number = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance:");
		double ib = sc.nextDouble();
		System.out.print("Withdraw Limit:");
		double wl = sc.nextDouble();
		
		account = new Account(number, holder, ib, wl);
		
		System.out.print("Enter amount for whithdraw:");
		Double amount = sc.nextDouble();
		
		try {
		account.withdraw(amount);
		System.out.printf("New balance: %.2f%n ", account.getBalance());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
