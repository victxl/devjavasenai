package com.encapsulamento;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Random n = new Random();
		Pessoa user = new Pessoa(n.nextInt(99));
		
		
		user.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
		user.setEmail(JOptionPane.showInputDialog("Informe o e-mail:"));
		user.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
		
		JOptionPane.showMessageDialog(null,String.format(""
				+ "ID: %d\n"
				+ "Nome: %s\n"
				+ "E-mail: %s\n "
				+ "Telefone: %s\n ",user.getIdPessoa(),user.getNome(),user.getEmail(),user.getTelefone()));

	}

}
