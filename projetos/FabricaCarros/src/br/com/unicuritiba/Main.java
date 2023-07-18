package br.com.unicuritiba;

import br.com.unicuritiba.factory.FactoryVeiculo;
import br.com.unicuritiba.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		FactoryVeiculo fabrica = new FactoryVeiculo();
		
		Veiculo[] veiculos = fabrica.criarVeiculo(FactoryVeiculo.SEDAN, 3);
	}

}
