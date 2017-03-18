package Exercicios;

import java.util.Scanner;

public class Exercicio09 {
	
	private static Scanner s;

	public static void main(String[] args) {
		
		int lado1, lado2, lado3;
		{
		s = new Scanner (System.in);
		System.out.println("Entre com o lado 1:");
		lado1 = s.nextInt();
		System.out.println("Entre com o lado 2:");
		lado2 = s.nextInt();
		System.out.println("Entre com o lado 3:");
		lado3 = s.nextInt();
		System.out.println("-----------------------------------------\n");
		if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triangulo Equilatero");
			} else if ((lado1 == lado2) || (lado1 == lado3)) {
				System.out.println("Triangulo Isosceles");
			} else
				System.out.println("Triângulo Escaleno");
		} else {
			System.out.println("Não é um triangulo!");
		}
		
	}
}
}