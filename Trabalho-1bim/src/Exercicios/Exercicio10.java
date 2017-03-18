package Exercicios;

import java.util.Scanner;

public class Exercicio10 {
	private static Scanner s;
	int lado1, lado2, lado3;
	{
		s = new Scanner(System.in);
		
		System.out.println("Entre com o lado 1:");
		lado1 = s.nextInt();
		System.out.println("Entre com o lado 2:");
		lado2 = s.nextInt();
		System.out.println("Entre com o lado 3:");
		System.out.println("-----------------------------------------\n");
		lado3 = s.nextInt();
		
		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {

			System.out.println("É um triangulo!");

		} else {
			System.out.println("Não é um triangulo!");
		}
} 
}
