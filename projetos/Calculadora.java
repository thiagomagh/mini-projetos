package br.com.unicuritiba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a opera��o que deseja:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");	
		int opcao = scanner.nextInt();
		
		System.out.print("Digite o operador 1: ");
		int operando1 = scanner.nextInt();
		
		System.out.print("Digite o operador 2: ");
		int operando2 = scanner.nextInt();
		
		int resultado = 0;
		
		switch (opcao) {
		case 1:
			resultado = somar(operando1, operando2);		
			break;
			
		case 2:
			resultado = subtrair(operando1, operando2);	
			break;
		
		case 3:
			resultado = multiplicar(operando1, operando2);
			break;
			
		case 4:
			resultado = dividir(operando1, operando2);
			break;

		default:
			System.out.print("Opera��o inv�lida.");
			break;
		}
		
		// Solu��o 1
		/*
		boolean resultadoValidado = validarResultado(resultado);
		
		if (resultadoValidado) {
			System.out.print("Resultado: " + resultado);
		} else {
			System.out.print("Resultado n�o � v�lido.");
		}
		*/
		
		// Solu��o 2
		if (validarResultado(resultado)) {
			System.out.print("Resultado: " + resultado);
		} else {
			System.out.print("Resultado n�o � v�lido.");
		}
		
		scanner.close();
	}
	
	private static int somar(int operando1, int operando2) {
		int resultado = operando1 + operando2;
		
		return resultado;
	}
	
	private static int subtrair(int operando1, int operando2) {
		int resultado = operando1 - operando2;
		
		return resultado;
	}
	
	private static int multiplicar(int operando1, int operando2) {
		int resultado = operando1 * operando2;
		
		return resultado;
	}
	
	private static int dividir(int operando1, int operando2) {
		int resultado = operando1 / operando2;
		
		return resultado;
	}
	
	private static boolean validarResultado(int resultado) {
		// Solu��o 1
		/*
		boolean isValido = false;
		
		if (resultado < 300) {
			isValido = true;
		}
		
		return isValido;
		*/
		
		// Solu��o 2
		/*
		if (resultado < 300) {
			return true;
		} else {
			return false;
		}
		*/
		
		// Solu��o 3
		return resultado < 300;
	}
}
