/*
 * 9. Faça um Programa que peça a temperatura em graus Farenheit,
 * transforme e mostre a temperatura em graus Celsius.
 * C = (5 * (F-32) / 9).
 * */

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec9 {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit.: ");
		double farenheit = scan.nextDouble();
		
		double celsius = (5 * (farenheit - 32) / 9);
		
		System.out.println("Valor da temperatura em Farenheit.: " + farenheit);
		System.out.println("Valor da temperatura em Celsius.: " + celsius);
		
	}

}
