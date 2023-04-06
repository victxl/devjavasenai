package com.imc;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		Imc usuario = new Imc();
		
		String pesoStr, alturaStr;
		
		//declaração de vetor
		Object opcoes[]= {"Calcular IMC","SAIR"};
		Object opcao;
		
		// entrada da opção do usuario
		
	do {
		opcao = JOptionPane.showInputDialog(null, "Opcões", "Escolha um opção: ",JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		if (opcao == "Calcular IMC") {
			usuario.nome = JOptionPane.showInputDialog("Informe o nome: ");
			pesoStr = JOptionPane.showInputDialog("Informe o peso");
			alturaStr = JOptionPane.showInputDialog("Informe a altura: ");
			
			pesoStr = pesoStr.replace(",", ".");
			alturaStr = alturaStr.replace(",", ".");
			//converte de string para double
			
			usuario.peso = Double.parseDouble(pesoStr);
			usuario.altura = Double.parseDouble(alturaStr);
			
			//saida de dados 
			JOptionPane.showMessageDialog(null, String.format("O IMC do %s é %s ",usuario.nome,usuario.diagnosticarUsuario(usuario.calculadora())));
			
		} else {
			JOptionPane.showMessageDialog(null, "Adeus!");
		}
	}while (opcao !="SAIR");
	}
	
}			
		
		
		
		
