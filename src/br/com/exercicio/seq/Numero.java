package br.com.exercicio.seq;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		int numero = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("o n�mero digitado �: " + numero);

	}

}
