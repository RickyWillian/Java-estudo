package entities;

public class Individual extends Person{

	private Double healthExpenditures;

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		Double personTax = 0.0;
		if ((getAnualIncome()<20000) && (getHealthExpenditures()>0)) {
			personTax = (getAnualIncome()*0.15)-(getHealthExpenditures()*0.50);
		}
		else if ((getAnualIncome()<20000) && (getHealthExpenditures()==0)) {
			personTax = (getAnualIncome()*0.15);
		}
		else if  ((getAnualIncome()>=20000) && (getHealthExpenditures()>0)) {
			personTax = (getAnualIncome()*0.25)-(getHealthExpenditures()*0.50);
		}
		else if ((getAnualIncome()>=20000) && (getHealthExpenditures()==0)) {
			personTax = (getAnualIncome()*0.25);
		}
		return personTax;
	}
	
}
