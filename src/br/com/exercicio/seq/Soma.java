package br.com.exercicio.seq;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numeroUm = scanner.nextInt();
		
		System.out.println("Digite outro n�mero");
		int numeroDois = scanner.nextInt();
		
		int soma = numeroUm + numeroDois;
		
		scanner.close();
		
		System.out.println("a soma dos n�meros �: " + soma);	
	}
}
