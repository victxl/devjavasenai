package com.usuario;

public class Pessoa {
	
	//atributos
	public String nome;
	public String cidade;
	public String profissao;
	public int idade;
	// métodos
	
	public void apresentar(){
		System.out.printf("Ola, meu nome é %s. Moro na cidade %s, \ntenho %d anos, e trabalho com %s.\n",this.nome,this.cidade,this.idade,this.profissao);
	}
	
	public void despedir() {
		System.out.println("Foi um praser te conhcer. Até breve!");
	}
	

}
