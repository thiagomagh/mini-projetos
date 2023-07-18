package br.com.unicuritiba.model;

public class AlunoMedicina extends Aluno {
	private String licencaCRM;
	private String residencia;
	
	public String getLicencaCRM() {
		return licencaCRM;
	}
	public void setLicencaCRM(String licencaCRM) {
		this.licencaCRM = licencaCRM;
	}
	public String getResidencia() {
		return residencia;
	}
	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}
}
