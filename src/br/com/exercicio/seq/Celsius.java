package br.com.exercicio.seq;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("entre com o a temperatura em graus celsius");
		double celsius = scanner.nextDouble();
		
		scanner.close();
		
		double farenheit = ((celsius * 1.8) + 32);
		
		System.out.println("o valor convetido para farenheit é: " + farenheit);
	}

}
