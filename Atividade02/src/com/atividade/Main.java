package com.atividade;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Random n = new Random();
		Object tipoPessoa, tiposPessoa[] = { "Pessoa Fisica", "Pessoa Juridica" };
		Object tiposSanguineo[] = { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" };
		Object cargos[] = { "Copeiro", "Marceneiro", "Aviador", "Motoqueiro" };

		tipoPessoa = JOptionPane.showInputDialog(null, "Informe tipo de pessoa: ", "Pessoa",
				JOptionPane.INFORMATION_MESSAGE, null, tiposPessoa, tiposPessoa[0]);

		if (tipoPessoa == "Pessoa Fisica") {
			PessoaFisica user = new PessoaFisica(n.nextInt(99));

//			user.setNome(JOptionPane.showInputDialog("Nome:"));
//			user.setEmail(JOptionPane.showInputDialog("E-mail:"));
//			user.setEndereco(JOptionPane.showInputDialog("Endereço:"));
//			user.setTelefone(JOptionPane.showInputDialog("Telefone: "));
//			user.setCpf(JOptionPane.showInputDialog("CPF:"));
//			user.setRg(JOptionPane.showInputDialog("RG"));
			user.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe tipo Sangue", "Tipo de Sangue",JOptionPane.INFORMATION_MESSAGE, null, tiposSanguineo, tiposSanguineo[0]));
			user.setCargo(JOptionPane.showInputDialog(null,"Informe cargo","Cargo", JOptionPane.INFORMATION_MESSAGE, null,cargos,cargos[0]));
			user.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso:")));
			user.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura:")));

			JOptionPane.showMessageDialog(null, user.receberSalario(user.getCargo()));

		}

	}

}
