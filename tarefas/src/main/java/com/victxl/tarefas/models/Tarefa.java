package com.victxl.tarefas.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codigoTarefa;
	
		
	private String titulo; 
	private String descricao;
	
	private String inicio;
	
	
	
	public Tarefa() {
		// TODO Stub de construtor gerado automaticamente
	}



	public long getCodigoTarefa() {
		return codigoTarefa;
	}



	public void setCodigoTarefa(long codigoTarefa) {
		this.codigoTarefa = codigoTarefa;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getInicio() {
		return inicio;
	}



	public void setInicio(String inicio) {
		this.inicio = inicio;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
