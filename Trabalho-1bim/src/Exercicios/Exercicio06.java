package Exercicios;

import java.util.Scanner;

public class Exercicio06 {
	
	private static Scanner x;

	public static void main(String[] args) {

		String Login = "Admin";
		String Comparacao;
		x = new Scanner(System.in);
		System.out.println("-----------------------------------------\n");
		System.out.print("Login: ");
		
		Comparacao = x.nextLine();
		if (Login.equals(Comparacao)) {
			System.out.println("-----------------------------------------");
			System.out.println("Verdadeiro");
			System.out.println("-----------------------------------------\n");
		} else {
			System.out.println("-----------------------------------------");
			System.out.println("Falso");
			System.out.println("-----------------------------------------\n");
		}
	}
}