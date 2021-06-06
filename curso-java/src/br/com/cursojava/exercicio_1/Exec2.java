/*
 * 2. Faça um Programa que peça um número e então mostre a 
 * mensagem O número informado foi [número].
 */


package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número.: ");
		int numero = scan.nextInt();
		
		System.out.println("O número informado foi " + numero);

	}

}
