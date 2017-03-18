package Exercicios;

import java.util.Scanner;

public class Exercicio08 {

	private static Scanner xs;

	public static void main(String[] args) {

		xs = new Scanner(System.in);
		int base, base2, raio, altura, resultado;
		int opções;
		System.out.println("-----------------------------------------\n");
		System.out.println("       1 para Calcular área do Triângulo");
		System.out.println("-----------------------------------------\n");
		System.out.println("       2 para Calcular área do Quadrado");
		System.out.println("-----------------------------------------\n");
		System.out.println("       3 para Calcular área do Retângulo");
		System.out.println("-----------------------------------------\n");
		System.out.println("       4 para Calcular área do Circulo");
		System.out.println("-----------------------------------------\n");
		System.out.println("       5 para Calcular área do Trapézio");
		System.out.println("-----------------------------------------\n");
		System.out.print("Digite: ");
		opções = xs.nextInt();
		switch (opções) {

		case 1:
			System.out.println("-----------------------------------------\n");
			System.out.print("Digite a base do Triangulo: ");
			base = xs.nextInt();
			System.out.println("-----------------------------------------\n");
			System.out.print("Digite a Altura do Triangulo: ");
			altura = xs.nextInt();

			resultado = (base * altura) / 2;
			System.out.println("-----------------------------------------\n");
			System.out.println(
					"A area do triangulo com base " + base + " e altura " + altura + " é igual a: " + resultado);
			System.out.println("-----------------------------------------\n");

			break;

		case 2:
			System.out.println("-----------------------------------------\n");
			System.out.print("Informe a base do quadrado: ");
			base = xs.nextInt();

			resultado = base * base;
			System.out.println("-----------------------------------------\n");
			System.out.println(
					"A area de um quadrado é igual com os valores de base " + base + " é igual a: " + resultado + "\n");
			System.out.println("-----------------------------------------\n");
			break;

		case 3:
			System.out.println("-----------------------------------------\n");
			System.out.print("Informe a base do retangulo: ");
			base = xs.nextInt();
			System.out.println("-----------------------------------------\n");
			System.out.print("Informe a altura do retangulo: ");
			altura = xs.nextInt();

			resultado = base * altura;
			System.out.println("-----------------------------------------\n");
			System.out.println("A area de um retangulo com a base de " + base + " e altura de " + altura
					+ " é igual a: " + resultado);
			System.out.println("-----------------------------------------\n");
			break;

		case 4:
			System.out.println("-----------------------------------------\n");
			System.out.print("Informe o raio do Circulo em numeros inteiros: ");

			raio = xs.nextInt();

			resultado = (int) (Math.PI * (raio * raio));
			System.out.println("-----------------------------------------\n");
			System.out.println("A area do circulo com um raio " + raio + " é igual a: " + resultado);
			System.out.println("-----------------------------------------\n");
			break;

		case 5:
			System.out.println("-----------------------------------------\n");
			System.out.print("Informe o valor da base Maior do trapézio: ");
			base = xs.nextInt();
			System.out.println("-----------------------------------------\n");
			System.out.print("Informe o valor da base Menor do trapézio: ");
			base2 = xs.nextInt();
			System.out.println("-----------------------------------------\n");
			System.out.print("Informe o valor da altura do trapézio ");
			altura = xs.nextInt();

			resultado = ((base + base2) * altura) / 2;
			System.out.println("-----------------------------------------\n");
			System.out.println(" A Area de um trapezio com Base Maior de " + base +", Base Menor de " + base2 +" com uma altura de "+ altura + " igual a:5 " + resultado);
			System.out.println("-----------------------------------------\n");
			break;
		default:
			break;
		}
	}
}
