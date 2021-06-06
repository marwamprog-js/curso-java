/*
 * 
 * 12. Tendo como dados de entrada a altura de uma pessoa, construa um
 * algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
 * (72.7*altura) - 58
 */


package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua altura.: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.2 * altura) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		

	}

}
