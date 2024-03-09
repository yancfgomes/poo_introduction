package project;

import java.util.Scanner;

public class Teste_aluno {
	public static void main(String[]args) {
		Aluno al1 = new Aluno();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		al1.nome=in.next();
		
		System.out.println("Digite a idade do aluno: ");
		al1.idade=in.nextInt();
		
		System.out.println("O nome do aluno: " + al1.nome);
		System.out.println("Idade do aluno: " + al1.idade);
	}
	

}
