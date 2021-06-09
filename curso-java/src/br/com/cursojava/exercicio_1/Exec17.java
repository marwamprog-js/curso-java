/*
17. Faça um Programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
galões de 3,6 litros, que custam R$ 25,00.
o Informe ao usuário as quantidades de tinta a serem compradas
e os respectivos preços em 3 situações:
o comprar apenas latas de 18 litros;
o comprar apenas galões de 3,6 litros;
o misturar latas e galões, de forma que o preço seja o
menor. Acrescente 10% de folga e sempre arredonde os
valores para cima, isto é, considere latas cheias.
*/

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec17 {

	final static double TINTA_LATA_LITROS = 18;
	final static double TINTA_GALAO_LITROS = 3.6;
	final static double TINTA_LATA_VALOR = 80;
	final static double TINTA_GALAO_VALOR = 25;
	final static double COBERTURA_TINTA_LITRO = 1;
	final static double COBERTURA_TINTA_METROS = 6;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o tamanho da área a ser pintada em Metros quadrados.: ");
		double area = scan.nextDouble();

		double quantidadeLitros = (COBERTURA_TINTA_METROS * area) / COBERTURA_TINTA_LITRO;

		double quantidadeLatasTinta = Math.ceil(quantidadeLitros / TINTA_LATA_LITROS);
		double quantidadeGaloesTinta = Math.ceil(quantidadeLitros / TINTA_GALAO_LITROS);
		
		double valorLatas = (TINTA_LATA_VALOR * quantidadeLatasTinta) / 1;
		double valorGaloes = (TINTA_GALAO_VALOR * quantidadeGaloesTinta) / 1;

		System.out.println("Quantidade de LITROS: " + quantidadeLitros);
		System.out.println("Quantidade de LATAS: " + quantidadeLatasTinta);
		System.out.println("Valor de LATAS: R$ " + valorLatas);
		System.out.println("Quantidade de GALÕES: " + quantidadeGaloesTinta);
		System.out.println("Valor de GALÕES: R$ " + valorGaloes);

	}

}
