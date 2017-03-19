package Exercicios;

import java.util.Scanner;

public class Exercicio19 {

	static int[] VetorNumero = new int[10];

	public static Scanner x;

	public static void main(String[] args) {
		x = new Scanner(System.in);

		for (int i = 0; i < 10; ++i) {

			System.out.println("Insira o valor desejado " + (i + 1));
			VetorNumero[i] = x.nextInt();
		}
		System.out.print(getVetor());

	}

	static public String getVetor() {
		String VetorFinal = "";

		for (int i = 0; i < 10; ++i) {
			VetorFinal += "-> " + VetorNumero[i] + "\n";
		}
		return VetorFinal;

	}
}
