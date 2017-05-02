package br.com.exercicio.seq;

import java.util.Scanner;

public class MediaPeso {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a sua altura");
		double altura = scanner.nextDouble();

		System.out.println("Digite seu sexo");
		String sexo = scanner.next();
		
		scanner.close();

		if (sexo.equalsIgnoreCase("homem")) {

			double mediaPesoHomem = ((72.7 * altura) - 58);

			System.out.println("Peso ideal é: " + mediaPesoHomem);

		} else if (sexo.equalsIgnoreCase("mulher")) {

			double mediaPesoMulher = ((62.1 * altura) - 44.7);

			System.out.println("Peso ideal é: " + mediaPesoMulher);

		} else {

			System.out.println("sexo inválido");
		}
	}
}