package br.com.exercicio.seq;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o valor hora");
		double valorHora = scanner.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no m�s");
		double horaTrabalhada = scanner.nextDouble();
		
		scanner.close();
		
		double valorTotal = valorHora * horaTrabalhada;
		
		System.out.println("Seu sal�rio �: " + valorTotal);
	}
}
