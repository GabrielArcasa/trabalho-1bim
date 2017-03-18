package Exercicios;

import java.util.Scanner;

public class Exercicio22 {
	private static Scanner x;

	public static void main(String[] args) {

				x = new Scanner(System.in);

		int Numeros = 10;
		int[] VetorNumero = new int[Numeros];
		for (int i = 0; i < Numeros; ++i) {
			System.out.println("Insira o valor desejado " + (i + 1));
			VetorNumero[i] = x.nextInt();
		}

		for (int i = 0; i < Numeros; ++i) {
				
		int NumeroCopia = 10;
		int [] CopiaVetor = new int[NumeroCopia];
		
			CopiaVetor[i] = VetorNumero[i];
			System.out.println(CopiaVetor[i] + "\t");
	}
}
}

