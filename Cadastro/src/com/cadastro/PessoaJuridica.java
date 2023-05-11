package com.cadastro;

public final class PessoaJuridica extends Pessoa {
	private String razaoSocial;
	private String nomeFatasia;
	private String cnpj;
	private String tipoEmpresa;
	private double valorMercado;

	public PessoaJuridica(int idPessoa, String tipoEmpresa, double valorMercadoInicial) {
		super(idPessoa);
		this.tipoEmpresa = tipoEmpresa;
		this.valorMercado = valorMercadoInicial;

	}
	public double alterarValorMercado(double valorAcoes) {
		this.valorMercado = valorAcoes * 1250000;
		
		return this.valorMercado;
		
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFatasia() {
		return nomeFatasia;
	}
	public void setNomeFatasia(String nomeFatasia) {
		this.nomeFatasia = nomeFatasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}
	public double getValorMercado() {
		return valorMercado;
	}
	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

}
