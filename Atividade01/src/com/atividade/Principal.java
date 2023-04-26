package com.atividade;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instanciando objeto pessoa
		Pessoa user = new Pessoa();
		
		// declaração de variáveis
		Object tiposSangue[] = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};
		
		// entrada de dados do usuário
//		user.setNome(JOptionPane.showInputDialog("Nome: "));
//		user.setCpf(JOptionPane.showInputDialog("CPF: "));
//		user.setRg(JOptionPane.showInputDialog("RG: "));
//		user.setEmail(JOptionPane.showInputDialog("E-mail: "));
//		user.setEndereco(JOptionPane.showInputDialog("Endereço: "));
//		user.setTelefone(JOptionPane.showInputDialog("Telefone: "));
//		user.setCargo(JOptionPane.showInputDialog("Cargo: "));
//		user.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salário em reais: ").replace(",", ".")));
//		user.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso em kg: ").replace(",", ".")));
//		user.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura em m: ").replace(",", ".")));
//		user.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
	//	user.setTipoSang(JOptionPane.showOptionDialog(null, "Tipo sanguíneo", "Informe o seu tipo sanguíneo: ", JOptionPane.INFORMATION_MESSAGE, 0, null, tiposSangue, tiposSangue[0]));
		user.setTipoSang(tiposSangue[JOptionPane.showOptionDialog(null, "Tipo sanguíneo", "Informe o seu tipo sanguíneo: ", JOptionPane.INFORMATION_MESSAGE, 0, null, tiposSangue, tiposSangue[0])]);
		
		// saída de dados do objeto pessoa
		JOptionPane.showMessageDialog(
				null, 
				"Nome: " + user.getNome() +
				"\nCPF: " + user.getCpf() +
				"\nRG: " + user.getRg() +
				"\nE-mail: " + user.getEmail() +
				"\nEndereço: " + user.getEndereco() +
				"\nTelefone: " + user.getTelefone() +
				"\nCargo: " + user.getCargo() +
				"\nSalário: R$ " +String.format("%.2f",user.getSalario())+
				"\nPeso: " + user.getPeso() +
				"\nAltura: " + user.getAltura() +
				"\nIdade: " + user.getIdade() +
				"\nTipo Sanguíneo: " + user.getTipoSang() +
				"."
				
				
				);
		
		
		
	}

}
