package entities;

public class Membros {
	
	public String nome;
	public int idade;
	public String matricula;
	
	
	public Membros() {
		
	}
	
	public Membros(String nome, int idade, String matricula) {
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
	}
	public void informacao() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Matrícula: " + this.matricula);
				
	}

}
