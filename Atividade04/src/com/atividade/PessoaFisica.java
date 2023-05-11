package com.atividade;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String rg;
	private String cargo;
	private double salario;

	public PessoaFisica(int idPessoa) {
		super(idPessoa);
		// TODO Stub de construtor gerado automaticamente
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
