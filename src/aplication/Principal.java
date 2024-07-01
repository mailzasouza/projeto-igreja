package aplication;

import java.util.Scanner;

import entities.Membros;
import entities.Pastor;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("INFORMAÇÃOES DO MEMBRO");
		System.out.println();
		System.out.print("Digite o nome do membro: ");
		String nome = sc.nextLine();
		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o número de matrícula: ");
		String matricula = sc.nextLine();
		Membros membro = new Membros(nome, idade, matricula);
		membro.informacao();
		
		
		
		sc.close();
	}

}
