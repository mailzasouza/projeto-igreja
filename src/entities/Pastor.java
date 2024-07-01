package entities;

public class Pastor extends Membros{
	
	double salario;
	String planoDeSaude;
	
	Pastor(String nome, int idade, String matricula, double salario, String planoDeSaude){
		super(nome, idade, matricula);
		this.salario = salario;
		this.planoDeSaude = planoDeSaude;
	}

	
	public void informacao() {
		super.informacao();
		System.out.println("Nome: " + this.salario);
		System.out.println("Idade: " + this.planoDeSaude);
}
}