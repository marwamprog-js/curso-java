/*
 * 
 * 
 * 7. Faça um Programa que calcule a área de um quadrado, em seguida
 * mostre o dobro desta área para o usuário.
 */


package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o lado do quadrado.: ");
		double lado = scan.nextDouble();
				
		double area = Math.pow(lado, 2); 
		
		System.out.println("Área do quadrado.: " + area);
		System.out.println("Área do quadrado em dobro.: " + (area * 2));
	}

}
