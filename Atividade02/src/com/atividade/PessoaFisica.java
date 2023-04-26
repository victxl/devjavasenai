package com.atividade;

public final class PessoaFisica extends Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private Object tipoSanguineo;
	private Object cargo;
	private double salario;
	private double peso;
	private double altura;

	public PessoaFisica(int idPessoa) {
		super(idPessoa);
	}
		
	public double receberSalario(Object cargo) {
		if (cargo =="Copeiro" ) {
			return 10000;				
			
		} else if (cargo== "Marceneiro") {
			return 1000;
			
		} else if (cargo == "Aviador") {
			return 100;
			
		} else {
			return 10;
		}
		
	}
		
		
		

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Object getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(Object tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public Object getCargo() {
		return cargo;
	}

	public void setCargo(Object cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
