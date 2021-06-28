/*
5. Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
	
	* A mensagem "Aprovado", se a média alcançada for maior ou
	igual a sete;
	* A mensagem "Reprovado", se a média for menor do que sete;
	* A mensagem "Aprovado com Distinção", se a média for igual a
	dez.
*/

package br.com.cursojava.exercicio_2.IF;

import java.util.Scanner;

public class Exec5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno.: (0 - 10)");
		Double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segundo nota do aluno.: (0 - 10)");
		Double nota2 = scan.nextDouble();
		
		Double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("Nota Final: "+media+" - Aprovado com Distinção");
		} else if(media >= 7) {
			System.out.println("Nota Final: "+media+" - Aprovado");
		} else {
			System.out.println("Nota Final: "+media+" - Reprovado");
		}
		

	}

}
