/*
11.As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.

 * Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
 * salários até R$ 280,00 (incluindo) : aumento de 20%
 * salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
 * salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
 * salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
 * o salário antes do reajuste;
 * o percentual de aumento aplicado;
 * o valor do aumento;
 * o novo salário, após o aumento.
 */

package br.com.cursojava.exercicio_2.IF;

import javax.swing.JOptionPane;

public class Exec11 {

	public static void main(String[] args) {

		Double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do colaborador.: "));
		Double percentual = 0.0;
		Double valorAumento = 0.0;
		Double salarioReajustado = 0.0;

		if(salario <= 279) {
			percentual = 0.2;
		} else if(salario >= 280 && salario <= 699) {
			percentual = 0.15;
		} else if(salario >= 700 && salario <= 1499) {
			percentual = 0.1;
		} else if(salario >= 1500) {
			percentual = 0.05;
		}
		
		valorAumento = salario * percentual;
		salarioReajustado = salario + valorAumento;
		


		System.out.println("Salário: " + salario + "\n" +
				"Percentual: " + percentual + "\n" +
				"Percentual: " + valorAumento + "\n" +
				"Percentual: " + salarioReajustado + "\n");


	}

}
