package Exercicios;

import java.util.Scanner;

public class Exercicio24 {
	private static Scanner posição;
	private static Scanner numeroAlterado;

	public static void main(String[] args) {
		numeroAlterado = new Scanner(System.in);
		posição = new Scanner(System.in);
		int Posicao;
		int i;
		int Numero;

		int[] x = new int[10];
		
		
		System.out.println("Informe a posição do vetor que quer Alterar de 0 a 9");
		Posicao = posição.nextInt();
		System.out.println("------------------------------------");

		System.out.println("Informe o valor que deseja: ");
		Numero = numeroAlterado.nextInt();
		System.out.println("------------------------------------");

		x[Posicao] = Numero;

		for (i = 0; i < x.length; ++i) {
			System.out.println(x[i]);
		}
	}
}
