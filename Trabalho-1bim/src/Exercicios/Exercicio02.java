package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		int x, y, Multiplicação;

		System.out.println("Informe primeiro valor: ");
		x = input.nextInt();

		System.out.println("Informe o Segundo Valor: ");
		y = input.nextInt();

		Multiplicação = x * y;

		System.out.println("A multiplicação do valor " + x);
		System.out.println(" com o valor " + y);

		System.out.println(" é igual a " + Multiplicação);
	}
}
