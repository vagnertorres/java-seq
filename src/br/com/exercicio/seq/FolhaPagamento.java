package br.com.exercicio.seq;

import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite quanto é o valor/hora do seu trabalho");
		double valorHora = scanner.nextDouble();

		System.out.println("Digite quantas horas você trabalhou");
		double hora = scanner.nextDouble();

		double salarioBruto = valorHora * hora;
		double impostoRenda = ((salarioBruto * 11) / 100);
		double inss = ((salarioBruto * 8) / 100);
		double sindicato = ((salarioBruto * 5) / 100);
		double desconto = (impostoRenda + inss + sindicato);
		double salarioLiquido = salarioBruto - desconto;

		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("Imposto de Renda: " + impostoRenda);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("Desconto: " + desconto);
		System.out.println("Salário Líquido: " + salarioLiquido);
	}
}