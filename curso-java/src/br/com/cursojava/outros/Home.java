package br.com.cursojava.outros;

import javax.swing.JOptionPane;

import br.com.cursojava.outros.classes.Aluno;
import br.com.cursojava.outros.classes.Disciplina;

public class Home {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno.: ");
		String cpf = JOptionPane.showInputDialog("Digite o CPF do aluno.: ");
				
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		
		for(int pos = 1; pos <= 4; pos++) {
			
			Disciplina disciplina = new Disciplina();
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+ pos +".: ");
			disciplina.setDisciplina(nomeDisciplina);
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+ nomeDisciplina +".: ");
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4? ");
			
			aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);		
		}
		
		
		
		double media = aluno.getMediaNota();
		
		if(media > 70) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Média: " + media);
			System.out.println("APROVADO");
		} else {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Média: " + media);
			System.out.println("REPROVADO");
		}
		
		
		
		
		
	}

}
