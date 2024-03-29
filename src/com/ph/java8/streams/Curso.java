package com.ph.java8.streams;

public class Curso {

	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		super();
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}
	
	@Override
	public String toString() {
		return "Curso: " + nome + " - Quantidade de Alunos: " + alunos;
	}
	
}
