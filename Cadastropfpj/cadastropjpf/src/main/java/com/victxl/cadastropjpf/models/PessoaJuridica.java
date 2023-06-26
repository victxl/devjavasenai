package com.victxl.cadastropjpf.models;

import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PessoaJuridica implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codigoPJ;
	
	private String nomePJ;
    private String cnpj;
    private String inscricaoEstadual;
    private String sitePJ;
    private String emailPJ;
    private String cepPJ;
    private String ufPJ;
    private String cidadePJ;
    private String bairroPJ;
    private String logradouroPJ;
    private String complementoPJ;
    private String numeroPJ;
	public long getCodigopj() {
		return codigoPJ;
	}
	public void setCodigopj(long codigopj) {
		this.codigoPJ = codigoPJ;
	}
	public String getNomePJ() {
		return nomePJ;
	}
	public void setNomePJ(String nomePJ) {
		this.nomePJ = nomePJ;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getSitePJ() {
		return sitePJ;
	}
	public void setSitePJ(String sitePJ) {
		this.sitePJ = sitePJ;
	}
	public String getEmailPJ() {
		return emailPJ;
	}
	public void setEmailPJ(String emailPJ) {
		this.emailPJ = emailPJ;
	}
	public String getCepPJ() {
		return cepPJ;
	}
	public void setCepPJ(String cepPJ) {
		this.cepPJ = cepPJ;
	}
	public String getUfPJ() {
		return ufPJ;
	}
	public void setUfPJ(String ufPJ) {
		this.ufPJ = ufPJ;
	}
	public String getCidadePJ() {
		return cidadePJ;
	}
	public void setCidadePJ(String cidadePJ) {
		this.cidadePJ = cidadePJ;
	}
	public String getBairroPJ() {
		return bairroPJ;
	}
	public void setBairroPJ(String bairroPJ) {
		this.bairroPJ = bairroPJ;
	}
	public String getLogradouroPJ() {
		return logradouroPJ;
	}
	public void setLogradouroPJ(String logradouroPJ) {
		this.logradouroPJ = logradouroPJ;
	}
	public String getComplementoPJ() {
		return complementoPJ;
	}
	public void setComplementoPJ(String complementoPJ) {
		this.complementoPJ = complementoPJ;
	}
	public String getNumeroPJ() {
		return numeroPJ;
	}
	public void setNumeroPJ(String numeroPJ) {
		this.numeroPJ = numeroPJ;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
