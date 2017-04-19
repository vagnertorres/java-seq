package br.com.exercicio.seq;

import java.util.Scanner;

public class CalculoNumero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro");
		int numeroUm = scanner.nextInt();
		
		System.out.println("Entre com outro número inteiro");
		int numeroDois = scanner.nextInt();
		
		System.out.println("Entre com um número real");
		double numeroTres = scanner.nextDouble();
		
		scanner.close();
		
		int dobroPrimeiro = ((numeroUm * 2) * numeroDois / 2);
		
		System.out.println("o produto do dobro do primeiro com metade do segundo: " + dobroPrimeiro);
		
		double somaTriplo = ((numeroUm * 3) + numeroTres);
		
		System.out.println("a soma do triplo do primeiro com o terceiro: " + somaTriplo);
		
		double aoCubo = Math.pow(numeroTres, 3);
		
		System.out.println("o terceiro elevado ao cubo: " + aoCubo);
	}

}
