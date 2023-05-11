package com.atividade;

public interface IConta {

	public double depositar(double valor, double juros) {
			
		return valor*juros;
			
		}
		
		
		
	
	
	
	
	public double sacar(double valor,double juros) {
		return valor*juros;
		
	}
}
