package com.construtor;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// 3º INTACIA OBJETO DA CLASSE PESSOA
		Random num = new Random()
;		Pessoa usuario = new Pessoa(num.nextInt());

		// 4 entrada de dados
		usuario.nome = JOptionPane.showInputDialog("Informe o nome:");
		usuario.cpf = JOptionPane.showInputDialog("Informe o CPF:");
		usuario.endereco = JOptionPane.showInputDialog("Informe o endereco:");
		usuario.telefone = JOptionPane.showInputDialog("Informe o telefone:");
		usuario.email = JOptionPane.showInputDialog("Informe o email:");
		// 5 saida de dados
		JOptionPane.showMessageDialog(null,
				String.format("ID : %d\n Nome: %s\nCPF: %s\nEndereço: %s\nTelefone: %s\nEmail: %s",
						usuario.idPessoa, usuario.nome, usuario.cpf, usuario.endereco, usuario.telefone,
						usuario.email));
	}

}
