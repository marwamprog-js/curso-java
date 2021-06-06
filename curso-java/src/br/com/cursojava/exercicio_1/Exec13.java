/*
 * 13. Tendo como dados de entrada a altura e o sexo de uma pessoa,
 * construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso.
 */

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec13 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		double pesoIdeal = 0;
		
		System.out.println("Informe sua altura.: ");
		double altura = scan.nextDouble();
		
		System.out.println("Informe seu sexo (M ou F).: ");
		String sexo = scan.next();
		
		if(sexo.equals("M")) {
			pesoIdeal = (72.7 * altura) - 58;
		} else {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		
		System.out.println("Informe seu peso atual.: ");
		double pesoAtual = scan.nextDouble();
		
		if(pesoAtual > pesoIdeal) {
			System.out.println("Seu peso ideal é " + pesoIdeal);
			System.out.println("Você esta acima do peso.");
		} else if(pesoAtual == pesoIdeal){
			System.out.println("Seu peso ideal é " + pesoIdeal);
			System.out.println("Você está dentro do peso.");
		} else {
			System.out.println("Seu peso ideal é " + pesoIdeal);
			System.out.println("Você está abaixo do peso.");
		}
			
		

	}

}
