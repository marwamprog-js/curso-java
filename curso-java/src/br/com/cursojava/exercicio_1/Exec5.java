/*
 * 
 * 5. Faça um Programa que converta metros para centímetros.
 */

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double convercao = 100;
		
		
		System.out.println("Informe a medida em metros.: ");
		double metros = scan.nextDouble();
		
		double valorCentimetros = metros * convercao;
		
		System.out.println(metros + "m é igual a " + valorCentimetros + "cm");
		
	}

}
