package com.imc;

public class Imc {
	public String nome;
	public double peso;
	public double altura;
	
	public double calculadora() {
		return this.peso/(this.altura*this.altura);
	}
	
	public String diagnosticarUsuario(double imc) {
		if(imc < 18.5)
			return String.format("%s esta abaixo do peso",this.nome); else if (imc <25)
			return String.format("%s esta peso ideal do peso",this.nome); else if (imc <30)
			return String.format("%s esta acima do peso",this.nome); else if (imc < 35)
			return String.format("%s esta obsidade 1 do peso",this.nome); else return String.format("%s esta obsidade 2  do peso",this.nome);
			 
		
		
	}

}
