package br.com.ouvidoria.antendimento;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		int opcao = 1;
		Ouvidoria ouvidoria1 = new Ouvidoria("Setor responsável");
		JOptionPane.showMessageDialog(null, "Sistema de Ouvidoria");

		while (opcao != 5) {

			String opcaoStr = JOptionPane.showInputDialog(
					"Digite a sua opção: \n 1) Listar \n 2) Adicionar \n 3) Remover \n 4) Pesquisar \n 5) Sair ");
			opcao = Integer.parseInt(opcaoStr);

			if (opcao == 1) {

				ouvidoria1.listarOcorrenciasOuvidoria();

			} else if (opcao == 2) {
				String numProtocoloStr = JOptionPane.showInputDialog("Digite o protocolo");
				int numProtocolo = Integer.parseInt(numProtocoloStr);

				String nomeTitulo = JOptionPane.showInputDialog("Digite o título da ocorrência");

				String tipoOcorrencia = JOptionPane.showInputDialog("Digite o típo da ocorrência - REC, SUG ou ELO");

				String descrição = JOptionPane.showInputDialog("Digite a sua ocorrência");

				// String responsavel = new ouvidoria1.getresponsavel();

				Ocorrencia novaOcorrencia = new Ocorrencia(numProtocolo, nomeTitulo, tipoOcorrencia, descrição);
				ouvidoria1.adicionarNovaOcorrencia(novaOcorrencia);

				JOptionPane.showMessageDialog(null, "Ocorrência adicionada com sucesso");

			} else if (opcao == 3) {
				String numProtocoloStr = JOptionPane.showInputDialog("Digite o protocolo para remover");
				int numProtocolo = Integer.parseInt(numProtocoloStr);

				ouvidoria1.removerPeloNumerodoProtocolo(numProtocolo);

				JOptionPane.showMessageDialog(null, "Ocorrência excluída com sucesso");

			} else if (opcao == 4) {
				String numProtocoloStr = JOptionPane.showInputDialog("Digite o protocolo para pesquisa");
				int numProtocolo = Integer.parseInt(numProtocoloStr);

				ouvidoria1.pesquisarPeloNumerodoProtocolo(numProtocolo);

			} else if (opcao != 5) {
				JOptionPane.showMessageDialog(null, "Opção Inválida");

			}
		}
		JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema de Ouvidoria");

	}

}
