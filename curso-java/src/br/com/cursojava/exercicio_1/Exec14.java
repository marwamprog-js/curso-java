/*
14. João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.
*/

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec14 {

	public static void main(String[] args) {
	
		final int PESO_PADRAO = 50;
		final int VALOR_MULTA = 4;
		Scanner scan = new Scanner(System.in);
		double excesso = 0;
		double multa = 0;
		
		System.out.println("Informe o peso de peixes.: ");
		double peso = scan.nextDouble();
		
		if(peso > PESO_PADRAO) {
			excesso = peso - PESO_PADRAO;
			multa = excesso * VALOR_MULTA;			
		}
		
		System.out.println("Peso informado.: " + peso);
		System.out.println("Peso excedido.: " + excesso);
		System.out.println("Total da multa.: " + multa);
		
		
		

	}

}
