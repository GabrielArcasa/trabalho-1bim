package Exercicios;

public class Exercicio23 {
	
	public static void main(String[] args) {
	
		int[][] Matriz = new int[3][3];

		Matriz[0][0] = 10;
		Matriz[0][1] = 20;
		Matriz[0][2] = 30;
		Matriz[1][0] = 40;
		Matriz[1][1] = 50;
		Matriz[1][2] = 60;
		Matriz[2][0] = 70;
		Matriz[2][1] = 80;
		Matriz[2][2] = 90;
		
		for (int i = 0; i < Matriz.length; ++i) {

			for (int h = 0; h < Matriz[i].length; ++h) {

			
			int[][] OutraMatriz = new int[3][3];


					OutraMatriz[i][h] = Matriz[i][h];
					System.out.print(OutraMatriz[i][h] + "\t");
					
				}
			System.out.println("\n");
			}
		}
	
}

