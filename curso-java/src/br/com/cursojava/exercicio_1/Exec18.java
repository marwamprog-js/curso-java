/*
18. Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).
*/

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo em MB.: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe a velocidade do link da internet Mbps.: ");
		double velocidadeInternet = scan.nextDouble();
		
		double tempo = (tamanhoArquivo / velocidadeInternet) * 60;
		
		System.out.println("Tempo de download: " + tempo);
		/**/
		
	}
	
}
