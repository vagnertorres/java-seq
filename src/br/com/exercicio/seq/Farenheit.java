package br.com.exercicio.seq;

import java.util.Scanner;

public class Farenheit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura Farenheit");
		double farenheit = scanner.nextDouble();
		
		scanner.close();
		
		double celsius = (5 * (farenheit - 32) / 9);
		
		System.out.println("o valor convertido para graus celsius é: " + celsius);

	}

}
