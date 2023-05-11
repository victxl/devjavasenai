package com.atividade;

public class Conta implements IConta {


	private Object tipoConta;
	private int numAg;
	private int numConta;
	protected double saldo;
	
	public Conta(int numAg,int numConta,double saldo) {
		// TODO Stub de construtor gerado automaticamente
		this.numAg = numAg;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public Object getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(Object tipoConta) {
		this.tipoConta = tipoConta;
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

	@Override
	public double depositar(double valor, double juros) {
		// TODO Stub de método gerado automaticamente
		return 0;
	}

	@Override
	public double sacar(double valor, double juros) {
		// TODO Stub de método gerado automaticamente
		return 0;
	}

}
