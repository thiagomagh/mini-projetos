package br.com.unicuritiba.factory;

import br.com.unicuritiba.model.Aluno;
import br.com.unicuritiba.model.AlunoBiomedicina;
import br.com.unicuritiba.model.AlunoMedicina;

public class FactoryAluno {
	public final static int BASE = 1;
	public final static int MEDICINA = 2;
	public final static int BIOMEDICINA = 3;
	
	public Aluno[] criarTurma(int tipo, int tamanho) {
		Aluno[] alunos = new Aluno[tamanho];
		for (int indice = 0; indice < tamanho; indice++) {
			if (tipo == BASE) {
				alunos[indice] = new Aluno();
			} else if (tipo == MEDICINA) {
				alunos[indice] = new AlunoMedicina();
			} else if (tipo == BIOMEDICINA) {
				alunos[indice] = new AlunoBiomedicina();
			}
		}
		
		return alunos;
	}
}
