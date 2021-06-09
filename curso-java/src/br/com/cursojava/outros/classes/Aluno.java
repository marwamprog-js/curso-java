package br.com.cursojava.outros.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private String cpf;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	public Aluno() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	
	//Método para retornar média de notas dos alunos.
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for(Disciplina disciplina: disciplinas) {
			somaNotas += disciplina.getNota();
		}		
				
		return somaNotas / disciplinas.size();
	}
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
}
