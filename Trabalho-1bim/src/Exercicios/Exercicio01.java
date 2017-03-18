package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
 private static Scanner input;

public static void main(String[] args) {
		 
		 input = new Scanner(System.in);
		 int x , y , Somar;
		 
		 System.out.println("Informe primeiro valor: ");
		 x = input.nextInt();
		 
		 System.out.println("Informe o Segundo Valor: ");
		 y= input.nextInt();
		 
		 Somar= x + y;
		 
		 System.out.println("A soma do valor: " + x);
		 System.out.println(" e do valor: "+ y);
		
		 System.out.println(" é igual a: "+ Somar);
	 }

}
