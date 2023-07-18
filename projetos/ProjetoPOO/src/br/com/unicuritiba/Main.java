package br.com.unicuritiba;

import java.util.Scanner;

import br.com.unicuritiba.model.Aluno;
import br.com.unicuritiba.model.Professor;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nomeProfessor, matriculaProfessor, emailProfessor;
		String nomeAluno, cpfAluno, emailAluno, contatoAluno;
		int numeroAlunos;
		
		System.out.println("Cadastro de professor(a)");
		System.out.print("\nDigite o nome do(a) professor(a): ");
		nomeProfessor = scanner.nextLine();		
		System.out.print("Digite a matricula do(a) professor(a): ");
		matriculaProfessor = scanner.nextLine();
		System.out.print("Digite o e-mail do(a) professor(a): ");
		emailProfessor = scanner.nextLine();
		System.out.print("Digite o número de alunos que serão cadastros: ");
		numeroAlunos = scanner.nextInt();
		scanner.nextLine();
		
		Professor professor = new Professor();
		professor.setNome(nomeProfessor);
		professor.setMatricula(matriculaProfessor);
		professor.setEmail(emailProfessor);
		
		System.out.println("\n--------------------------------------------------------------\n");
		
		System.out.println("Cadastro de aluno(a)\n");
		
		Aluno[] alunos = new Aluno[numeroAlunos];
		
		for(int indice = 0; indice < numeroAlunos; indice++) {
			System.out.println("Aluno(a) " + (indice + 1));
			System.out.print("Digite o nome do(a) aluno(a): ");
			nomeAluno = scanner.nextLine();		
			System.out.print("Digite o CPF do(a) aluno(a): ");
			cpfAluno = scanner.nextLine();
			System.out.print("Digite o e-mail do(a) aluno(a): ");
			emailAluno = scanner.nextLine();
			System.out.print("Digite o contato do(a) aluno(a): ");
			contatoAluno = scanner.nextLine();
				
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setCpf(cpfAluno);
			aluno.setEmail(emailAluno);
			aluno.setContato(contatoAluno);
			
			alunos[indice] = aluno;
			
			System.out.println();
			
		}
		
		System.out.println("--------------------------------------------------------------\n");
		
		System.out.println("Alunos cadastrados\n");
		
		for(int indice = 0; indice < numeroAlunos; indice++) {
			System.out.println("Aluno(a) " + (indice + 1));
			System.out.println("Nome do(a) aluno(a): " + alunos[indice].getNome());
			System.out.println("CPF do(a) aluno(a): " + alunos[indice].getCpf());
			System.out.println("E-mail do(a) aluno(a): " + alunos[indice].getEmail());
			System.out.println("Contato do(a) aluno(a): " + alunos[indice].getContato());
			
			System.out.println();
		}
		
		System.out.print("Total de alunos cadastrado: " + numeroAlunos);
		
		scanner.close();
	}

}
