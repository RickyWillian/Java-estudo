package entidade;

public class Empregado {
	public String nome;
	public double salario;
	public double imposto;
	
	public void aumentoSalario(double taxa) {
		salario += salario * taxa/ 100;
		
	}
	 public double netSalario() {
		 return salario - imposto;
		
	 }
	 
	 public String toString() {
		 return nome + ", $" + String.format("%.2f", netSalario());
	 }
}
