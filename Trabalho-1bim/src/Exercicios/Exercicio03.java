package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		int x, exponencicao;

		System.out.println("Informe o valor: ");
		x = input.nextInt();

		exponencicao = x * x;

		System.out.println("O Numero " + x + " elevado a Dois � igual a: " + exponencicao);
	}
}
