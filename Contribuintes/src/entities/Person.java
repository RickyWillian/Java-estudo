package entities;

public abstract class Person {

	
	protected static String name;
	private Double anualIncome;
	
	
	
	public Person(String name, Double anualIncome) {
		Person.name = name;
		this.anualIncome = anualIncome;
	}
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		Person.name = name;
	}
	public Double getAnualIncome() {
		return anualIncome;
	}
	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double tax();
	
}
