package Exercicios;

public class Exercicio20 {

	static Integer[][] x = new Integer[3][3];


	public static void main(String[] args) {
		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;
		x[1][0] = 40;
		x[1][1] = 50;
		x[1][2] = 60;
		x[2][0] = 70;
		x[2][1] = 80;
		x[2][2] = 90;
		
				System.out.print ( getTabela() );
			
		
	}

		static public String getTabela() { 
			String TesteTabela = "";
			
			for (int i = 0; i < x.length; ++i) {

				for (int j = 0; j < x[i].length; ++j) {

					TesteTabela += i + "|" + j + " = " + x[i][j] + "\t";
				}
				TesteTabela += "\n";
			}
			return TesteTabela;
			
	}
}



		