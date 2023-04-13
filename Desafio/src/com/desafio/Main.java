package com.desafio;


import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Random n = new Random();
		String salarioStr;
		
		
		Funcionario n1 = new Funcionario(n.nextInt(1000));
		
		n1.nome = JOptionPane.showInputDialog("Informe o seu nome: ");
		n1.nascimento = JOptionPane.showInputDialog("Informe sua data de nasicmento: ");
		n1.endereco = JOptionPane.showInputDialog("Informe o seu endereço: ");
		n1.cargo = JOptionPane.showInputDialog("Informe seu cargo: ");
		salarioStr = JOptionPane.showInputDialog("Informe seu salario: ");
		n1.salario = Double.parseDouble(salarioStr.replace(",", "."));
	
		JOptionPane.showMessageDialog(null, String.format("Matricula: %d\nNome: %s\nNascimento: %s\nEndereço: %s\nCargo: %s\nSalario: R$ %.2f\n",n1.matricula,n1.nascimento,n1.nascimento,n1.endereco,n1.cargo,n1.salario));
	}
	
}
