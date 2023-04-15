package com.cadastro;

public final class PessoaJuridica extends Pessoa {
		
	public String cnpj;
	public String inscricaoEst;
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEst() {
		return inscricaoEst;
	}

	public void setInscricaoEst(String inscricaoEst) {
		this.inscricaoEst = inscricaoEst;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getNatjuri() {
		return natjuri;
	}

	public void setNatjuri(String natjuri) {
		this.natjuri = natjuri;
	}

	public String site;
	public String natjuri;

	public PessoaJuridica(int idPessoa) {
		super(idPessoa);
		
	}

}
