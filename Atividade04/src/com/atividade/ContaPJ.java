package com.atividade;

public class ContaPJ extends Conta {
	private PessoaJuridica titularConta;

	public ContaPJ(int numAg, int numConta, double saldo) {
		super(numAg, numConta, saldo);
		// TODO Stub de construtor gerado automaticamente
	}

	public PessoaJuridica getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(PessoaJuridica titularConta) {
		this.titularConta = titularConta;
	}

}
