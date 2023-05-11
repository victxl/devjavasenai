package com.atividade;

public class ContaPF extends Conta {
	private PessoaFisica titularConta;
	
	public ContaPF(int numAg, int numConta, double saldo) {
		super(numAg, numConta, saldo);
		// TODO Stub de construtor gerado automaticamente
	}

	public PessoaFisica getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(PessoaFisica titularConta) {
		this.titularConta = titularConta;
	}

}
