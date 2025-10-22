package entities;

public class Company extends Person {
	
	private Integer numberEmployees;

	public Company(String name, Double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double tax() {
		Double personTax;
		if(getNumberEmployees()<10) {
			personTax = getAnualIncome()*0.16;
		}
		else {
			personTax = getAnualIncome()*0.14;
		}
		
		return personTax;
	}
	

}
