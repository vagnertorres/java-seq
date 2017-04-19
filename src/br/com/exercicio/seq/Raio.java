package br.com.exercicio.seq;

import java.util.Scanner;

public class Raio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o raio do circulo");
		double raio = scanner.nextDouble();
		
		scanner.close();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("Area do circulo é: " + area);

	}

}
