package br.com.cursojava.outros;

import br.com.cursojava.outros.classes.Aluno;
import br.com.cursojava.outros.classes.Diretor;
import br.com.cursojava.outros.classes.Secretario;

public class TestandoHeranca {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Marwam Malta");
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1351as135asda135");
		diretor.setNome("Felipe");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNome("Fernanda");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		

	}

}
