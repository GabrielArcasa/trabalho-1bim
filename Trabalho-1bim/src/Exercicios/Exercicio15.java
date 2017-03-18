package Exercicios;

import java.util.Scanner;

public class Exercicio15 {
	private static Scanner x;

	public static void main(String[] args) {

		x = new Scanner(System.in);
		String[] VetorNome = new String[11];
		String[] VetorEmail = new String[11];
		String[] VetorTelefone = new String[11];

		for (int i = 0; i < 11; ++i) {

			if (i == 10) {
				System.out.println("Não é possivel inserir mais dados de clientes \n");
			} else {
				System.out.println("Insira o Nome desejado " );
				VetorNome[i] = x.nextLine();
				System.out.println("Insira o Email: ");
				VetorEmail[i] = x.nextLine();
				System.out.println("Insira o Telefone: ");
				VetorTelefone[i] = x.nextLine();
				System.out.printf("Cliente " + (i+1) + " adicionado.\n\n");
				System.out.println("------------------------------------");
			}
			
		}
		System.out.println("-----------------------------");
		System.out.println("CLIENTES ADICIONADOS");
		System.out.println("-----------------------------");

		for (int i = 0; i < 10; ++i) {
			System.out.println("Nome do Cliente -> " + VetorNome[i] + " | Email -> " + VetorEmail[i] + " | Telefone -> "
					+ VetorTelefone[i]);
		}
	}
}
