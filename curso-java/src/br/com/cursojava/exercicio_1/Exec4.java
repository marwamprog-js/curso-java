/*
 * 
 * 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota.: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a segunda nota.: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Informe a terceira nota.: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Informe a quarta nota.: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média do aluno.: " + media);

	}

}
