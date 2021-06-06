/*
 * 
 * 8. Faça um Programa que pergunte quanto você ganha por hora e o
 * número de horas trabalhadas no mês. Calcule e mostre o total do seu
 * salário no referido mês.
 */

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quanto ganha por hora.: ");
		double valorPorHora = scan.nextDouble();
		
		System.out.println("Informe o número de horas trabalhadas no mês.: ");
		double quantHoraMes = scan.nextDouble();
		
		double salario = valorPorHora * quantHoraMes;
		
		System.out.println("Valor por hora.: " + valorPorHora);
		System.out.println("Horas trabalhadas no mês.: " + quantHoraMes);
		System.out.println("Salário do mês.: " + salario);

	}

}
