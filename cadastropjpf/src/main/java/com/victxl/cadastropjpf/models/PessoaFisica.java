package com.victxl.cadastropjpf.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class PessoaFisica implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long codigoPF;
		
		private String nome;
	    private String cpf;
	    private String telefone;
	    private String email;
	    private String cep;
	    private String uf;
	    private String cidade;
	    private String bairro;
	    private String logradouro;
	    private String complemento;
	    private String numero;
		public long getCodigoPF() {
			return codigoPF;
		}
		public void setCodigoPF(long codigoPF) {
			this.codigoPF = codigoPF;
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
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getUf() {
			return uf;
		}
		public void setUf(String uf) {
			this.uf = uf;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public String getLogradouro() {
			return logradouro;
		}
		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	    
	    
	    
		
		

}
