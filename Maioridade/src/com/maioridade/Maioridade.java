package com.maioridade;

import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite seu nome:");
		String nome = leia.nextLine();
		System.out.print("Digite sua idade:");
		int idade = leia.nextInt();
		
		
		if(idade >=18) {
			System.out.printf("Parabens %s, você é maior de idade!!!",nome);
		} else {
			System.out.printf("Então %s, você não é maior de idade.",nome);
		}
	}

}
