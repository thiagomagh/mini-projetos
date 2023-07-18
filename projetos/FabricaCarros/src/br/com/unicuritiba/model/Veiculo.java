package br.com.unicuritiba.model;

public class Veiculo {
	private String modelo;
	private int ano;
	private String cor;
	private String motorizacao;
	private int quantPortas;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMotorizacao() {
		return motorizacao;
	}
	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}
	public int getQuantPortas() {
		return quantPortas;
	}
	public void setQuantPortas(int quantPortas) {
		this.quantPortas = quantPortas;
	}
}
