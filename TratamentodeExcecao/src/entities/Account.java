package entities;

import exceptions.BusinessException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double whithdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = whithdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Double getWhithdrawLimit() {
		return withdrawLimit;
	}

	public void setWhithdrawLimit(Double whithdrawLimit) {
		this.withdrawLimit = whithdrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	public void withdraw (Double amount) {
		validateWithdraw(amount);
		this.balance -= amount;
	}
	
	private void validateWithdraw(Double amount) {
		if (amount > getWhithdrawLimit()) {
			throw new BusinessException("The amount exceeds withdraw limit");
		}
		if (amount > getBalance()) {
			throw new BusinessException("Not enough balance");
		}
	}
	
	
	
	
	
	

}
