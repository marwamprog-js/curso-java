/*
10.Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso.
*/
package br.com.cursojava.exercicio_2.IF;

import java.util.Scanner;

public class Exec10 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno estuda? (M-matutino ou V-Vespertino ou N- Noturno)");
		String turno = scan.next();
		
		
		switch (turno) {
		case "M":
			System.out.println("Bom Dia!");
			break;
		case "V":
			System.out.println("Boa Tarde!");
			break;
		case "N":
			System.out.println("Boa Noite!");
			break;

		default:
			System.out.println("Valor Inválido!");
			break;
		}

	}

}
