package br.com.exercicio.seq;

import java.util.Scanner;

public class PesoPeixe {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o peso do peixe");
		double peso = scanner.nextDouble();

		if (peso > 50) {

			double excesso = peso - 50;
			double multa = excesso * 4;

			System.out.println("excesso: " + excesso);
			System.out.println("multa: " + multa);

		} else {

			System.out.println("você está dentro do regulamento");
			System.out.println("excesso: 0");
			System.out.println("multa: 0");
		}
	}
}