package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
	
	private static Scanner xs;

	public static void main(String[] args) {
		
		
		xs = new Scanner(System.in);
		int opções;
		System.out.println("              Opções:");
		System.out.println("------------------------------------");
		System.out.println("              Opção 1");
		System.out.println("------------------------------------");
		System.out.println("              Opção 2");
		System.out.println("------------------------------------");
		System.out.println("              Opção 3");
		System.out.println("------------------------------------");
		System.out.println("              Opção 4");
		System.out.println("------------------------------------");
		System.out.println("              Opção 5");
		System.out.println("------------------------------------");
		opções = xs.nextInt();
		
		switch (opções) {
		case 1:
			System.out.println("------------------------------------");
			System.out.println("Obrigado por escolher a opção 1");
			
			break;
			
		case 2:
			System.out.println("------------------------------------");
			System.out.println("Obrigado por escolher a opção 2");
			break;
			
		case 3:
			System.out.println("------------------------------------");
			System.out.println("Obrigado por escolher a opção 3 ");
			
			break;
			
		case 4:
			System.out.println("------------------------------------");
			System.out.println("Obrigado por escolher a opção 4 ");
			
			break;
			
		case 5:
			System.out.println("------------------------------------");
			System.out.println("Obrigado por escolher a opção 5 ");
			
			break;
		}
	}
}
