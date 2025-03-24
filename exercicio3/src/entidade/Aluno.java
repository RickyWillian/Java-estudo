package entidade;

public class Aluno {
	public String nome;
	public double n1, n2, n3;
	
	
	public double notaFim(){
	return n1 + n2 + n3;
	}
	public double falta() {
		return notaFim() - 60;
		}
		
	
}
