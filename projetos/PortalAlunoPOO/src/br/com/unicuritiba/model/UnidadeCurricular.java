package br.com.unicuritiba.model;

public class UnidadeCurricular {
	private String nome;
	private Professor professor;
	private Atividade[] atividades;
	private Aluno[] alunos;
	
	public UnidadeCurricular(String nome, Professor professor, 
			Atividade[] atividades, Aluno[] alunos) {
		this.nome = nome;
		this.professor = professor;
		this.atividades = atividades;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Atividade[] getAtividades() {
		return atividades;
	}
	public void setAtividades(Atividade[] atividades) {
		this.atividades = atividades;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}	
}
