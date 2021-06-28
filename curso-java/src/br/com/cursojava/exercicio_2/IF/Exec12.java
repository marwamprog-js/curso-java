/*
12.Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende do 
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é
a empresa que deposita). O Salário Líquido corresponde ao Salário
Bruto menos os descontos. O programa deverá pedir ao usuário o
valor da sua hora e a quantidade de horas trabalhadas no mês.

 * Desconto do IR:
 * Salário Bruto até 900 (inclusive) - isento
 * Salário Bruto até 1500 (inclusive) - desconto de 5%
 * Salário Bruto até 2500 (inclusive) - desconto de 10%
 * Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo. No
exemplo o valor da hora é 5 e a quantidade de hora é 220.
 */


package br.com.cursojava.exercicio_2.IF;

import javax.swing.JOptionPane;

public class Exec12 {

	public static void main(String[] args) {

		Double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o quanto ganha por hora.: "));
		Double quantidadeHora = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas.: "));

		Double salarioBruto = valorHora * quantidadeHora;
		Double IR = 0.0;

		if(salarioBruto <= 990) {
			IR = 0.0;
		} else if(salarioBruto >= 991 && salarioBruto <= 1500) {
			IR = 0.05;
		} else if(salarioBruto >= 1501 && salarioBruto <= 2500) {
			IR = 0.1;
		} else if(salarioBruto >= 2501) {
			IR = 0.2;
		}

		Double descontoIR = salarioBruto * IR;
		Double INSS = salarioBruto * 0.1;
		Double FGTS = salarioBruto * 0.11;

		Double totalDescontos = descontoIR + INSS;

		Double salarioLiquido = salarioBruto - totalDescontos;


		String msg = "Salário Bruto.: ("+valorHora+" * "+quantidadeHora+"): 	R$ " + salarioBruto +"\n" +
				"(-) IR ("+(IR * 100)+"%).: 	R$ " + descontoIR + "\n" +
				"(-) INSS (10%).: 	R$ " + INSS + "\n" +
				"FGTS (11%).: 	R$ " + FGTS + "\n" +
				"Total de descontos.: 	R$ " + totalDescontos + "\n" +
				"Salário Liquido.: 	R$ " + salarioLiquido;

		JOptionPane.showMessageDialog(null, msg);




	}

}
