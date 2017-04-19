package br.com.exercicio.seq;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o valor do lado do quadrado");
		double lado = scanner.nextDouble();
		
		scanner.close();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("o valor da área do quadrado é: " + area);
	}
}
