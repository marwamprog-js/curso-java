package br.com.cursojava.outros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.cursojava.outros.classes.Aluno;
import br.com.cursojava.outros.classes.Disciplina;
import br.com.cursojava.outros.classes.StatusAluno;

public class Home {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe o senha");
		
		if(login.equalsIgnoreCase("admin") && 
				senha.equalsIgnoreCase("123")) {
			List<Aluno> alunos = new ArrayList<Aluno>();
			
			
			/*
			 * É uma lista que dentro dela temos uma chave que identifica uma sequencia de valores
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			
			for(int i = 1; i <= 3; i++) {
				
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
				
				alunos.add(aluno);
			}
			
					
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			
			for(Aluno aluno : alunos) {
				
				if(aluno.getMediaNota() >= 50) {
					
					if(aluno.getMediaNota() >= 70) {
						maps.get(StatusAluno.APROVADO).add(aluno);	
					} else {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					}
					
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);					
				}			
			}
			
			
			System.out.println("-------LISTA APROVADOS-------");
			if(maps.get(StatusAluno.APROVADO).size() > 0) {
				for(Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Resultado = " + aluno.getNome() + "\n com média de = " + aluno.getMediaNota() + "\n\n");
				}	
			} else {
				System.out.println("Nenhum aluno " + StatusAluno.APROVADO);
			}
			
			
			System.out.println("-------LISTA RECUPERACAO--------");
			if(maps.get(StatusAluno.RECUPERACAO).size() > 0) {
				for(Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Resultado = " + aluno.getNome() + "\n com média de = " + aluno.getMediaNota() + "\n\n");
				}
			} else {
				System.out.println("Nenhum aluno de " + StatusAluno.RECUPERACAO);
			}
			
			System.out.println("-------LISTA REPROVADO--------");
			if(maps.get(StatusAluno.REPROVADO).size() > 0) {
				for(Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Resultado = " + aluno.getNome() + "\n com média de = " + aluno.getMediaNota() + "\n\n");
				}	
			} else {
				System.out.println("Nenhum aluno " + StatusAluno.REPROVADO);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Senha ou usuário inválidos");
		}
		
		
		
	}

}
