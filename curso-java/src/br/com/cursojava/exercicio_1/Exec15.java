/* 
15. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 

11% para o Imposto de Renda, 
8% para o INSS e 
5% para o sindicato, 

faça um programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela
abaixo:

+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$

Obs.: Salário Bruto - Descontos = Salário Líquido.

*/

package br.com.cursojava.exercicio_1;

import java.util.Scanner;

public class Exec15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final double IR = 0.11;
		final double INSS = 0.08;
		final double SINDICATO = 0.05;
		
		
		System.out.println("Informe o valor que ganha por hora.: ");
		double valorPorHora = scan.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas no mês.: ");
		double quantHoraMes = scan.nextDouble();
		
		double salarioBruto = valorPorHora * quantHoraMes;
		double irDescontado = (IR * salarioBruto);
		double inssDescontado = (INSS * salarioBruto);
		double sincatoDescontado = (SINDICATO * salarioBruto);
		
		double salarioLiquido = salarioBruto - (irDescontado + inssDescontado + sincatoDescontado);
		
		System.out.println("Salario Bruto.: " + salarioBruto);
		System.out.println(".....Desconto Imposto de renda.: " + irDescontado);
		System.out.println(".....Desconto INSS.: " + inssDescontado);
		System.out.println(".....Desconto Sindicato.: " + sincatoDescontado);
		System.out.println("..........Salário liquido.: " + salarioLiquido);
		
		
		

	}

}
