package br.com.exercicio.seq;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numeroUm = scanner.nextInt();
		
		System.out.println("Digite outro número");
		int numeroDois = scanner.nextInt();
		
		int soma = numeroUm + numeroDois;
		
		scanner.close();
		
		System.out.println("a soma dos números é: " + soma);	
	}
}
