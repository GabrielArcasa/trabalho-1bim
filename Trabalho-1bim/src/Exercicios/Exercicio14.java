package Exercicios;

import java.util.Scanner;

public class Exercicio14 {

	private static Scanner xs;

	public static void main(String[] args) {

		xs = new Scanner(System.in);
		int Numero1, Numero2, resultado;
		int opções;
		System.out.println("Opções: ");
		System.out.println("------------------------------------");
		System.out.println("       1 para Soma");
		System.out.println("------------------------------------");
		System.out.println("       2 para Subtração");
		System.out.println("------------------------------------");
		System.out.println("       3 para Divisão");
		System.out.println("------------------------------------");
		System.out.println("       4 para Multiplicação");
		System.out.println("------------------------------------");
		System.out.println("       5 para Potenciação");
		System.out.println("------------------------------------");
		System.out.println("       6 para Fatorial");
		System.out.println("------------------------------------");
		opções = xs.nextInt();

		switch (opções) {
		case 1:
			System.out.println("------------------------------------");
			System.out.print("Informe primeiro valor: ");
			Numero1 = xs.nextInt();
			System.out.println("------------------------------------");
			System.out.print("Informe o Segundo Valor: ");
			Numero2 = xs.nextInt();

			resultado = Numero1 + Numero2;
			System.out.println("------------------------------------");
			System.out.println("A soma do valor: " + Numero1);
			System.out.println("------------------------------------");
			System.out.println(" e do valor: " + Numero2);
			System.out.println("------------------------------------");
			System.out.println(" é igual a: " + resultado);
			System.out.println("------------------------------------");
			break;
		case 2:
			System.out.println("------------------------------------");
			System.out.print("Informe primeiro valor: ");
			Numero1 = xs.nextInt();
			System.out.println("------------------------------------");
			System.out.print("Informe o Segundo Valor: ");
			Numero2 = xs.nextInt();
			resultado = Numero1 - Numero2;
			System.out.println("------------------------------------");
			System.out.println("A subtração do valor: " + Numero1);
			System.out.println("------------------------------------");
			System.out.println(" com o valor: " + Numero2);
			System.out.println("------------------------------------");

			System.out.println(" é igual a: " + resultado);
			System.out.println("------------------------------------");
			break;
		case 3:
			System.out.println("------------------------------------");
			System.out.print("Informe primeiro valor: ");
			Numero1 = xs.nextInt();
			System.out.println("------------------------------------");
			System.out.print("Informe o Segundo Valor: ");
	
			Numero2 = xs.nextInt();

			resultado = Numero1 / Numero2;
			System.out.println("------------------------------------");
			System.out.println("A divisão do valor: " + Numero1);
			System.out.println("------------------------------------");
			System.out.println(" com o valor: " + Numero2);
			System.out.println("------------------------------------");
			System.out.println(" é igual a: " + resultado);
			System.out.println("------------------------------------");

			break;
		case 4:
			System.out.println("------------------------------------");
			System.out.print("Informe primeiro valor: ");
			Numero1 = xs.nextInt();
			System.out.println("------------------------------------");
			System.out.print("Informe o Segundo Valor: ");
						Numero2 = xs.nextInt();

			resultado = Numero1 * Numero2;
			System.out.println("------------------------------------");
			System.out.println("A multiplicação do valor: " + Numero1);
			System.out.println("------------------------------------");
			System.out.println(" com o valor: " + Numero2);
			System.out.println("------------------------------------");
			System.out.println(" é igual a: " + resultado);
			System.out.println("------------------------------------");
			break;
		case 5:	
			System.out.println("------------------------------------");
			System.out.print("Informe o valor: ");
			Numero1 = xs.nextInt();
			System.out.println("------------------------------------");
			System.out.print("Informe a Potencia: ");
			Numero2 = xs.nextInt();

			resultado = (int) Math.pow((int) Numero1, (int) Numero2);
			System.out.println("------------------------------------");
			System.out.println("O valor: " + Numero1);
			System.out.println("------------------------------------");
			System.out.println(" elevado a potencia de: " + Numero2);
			System.out.println("------------------------------------");
			System.out.println(" é igual a: " + resultado);
			break;
		case 6:
			System.out.println("------------------------------------");
			System.out.print("Informe o valor a ser fatorado: ");
			Numero1 = xs.nextInt();

			resultado = 1;
			for (int i = 1; i <= Numero1; i++) {
				resultado *= i;
			}
			System.out.println("------------------------------------");
			System.out.println("A fatoração do valor: " + Numero1);
			System.out.println("------------------------------------");
			System.out.println(" é igual a: " + resultado);
			System.out.println("------------------------------------");
		default:
			break;
		}
	}
}
