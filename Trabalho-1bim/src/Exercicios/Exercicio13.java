package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
	
	private static Scanner xs;

	public static void main(String[] args) {
		
		
		xs = new Scanner(System.in);
		int op��es;
		System.out.println("              Op��es:");
		System.out.println("------------------------------------");
		System.out.println("              Op��o 1");
		System.out.println("------------------------------------");
		System.out.println("              Op��o 2");
		System.out.println("------------------------------------");
		System.out.println("              Op��o 3");
		System.out.println("------------------------------------");
		System.out.println("              Op��o 4");
		System.out.println("------------------------------------");
		System.out.println("              Op��o 5");
		System.out.println("------------------------------------");
		op��es = xs.nextInt();
		
		switch (op��es) {
		case 1:
			System.out.println("------------------------------------");
			System.out.println("Obrigado por escolher a op��o 1");
			
			break;
			
		case 2:
			System.out.println("------------------------------------");
			System.out.println("Obrigado por escolher a op��o 2");
			break;
			
		case 3:
			System.out.println("------------------------------------");
			System.out.println("Obrigado por escolher a op��o 3 ");
			
			break;
			
		case 4:
			System.out.println("------------------------------------");
			System.out.println("Obrigado por escolher a op��o 4 ");
			
			break;
			
		case 5:
			System.out.println("------------------------------------");
			System.out.println("Obrigado por escolher a op��o 5 ");
			
			break;
		}
	}
}
