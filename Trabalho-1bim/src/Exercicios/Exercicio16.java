package Exercicios;

import java.util.Scanner;

public class Exercicio16 {

	private static Scanner x;

	public static void main(String[] args) {

		x = new Scanner(System.in);

		String[] VetorNome = new String[10];
		for (int i = 0; i < 10; ++i) {
			System.out.println("------------------------------------");
			System.out.println("Insira o Nome desejado " + (i + 1));
			System.out.println("------------------------------------\n");
			VetorNome[i] = x.nextLine();
		}

		for (int i = 0; i < 10; ++i) {
			System.out.println("------------------------------------");
			System.out.println("->" + VetorNome[i]);
		}
	}
}