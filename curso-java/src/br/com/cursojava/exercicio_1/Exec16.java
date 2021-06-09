/*
16. Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total.
*/

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec16 {

	final static double TINTA_LATA_LITROS = 18;
	final static double TINTA_LATA_VALOR = 80;
	final static double COBERTURA_TINTA_LITRO = 1;
	final static double COBERTURA_TINTA_METROS = 3;
	
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da área a ser pintada em Metros quadrados.: ");
		double area = scan.nextDouble();
	
		double quantidadeLitros = (COBERTURA_TINTA_METROS * area) / COBERTURA_TINTA_LITRO;
		
		double quantidadeLatasTinta = Math.ceil(quantidadeLitros / TINTA_LATA_LITROS);
		
		System.out.println(quantidadeLitros);
		System.out.println(quantidadeLatasTinta);
		
		

	}
	
	

}
