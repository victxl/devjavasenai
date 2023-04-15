package com.cadastro;

import java.util.Random;

import javax.swing.JOptionPane;
/*
Crie um programa em que o usuario escolha se deseja cadastrar um pessoa
* fisica, juridica, ou sair do programa. 
* 
* A pessoa fisica devera ter data de nascimento,rg, cpf, peso, altura, genero e tipo sanquineo. 
* pessoa juridica deverá ter cnpj, inscrição estadual, site e natureza juridica. 
* 
* Ambas as pessoas devem ter id da pessoa, nome, email, endereço e etelefone. o programa
* devera informar os dados na tela apos o cadastro da pessoa. o ecercicio
* cobrará uso de construtores, abstração, herança, porlimorfismo e
* encapsulamento.*/

public class Main {

	public static void main(String[] args) {
		
		
		
		Random n = new Random();
		PessoaFisica pf = new PessoaFisica(n.nextInt(10));
		PessoaJuridica pj = new PessoaJuridica(n.nextInt(10));
		
		
		
		pf.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
		pf.setEmail(JOptionPane.showInputDialog("Informe seu e-mail:"));
		pf.setNasc(JOptionPane.showInputDialog("Informe seu nascimento: "));
		pf.setRg(JOptionPane.showInputDialog("Informe seu RG: "));
		pf.setCpf(JOptionPane.showInputDialog("Informe seu CPF: "));
		pf.setAlt(Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: ")));
		pf.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: ")));
		pf.setGenero("Informe seu Genero: ");
		
		
		pj.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ: "));
		
		JOptionPane.showMessageDialog(null,pj.getIdPessoa());
		
		
		
		

	}

}
