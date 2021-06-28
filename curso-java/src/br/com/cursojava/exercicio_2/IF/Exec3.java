/*
3 - Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
*/

package br.com.cursojava.exercicio_2.IF;

import java.util.Scanner;

public class Exec3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o sexo (F - Feminino ou M - Masculino).: ");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		} else if(letra.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo Inválido");
		}
		

	}

}
