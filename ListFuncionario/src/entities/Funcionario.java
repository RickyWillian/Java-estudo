package entities;

public class Funcionario {
	private Integer id;
	private String nome;
	private double salario;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}
	
	public double aumento(double porcentagem) {
		salario += + ((porcentagem*salario)/100);
		return salario;
	}


	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
}
