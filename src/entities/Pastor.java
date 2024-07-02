package entities;

public class Pastor extends Membros{
	
	double salario;
	String planoDeSaude;
	
	public Pastor(String nome, int idade, String matricula, double salario, String planoDeSaude){
		super(nome, idade, matricula);
		this.salario = salario;
		this.planoDeSaude = planoDeSaude;
	}

	
	public void informacao() {
		super.informacao();
		System.out.println("Salário: " + this.salario);
		System.out.println("Plano de saúde: " + this.planoDeSaude);
}
}