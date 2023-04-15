package com.cadastro;

public final class PessoaFisica extends Pessoa {
	
	
	public String getNasc() {
		return nasc;
	}


	public void setNasc(String nasc) {
		this.nasc = nasc;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAlt() {
		return alt;
	}


	public void setAlt(double alt) {
		this.alt = alt;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getTiposang() {
		return tiposang;
	}


	public void setTiposang(String tiposang) {
		this.tiposang = tiposang;
	}


	public String nasc;
	public String rg;
	public String cpf;
	public double peso;
	public double alt;
	public String genero;
	public String tiposang;
	

	public PessoaFisica(int idPessoa) {
		super(idPessoa);
		
		// TODO Auto-generated constructor stub
	}

}
