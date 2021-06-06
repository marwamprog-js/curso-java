/*
 * 3. Faça um Programa que peça dois números e imprima a soma.
 * */

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número.: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Informe o segundo número.: ");
		double num2 = scan.nextDouble();
		
		double soma = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + soma);
	}

}
