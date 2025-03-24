package entities;

public class Conta {
	private String holder;
	private int number;
	private double balance;
	
	
	public void deposito(double amount) {
		balance+=amount;
		
	}
	public void saque(double amount) {
		balance -= amount +5;		
	}
	public Conta(String holder, int number) {
		this.holder = holder;
		this.number = number;
	}
	public Conta(String holder, int number, double initialDeposit) {
		this.holder = holder;
		this.number = number;
		deposito(initialDeposit);
	}
	public String getNome() {
		return holder;
	}
	public void setNome(String holder) {
		this.holder = holder;
	}
	public int getN_conta() {
		return number;
	}
	public double getSaldo() {
		return balance;
	}
	public String toString() {
		return "Account "
				+number
				+", Holder: "
				+holder
				+", Balance: $ "
				+ String.format("%.2f", balance);
	}

	

}
