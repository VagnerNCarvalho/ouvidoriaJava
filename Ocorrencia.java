package br.com.ouvidoria.antendimento;

public class Ocorrencia {
	private int numProtocolo;
	private String nomeTitulo;
	private String tipoOcorrencia;
	private String descricao;

	public Ocorrencia(int numProtocolo, String nomeTitulo, String tipoOcorrencia, String descricao) {
		this.numProtocolo = numProtocolo;
		this.nomeTitulo = nomeTitulo;
		this.tipoOcorrencia = tipoOcorrencia;
		this.descricao = descricao;
	}

	public int getNumProtocolo() {
		return numProtocolo;
	}

	public void setNumProtocolo(int numProtocolo) {
		this.numProtocolo = numProtocolo;
	}

	public String getNomeTitulo() {
		return nomeTitulo;
	}

	public void setNomeTitulo(String nomeTitulo) {
		this.nomeTitulo = nomeTitulo;
	}

	public String getTipoOcorrencia() {
		return tipoOcorrencia;
	}

	public void setTipoOcorrencia(String tipoOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
