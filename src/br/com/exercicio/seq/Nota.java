package br.com.exercicio.seq;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota");
		double notaUm = scanner.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		double notaDois = scanner.nextDouble();
		
		System.out.println("Entre com a terceira nota");
		double notaTres = scanner.nextDouble();
		
		System.out.println("Entre com a quarta nota");
		double notaQuatro = scanner.nextDouble();
		
		scanner.close();
		
		double media = ((notaUm + notaDois + notaTres + notaQuatro) / 4);
		
		System.out.println("A média é: " + media);

	}

}
