/*
 * 
 * 10. Faça um Programa que peça a temperatura em graus Celsius,
 * transforme e mostre em graus Farenheit.
 * (°C × 1.8) + 32
 */

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a temperatura em Celsius.: ");
		double celsius = scan.nextDouble();

		double farenheit = (celsius * 1.8) + 32;

		System.out.println("Valor da temperatura em Celsius.: " + celsius);
		System.out.println("Valor da temperatura em Farenheit.: " + farenheit);

	}

}
