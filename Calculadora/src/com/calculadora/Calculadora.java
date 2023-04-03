package com.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		//.
		Scanner leia = new Scanner(System.in);
		
		// declaração de variáveis
		double x, y, result;
		int opcao;
		String operador;
		
		// loop
		do {
			// entrada da opção
			System.out.println("Escolha a opção desejada:");
			System.out.println("1 - Calculadora");
			System.out.println("Aperte enter para encerrar.");
			opcao = leia.nextInt();
		} while (opcao != 1);
		
		}

}
