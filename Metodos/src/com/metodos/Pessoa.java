package com.metodos;

public class Pessoa {
	// atributos
	public String nome;
	public String profissao;
	public int idade;
	public double altura;
	public double peso;

	// métodos
	public String apresentar() {
		//
		return "Meu nome é " + this.nome + ", e trabalho como " + this.profissao;

	}

	public String cumprimentar(String nome) {
		return "Prazer em te conhecer, " + nome + ".";
	}
	
	public int verIdade() {
		return this.idade + 7;
	}
	public double cacularIMC() {
		return this.peso/(this.altura*this.altura);
	}
}
