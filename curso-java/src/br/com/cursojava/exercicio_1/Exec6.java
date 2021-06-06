/*
 * 
 * 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */


package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final double PI = 3.14;
		
		System.out.println("Informe o valor do raio.: ");
		double raio = scan.nextDouble();
		
		double area = PI * Math.pow(raio, 2);
		
		System.out.println("Área do circulo é.: " + area);
		
		

	}

}
