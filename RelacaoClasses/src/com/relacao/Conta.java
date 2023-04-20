package com.relacao;

public class Conta implements IConta {

	// 2 atributos
	private int numAg;
	private int numConta;
	private double saldo;
	private Pessoa titularConta;

	// 3 construtor
	public Conta(int numAg, int numConta, double saldo) {

		this.numAg = numAg;
		this.numConta = numConta;
		this.saldo = saldo;

	}

	@Override
	public String fazerDeposito(double valor) {
		this.saldo += valor;

		return "Deposito efetuado com sucesso.";
	}

	@Override
	public String fazerSaque(double valor) {
		if (this.saldo>=valor) {
			this.saldo-=valor;
		
		return "Saque efetudado com sucesso";
		}
		
	 else {
		return "Saque não altorizado";
	}
		}

	public int getNumAg() {
		return numAg;
	}

	public void setNumAg(int numAg) {
		this.numAg = numAg;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(Pessoa titularConta) {
		this.titularConta = titularConta;
	}

}
