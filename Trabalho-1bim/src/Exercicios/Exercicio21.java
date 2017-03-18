package Exercicios;

public class Exercicio21 {
	public static void main(String[] args) {

		int[][][][] x = new int[10][10][10][10];
		int contador = 1;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {

						x[i][j][k][l] = contador;
						contador++;
						System.out.print("|" + i + "|" + j + "|" + k + "|" + l + "|" +" = "+"|" + x[i][j][k][l] +"|     " +"\t");

					}
					System.out.print("\n");
				}
			}
		}
	}
}
