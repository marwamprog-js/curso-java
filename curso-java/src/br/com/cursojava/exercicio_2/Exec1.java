/*
1. Faça um Programa que peça dois números e imprima o maior deles.
*/

package br.com.cursojava.exercicio_2;

import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro.: ");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número inteiro.: ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro numero (" + num1 + ") é maior que o segundo numero (" + num2 + ")");
		} else {
			System.out.println("O segundo numero (" + num2 + ") é maior que o primeiro numero (" + num1 + ")");
		}

	}

}
