package br.com.unicuritiba.jokenpo;

import java.util.Random;
import java.util.Scanner;

import br.com.unicuritiba.jokenpo.model.Jogada;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Jogada[] jogadas = new Jogada[3];
		jogadas[0] = new Jogada("Pedra", 1);
		jogadas[1] = new Jogada("Papel", 2);
		jogadas[2] = new Jogada("Tesoura", 3);
		
		System.out.println("Bem-vindo ao JoKenPo");
		System.out.println("\n\n");
		
		System.out.println("Digite a jogada que deseja: ");
		System.out.println();
		System.out.println("1 - Pedra");
		System.out.println();
		System.out.println("2 - Papel");
		System.out.println();
		System.out.println("3 - Tesoura");
		System.out.println();
		
		int jogadorJogadaPosicao = scanner.nextInt();
		
		int computadorJogadaPosicao = new Random().nextInt(3);
		Jogada jogadaComputador =
				jogadas[computadorJogadaPosicao];
		
		if (jogadorJogadaPosicao > 3 || jogadorJogadaPosicao < 1) {
			// Easter egg para o computador ganhar, caso o jogador tenha digitado alguma opção inválida.
			System.out.println("Computador ganhou, ");
		} else {
			if (jogadorJogadaPosicao == 
					jogadaComputador.getValor()) {
				// Empate
				System.out.println("Empate");
			} else if (jogadorJogadaPosicao != 3 && 
					jogadaComputador.getValor() != 3) {
				if (jogadorJogadaPosicao > 
					jogadaComputador.getValor()) {
					// Jogador ganhou
					System.out.println("Jogador ganhou");
				} else {
					// Computador ganhou
					System.out.println("Computador ganhou");
				}
			} else {
				if (jogadorJogadaPosicao == 3 && 
						jogadaComputador.getValor() == 1) {
					System.out.println("Computador ganhou");
				} else if (jogadorJogadaPosicao == 1 && 
						jogadaComputador.getValor() == 3) {
					System.out.println("Jogador ganhou");
				} else {
					if (jogadorJogadaPosicao > 
					jogadaComputador.getValor()) {
						System.out.println("Jogador ganhou");
					} else {
						System.out.println("Computador ganhou");
					}
				}
			}
		}
		
		System.out.println(jogadaComputador.getNome());
		
		scanner.close();
	}

}
