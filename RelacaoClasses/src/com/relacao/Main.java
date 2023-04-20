package com.relacao;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Random n = new Random();
		Pessoa user = new Pessoa(n.nextInt(99));
		Conta cc = new Conta(n.nextInt(9999), n.nextInt(99999), 0);

		Object ops[] = { "Consultar dados", "Consultar saldo", "Fazer deposito", "Fazer saque", "Sair" };
		Object op;
		
		String valorStr;

		user.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
		user.setEmail(JOptionPane.showInputDialog("Informe seu e-mail:"));
		user.setCpf(JOptionPane.showInputDialog("Informe seu CPF: "));
		user.setRg(JOptionPane.showInputDialog("Informe seu RG: "));
		user.setEndereco(JOptionPane.showInputDialog("Informe seu endereço: "));
		user.setTelefone(JOptionPane.showInputDialog("Informe seu telefone:"));
		user.setCargo (JOptionPane.showInputDialog("Informe seu Cargo: "));
		user.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario ").replace(",", ".")));

		cc.setTitularConta(user);

		do {
			op = JOptionPane.showInputDialog(null,"Opções", "Escolha ",JOptionPane.INFORMATION_MESSAGE, null,ops,ops[0]);
				if (op == "Consultar dados") {JOptionPane.showMessageDialog(null, String.format("ID %d\n"
						+ "Nome: %s\n"
						+ "CPF: %s\n"
						+ "RG: %s\n"
						+ "EMAIL: %s\n"
						+ "ENDEREÇO: %s\n"
						+ "TELEFONE %s\n"
						+ "CARGO: %s\n"
						+ "SALARIO %.2f",
						cc.getTitularConta().getId(),
						cc.getTitularConta().getNome(),
						cc.getTitularConta().getCpf(),
						cc.getTitularConta().getRg(),
						cc.getTitularConta().getEmail(),
						cc.getTitularConta().getEndereco(),
						cc.getTitularConta().getTelefone(),
						cc.getTitularConta().getCargo(),
						cc.getTitularConta().getSalario()));
					
				} else if (op == "Fazer deposito") {
					valorStr = JOptionPane.showInputDialog("Valor do desposito");
					
					JOptionPane.showMessageDialog(null,cc.fazerDeposito(Double.parseDouble(valorStr.replace(",","."))));
									
				
				}else if (op=="Fazer saque") {
					
					valorStr = JOptionPane.showInputDialog("Valor do saque");
					
					JOptionPane.showInternalMessageDialog(null, cc.fazerSaque(Double.parseDouble(valorStr.replace(",","."))));
					
				}
				
			
		} while (op != "Sair");

	}

}
