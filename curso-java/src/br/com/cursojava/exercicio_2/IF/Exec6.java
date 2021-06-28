/*
6. Faça um Programa que leia três números e mostre o maior deles.
*/

package br.com.cursojava.exercicio_2.IF;

import java.util.Scanner;

public class Exec6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número.: (INTEIROS)");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número.: (INTEIROS)");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro número.: (INTEIROS)");
		int num3 = scan.nextInt();

		
		if(num1 > num2 && num1 > num3) {
			System.out.println("O número " + num1 + " é maior");
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("O número " + num2 + " é maior");
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("O número " + num3 + " é maior");
		}
		
	}

}
