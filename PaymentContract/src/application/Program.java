package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		Integer number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy); ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double value = sc.nextDouble();
		
		Contract contract = new Contract(number, date, value);
		
		System.out.print("Entre com o número de parcelas: ");
		Integer n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, n);
		
		System.out.println("Parcelas: ");
		for (Installment installment : contract.getInstallment()) {
			System.out.println(installment);
		}
		sc.close();
		
	}
	

}
