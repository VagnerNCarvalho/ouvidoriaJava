package br.com.ouvidoria.antendimento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ouvidoria {
	private String responsavel;
	private ArrayList<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>();

	public Ouvidoria(String responsavel) {
		this.responsavel = responsavel;
	}

	public void pesquisarPeloNumerodoProtocolo(int numeroProtocoloParaPesquisar) {

		Ocorrencia protolocoPesquisado = null;

		for (Ocorrencia ocorrencia : ocorrencias) {

			if (ocorrencia.getNumProtocolo() == numeroProtocoloParaPesquisar) {
				protolocoPesquisado = ocorrencia;
				break;
			}
		}
			if (protolocoPesquisado == null) {
				JOptionPane.showMessageDialog(null, "Ocorrência não encontrada");

			} else {
				JOptionPane.showMessageDialog(null,
						"Número protocolo: " + protolocoPesquisado.getNumProtocolo() + " Título: "
								+ protolocoPesquisado.getNomeTitulo() + " Tipo: "
								+ protolocoPesquisado.getTipoOcorrencia() + " Descrição: "
								+ protolocoPesquisado.getDescricao() + "\n");

			}
		}
	

	public void removerPeloNumerodoProtocolo(int numeroProtocoloParaRemover) {
		for (Ocorrencia ocorrencia : ocorrencias) {
			if (ocorrencia.getNumProtocolo() == numeroProtocoloParaRemover) {
				ocorrencias.remove(ocorrencia);
				break;
			}
		}
	}

	public void listarOcorrenciasOuvidoria() {

		String listagemOcorrencias = "Listagem de Ocorrências \n";

		if (ocorrencias.size() > 0) {

			for (Ocorrencia ocorrencia : ocorrencias) {

				listagemOcorrencias += "Número protocolo: " + ocorrencia.getNumProtocolo() + " Título: "
						+ ocorrencia.getNomeTitulo() + " Tipo: " + ocorrencia.getTipoOcorrencia() + " Descrição: "
						+ ocorrencia.getDescricao() + "\n";
			}
			JOptionPane.showMessageDialog(null, listagemOcorrencias);
		} else {
			JOptionPane.showMessageDialog(null, "Não existem ocorrências na Ouvidoria");

		}

	}

	public void adicionarNovaOcorrencia(Ocorrencia novaOcorrencia) {
		this.ocorrencias.add(novaOcorrencia);
	}

	public void removerOcorrencia(Ocorrencia ocorrenciaParaRemover) {
		this.ocorrencias.remove(ocorrenciaParaRemover);
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public ArrayList<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}

}
