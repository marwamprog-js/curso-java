/*
8. Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.
*/

package br.com.cursojava.exercicio_2.IF;

import java.util.Scanner;

public class Exec8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o preço do primeiro produto.: ");
		Double produto1 = scan.nextDouble();
		
		System.out.println("Informe o preço do segundo produto.: ");
		Double produto2 = scan.nextDouble();
		
		System.out.println("Informe o preço do terceiro produto.: ");
		Double produto3 = scan.nextDouble();
		
		if(produto1 < produto2 && produto1 < produto3) {
			System.out.println("Você deve comprar o produto 1 - R$" + produto1 );
		} else if(produto2 < produto1 && produto2 < produto3) {
			System.out.println("Você deve comprar o produto 2 - R$" + produto2 );
		} else if(produto3 < produto1 && produto3 < produto2) {
			System.out.println("Você deve comprar o produto 3 - R$" + produto3 );
		}
		

	}

}
