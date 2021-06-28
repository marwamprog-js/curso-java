/*
4. Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.
*/

package br.com.cursojava.exercicio_2.IF;

import java.util.Scanner;

public class Exec4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite uma letra.: ");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("A letra "+ letra +" digitada é uma VOGAL");
		} else {
			System.out.println("A letra "+ letra +" digitada é uma CONSOANTE");
		}

	}

}
