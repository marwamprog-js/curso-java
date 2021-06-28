/*
9. Faça um Programa que leia três números e mostre-os em ordem
decrescente.
*/

package br.com.cursojava.exercicio_2.IF;

import java.util.Scanner;

public class Exec9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número.: (INTEIROS)");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo número.: (INTEIROS)");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro número.: (INTEIROS)");
		int num3 = scan.nextInt();

		String mensagem = "";
		
		if(num1 < num2 && num1 < num3) {
			mensagem += num1 + " - ";
			
			if(num2 < num3) {
				mensagem += num2 + " - " + num3;
			} else {
				mensagem += num3 + " - " + num2;
			}
		} else if(num2 < num1 && num2 < num3) {
			mensagem += num2 + " - ";
			
			if(num1 < num3) {
				mensagem += num1 + " - " + num3;
			} else {
				mensagem += num3 + " - " + num1;
			}
		} else if(num3 < num1 && num3 < num2) {
			mensagem += num3 + " - ";
			
			if(num1 < num2) {
				mensagem += num1 + " - " + num2;
			} else {
				mensagem += num2 + " - " + num1;
			}
		}
		
		
		System.out.println(mensagem);
		
	}

}
