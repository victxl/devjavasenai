package com.atividade;

public final class Veiculo extends Pessoa {
	private Object tipoVeiculo;
	private String marca;
	private String modelo;
	private String cor;
	private String renavam;
	private String placa;
	private int ano;
	private double preco;
	private Pessoa proprietario;

	public Veiculo() {
		// TODO Stub de construtor gerado automaticamente
	}
	public double calucalrIpvaAnual(double aliquota) {
		return this.preco * aliquota;
	}
	public int retornarUltimoAnoIpva() {
		return this.ano + 15;
	
		
	}
	public Object getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(Object tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Pessoa getProprietario() {
		return proprietario;
	}
	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

}
