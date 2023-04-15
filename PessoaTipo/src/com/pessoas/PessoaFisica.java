package com.pessoas;

public final class PessoaFisica extends Pessoa {
	
	//atributos
		public String genero;
		public String nome;
		public String cpf;
		public String rg;
		public String cargo;
		public double salario;
	
	
	//construtor

	public PessoaFisica(int idPessoa, String genero) {
		super(idPessoa);
		this.genero = genero;
		
	}

}
