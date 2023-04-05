package com.metodos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// intancia os objetos

		Pessoa usuario = new Pessoa();
		Scanner leia = new Scanner(System.in);
		Pessoa dev = new Pessoa();
		
		dev.nome = "Victor Henrique";
		dev.idade = 35;
		dev.profissao = "Desenvolvedor";
		dev.altura = 1.72;
		dev.peso = 96;
		
		
		// entrada de dados
		System.out.println("Informe o nome:");
		usuario.nome = leia.nextLine();
		
		System.out.println("Informe a idade: ");
		usuario.idade = leia.nextInt();
		leia.nextLine();
				
		System.out.println("Informe a profissão:");
		usuario.profissao = leia.nextLine();
		
		System.out.println("Informe o peso:");
		usuario.peso = leia.nextDouble();
		
		System.out.println("Informe a altura:");
		usuario.altura = leia.nextDouble();
		
		System.out.println(usuario.apresentar());
		System.out.println(dev.cumprimentar(usuario.nome));
		System.out.println(dev.apresentar());
		System.out.println(usuario.cumprimentar(dev.nome));
		System.out.println(usuario.nome + ", minha idade  em 2030 será "+ dev.verIdade()+ " anos.");
		System.out.printf("%.2f",usuario.cacularIMC());
		
		
		
		
		
		
		
				

	}

}
