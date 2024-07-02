package aplication;

import java.util.Scanner;

import entities.Membros;
import entities.Pastor;

public class Principal {

	public static void main(String[] args) {
		
		Pastor pastor = new Pastor("Mizael", 43, "036058", 2500.00, "Unimed");
		//Membros membro = new Membros("Marcelo", 25, "038256");
		pastor.informacao();
		
		//Scanner sc = new Scanner(System.in);
				
		/*System.out.println("INFORMAÇÃOES DO MEMBRO");
		System.out.println();
		System.out.print("Digite o nome do membro: ");
		String nome = sc.nextLine();
		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o número de matrícula: ");
		String matricula = sc.nextLine();
		Pastor pastor = new Pastor("Mizael", 43, "036058", 2500.00, "Unimed");
		membro.informacao();*/
		
		
		
		//sc.close();
	}

}
