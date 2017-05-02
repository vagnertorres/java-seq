package br.com.exercicio.seq;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua altura");
		double altura = scanner.nextDouble();

		double pesoIdeal = (72.7 * altura) - 58;
		
		scanner.close();

		System.out.println("o peso ideal para a altura informada é: " + pesoIdeal);
	}
}