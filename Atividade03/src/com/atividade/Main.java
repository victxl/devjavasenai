package com.atividade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Object tiposVeiculo[] = { "Hatch", "Sedã", "SUV", "Picapes", "Crossover" };
		double aliquota = 0;

		Pessoa user = new Pessoa();

		user.setNome(JOptionPane.showInputDialog("Informe seu nome"));
//		user.setEmail(JOptionPane.showInputDialog("E-mail:"));
//		user.setEndereco(JOptionPane.showInputDialog("Endereço:"));
//		user.setTelefone(JOptionPane.showInputDialog("Telefone: "));
//		user.setCpf(JOptionPane.showInputDialog("CPF: "));
//		user.setRg(JOptionPane.showInputDialog("RG"));
//		user.setCargo(JOptionPane.showInputDialog("Cargo:"));
//		user.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario: ").replace(",", ".")));

		Object ops[] = { user.getNome(), user.getEmail(), user.getEndereco(), user.getTelefone(), user.getCpf(),
				user.getRg(), user.getCargo(), user.getCargo(), user.getSalario() };

		Veiculo carro = new Veiculo();

		carro.setTipoVeiculo(JOptionPane.showInputDialog(null, "Escolhar seu carro", "Tipos de carro",
				JOptionPane.INFORMATION_MESSAGE, null, tiposVeiculo, tiposVeiculo[0]));

		if (carro.getTipoVeiculo() == "Crossover") {
			aliquota = 2;

		} else if (carro.getTipoVeiculo() == "Picapes") {
			aliquota = 4;

		} else if (carro.getTipoVeiculo() == "SUV") {
			aliquota = 6;

		} else if (carro.getTipoVeiculo() == "Sedã") {
			aliquota = 8;

		} else if (carro.getTipoVeiculo() == "Hatch") {
			aliquota = 10;

		} 

//		carro.setMarca(JOptionPane.showInputDialog("Marca:"));
//		carro.setModelo(JOptionPane.showInputDialog("Modelo:"));
//		carro.setCor(JOptionPane.showInputDialog("Cor:"));
//		carro.setRenavam(JOptionPane.showInputDialog("Renavam"));
//		carro.setPlaca(JOptionPane.showInputDialog("Placa"));
		carro.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano:")));
		carro.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço:")));
		carro.setProprietario(user);

		user.setOp(JOptionPane.showInputDialog(null, "Informação do proprietario", "Proprietario",
				JOptionPane.INFORMATION_MESSAGE, null, ops, ops[0]));

		JOptionPane.showMessageDialog(null, String.format("Nome: %s Valor do IPVA: %.2f  QUE VAI PAGAR ATÉ %d", carro.getProprietario().getOp(),
				carro.calucalrIpvaAnual(aliquota), carro.retornarUltimoAnoIpva()));

	}

}
