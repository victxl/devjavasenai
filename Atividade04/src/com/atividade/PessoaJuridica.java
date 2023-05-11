package com.atividade;

public class PessoaJuridica extends Pessoa {
	
	private Object tipoEmpresa;
	private String cnpj;
	private String incricaoEstadual;
	private String site;
	

	public PessoaJuridica(int idPessoa) {
		super(idPessoa);
		// TODO Stub de construtor gerado automaticamente
	}


	public Object getTipoEmpresa() {
		return tipoEmpresa;
	}


	public void setTipoEmpresa(Object tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getIncricaoEstadual() {
		return incricaoEstadual;
	}


	public void setIncricaoEstadual(String incricaoEstadual) {
		this.incricaoEstadual = incricaoEstadual;
	}


	public String getSite() {
		return site;
	}


	public void setSite(String site) {
		this.site = site;
	}

}
