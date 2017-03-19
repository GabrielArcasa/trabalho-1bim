package Exercicios;

import java.util.Scanner;

public class Exercicio25 {

		public static void main(String[] args) {

			Scanner x = new Scanner(System.in);
			String s = "s";
			String teclaDigitada;
			int contador = 0;

			do {
				System.out.println("-----------------------------------------\n");
				System.out.print("Digite s: ");
				contador++;
				teclaDigitada = x.nextLine();
				System.out.println("-----------------------------------------");
				System.out.println("A Letra , s , foi pressionada : " + contador + " vezes.");
				System.out.println("-----------------------------------------\n");
			} while (s.equals(teclaDigitada));

			System.out.println("-----------------------------------------");
			System.out.println("Letra errada.");
			System.out.println("-----------------------------------------\n");

			x.close();
		}
			
	}

