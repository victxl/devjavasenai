package com.construtores;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// 4 instancia os objeots

		Random num = new Random();
		Pessoa user = new Pessoa(num.nextInt(13));
		
		
		//5 entrada de dados do user 01 
		
		if (user.idPessoa < 1) {
			user.idPessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID:"));			
		}
		//6 entrada de dados
		
		user.nome = JOptionPane.showInputDialog("Informe o nome:");
		user.cpf = JOptionPane.showInputDialog("Informe o CPF:");
		user.telefone = JOptionPane.showInputDialog("Informe o telefone:");
		user.email = JOptionPane.showInputDialog("Informe email:");
		user.cidade = JOptionPane.showInputDialog("Informe a cidade:");
		
		//7 saida de dados
		JOptionPane.showMessageDialog(null, String.format("ID: %d\nCPF: %s\nTelefone: %s\nE-mail: %s\nCidade: %s\n",user.idPessoa,user.cpf,user.telefone,user.email,user.cidade));
					

	}

}
