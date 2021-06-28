/*
2. Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.
*/


package br.com.cursojava.exercicio_2.IF;

import java.util.Scanner;

public class Exec2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro.: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O número " + num + " é PAR");
		} else {
			System.out.println("O número " + num + " é IMPAR");
		}

	}

}
