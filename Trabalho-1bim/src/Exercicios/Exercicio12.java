package Exercicios;

import java.util.Scanner;

public class Exercicio12 {
	private static Scanner x;

	public static void main(String[] args) {

		x = new Scanner(System.in);
				
		int Numeros = 10;
		int[] VetorNumero = new int[Numeros];
		int soma = 0;	
		for(int i = 0; i < Numeros; ++i){
			System.out.println("Insira o valor desejado " + (i+1));
			VetorNumero[i] = x.nextInt();
		}
		
		for (int i = 0; i < Numeros; ++i){
			System.out.println("->" + VetorNumero[i]);
		}
		for(int valor : VetorNumero){
			soma += valor;
		}
		System.out.println("Total: "+soma);
		}
}
