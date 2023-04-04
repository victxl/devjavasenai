package com.usuario;

public class Principal {

	public static void main(String[] args) {
		// instancia o objeto
		Pessoa usuario = new Pessoa();
		Pessoa funcionario = new Pessoa();

		// defindo valores para os atributos
		usuario.nome = "ViCTOR";
		usuario.idade = 35;
		usuario.cidade = "Recanto";
		usuario.profissao = "Fotografo";

		funcionario.nome = "Victor2";
		funcionario.idade = 37;
		funcionario.cidade = "Goiânia";
		funcionario.profissao = "Costureiro";

		usuario.apresentar();
		funcionario.despedir();
		funcionario.apresentar();
		funcionario.despedir();
		

	}

}
