package br.com.exercicio.seq;

import java.util.Scanner;

public class Centimetro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CONVERSÃO METRO PARA CENTIMETRO");
		System.out.println("Entre com o valor que será convertido");
		double metro = scanner.nextDouble();
		
		scanner.close();
		
		double centimetro = (metro * 100);
		
		System.out.println("o valor convertido para centímetros é: " + centimetro);

	}

}
