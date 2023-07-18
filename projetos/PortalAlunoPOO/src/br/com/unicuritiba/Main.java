package br.com.unicuritiba;

import br.com.unicuritiba.model.Professor;

public class Main {

	public static void main(String[] args) {
		Professor prof = new Professor(
				"Diego Palma",
				"12345678995",
				"28/01/1986",
				"diego.navarro@unicuritiba.com.br",
				"diego",
				true);
		
		prof.setNome("Lucas Filipak");
		
		System.out.println(prof.getNome());
		System.out.println(prof.getCpf());
		System.out.println(prof.getDataNascimento());
		System.out.println(prof.getEmail());
		System.out.println(prof.getMatricula());
	}

}
