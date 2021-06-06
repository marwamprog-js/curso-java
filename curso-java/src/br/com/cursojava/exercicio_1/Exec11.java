/*
 * 
 * 
 * 11. Faça um Programa que peça 2 números inteiros e um número real.
 * Calcule e mostre:
 * a. o produto do dobro do primeiro com metade do segundo.
 * b. a soma do triplo do primeiro com o terceiro.
 * c. o terceiro elevado ao cubo.

 */

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec11 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro.: ");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número inteiro.: ");
		int num2 = scan.nextInt();
		
		System.out.println("Informe um número real.: ");
		double num3 = scan.nextDouble();
		
		double resultQuestaoA = (num1 * 2) + (num2 / 2);
		double resultQuestaoB = (num1 * 3) + (num3);
		double resultQuestaoC = Math.pow(num3, 3);
		
		System.out.println("Resultado letra A: " + resultQuestaoA);
		System.out.println("Resultado letra B: " + resultQuestaoB);
		System.out.println("Resultado letra C: " + resultQuestaoC);

	}

}
