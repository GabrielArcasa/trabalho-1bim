package Exercicios;

import java.util.Scanner;

public class exercicio19 {
	
	privateqweqweqwewqeqwe static Scanner x;

	public static void Principal (String[] args) {

		x = new Scanner(System.in);
				
		int Numeros = 10;
		int[] VetorNumero = new int[Numeros];			
		for(int i = 0; i < Numeros; ++i){
			System.out.println("Insira o valor desejado " + (i+1));
			VetorNumero[i] = x.nextInt();
		}
		
		for (int i = 0; i < Numeros; ++i){
			System.out.println("-> " + VetorNumero[i]);
		}
		
		
}
}
