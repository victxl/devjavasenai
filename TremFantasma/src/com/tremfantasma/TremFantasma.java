package com.tremfantasma;

import java.util.Scanner;

public class TremFantasma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite qual seu nome:");
		String nome = leia.nextLine();
		System.out.println("Digite sua altura: ");
		double altura = leia.nextDouble();
		if (altura >= 1.20) {
			System.out.printf("%s você pode entrar no parquinho.",nome);
		}else {
			System.out.printf("%.2f você não pode entrar no parquinho. ",nome);
		}
	}

}
