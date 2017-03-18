package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		int x;

		System.out.println("Digite a media: ");
		x = input.nextInt();

		if (x >= 70)
			System.out.println("Aprovado");

		else if (x >= 40 && x < 70) {
			System.out.println("EM EXAME");
		} else
			System.out.println("REPROVADO");
	}
}
