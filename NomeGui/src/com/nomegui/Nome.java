package com.nomegui;
import javax.swing.JOptionPane;
public class Nome {

	public static void main(String[] args) {

		String nome;
		int idade ;
		
		
		nome = JOptionPane.showInputDialog("Informe seu nome: ");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
		
		int soma = idade+7;
		
		JOptionPane.showMessageDialog(null, "Seu " + nome +" e voce tera em 2030 "+ soma + " anos");
		
				
		
	}

}
