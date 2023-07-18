package br.com.unicuritiba.factory;

import br.com.unicuritiba.model.Veiculo;
import br.com.unicuritiba.model.Pickup;
import br.com.unicuritiba.model.Suv;
import br.com.unicuritiba.model.Sedan;
import br.com.unicuritiba.model.Hatch;

public class FactoryVeiculo {
	public final static int BASE = 1;
	public final static int PICKUP = 2;
	public final static int SUV = 3;
	public final static int SEDAN = 4;
	public final static int HATCH = 5;
	
	public Veiculo[] criarVeiculo(int tipo, int tamanho) {
		Veiculo[] veiculos = new Veiculo[tamanho];
		for (int indice = 0; indice < tamanho; indice++) {
			if (tipo == BASE) {
				veiculos[indice] = new Veiculo();
			} else if (tipo == PICKUP) {
				veiculos[indice] = new Pickup();
			} else if (tipo == SUV) {
				veiculos[indice] = new Suv();
			} else if (tipo == SEDAN) {
				veiculos[indice] = new Sedan();
			} else if (tipo == HATCH) {
				veiculos[indice] = new Hatch();
			}
		}
		
		return veiculos;
	}
}
