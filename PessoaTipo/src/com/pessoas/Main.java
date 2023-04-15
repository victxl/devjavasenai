package com.pessoas;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Random n = new Random();
		PessoaFisica user = new PessoaFisica(n.nextInt(10),"Masc"); 
		PessoaJuridica pj = new PessoaJuridica(n.nextInt(11));
		
		
		pj.razaoSocial = JOptionPane.showInputDialog("Informe a razao Social");
		pj.nomeFantasia = "Summer fantasia";
		pj.cnpj = "65.608.417/0001-87";
		pj.email = "victo!@gasfa";
		pj.endereco = "quadra 1001";
		pj.telefone = "61 95 59 09 ";
		
		//atribuindo valores ao abjeto
		user.nome = "Carlos Henrique";
		user.cpf = "182.456.466.93";
		user.email = "victxl@gmail.com";
		user.endereco = "Rua são paulo";
		user.telefone = "(62) 3568-4545";
		user.cargo = "Copeiro";
		user.salario = 4200.58;
		
		
		JOptionPane.showMessageDialog(null,	String.format("ID: %d\n"
				+ "Nome: %s\n"
				+ "E-mail: %s\n"
				+ "Endereço: %s\n"
				+ "Telefone: %s\n"
				+ "Cargo: %s\n"
				+ "Salario: R$ %.2f\n",user.idPessoa,user.nome ,user.email,user.endereco,user.telefone,user.cargo,user.salario));
		
		JOptionPane.showMessageDialog(null,	String.format("ID: %d\n"
				+ "Razao Social: %s\n"
				+ "Nome Fantasia: %s\n"
				+ "CNPJ: "
				+ "E-mail: %s\n"
				+ "Endereço: %s\n"
				+ "Telefone: %s\n"
				,pj.idPessoa,pj.razaoSocial,pj.nomeFantasia,pj.cnpj,pj.email,pj.endereco,pj.telefone));
		
		
		
		

	}

}
