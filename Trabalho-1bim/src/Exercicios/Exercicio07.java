package Exercicios;

import java.util.Scanner;

public class Exercicio07 {
	
	
	private static Scanner x;

	public static void main(String[] args) {
		
		
		 String Login = "Admin";
		 String Senha = "Senha";
	     String ComparacaoLogin;
	     String ComparacaoSenha;
	     x = new Scanner (System.in);
	   	    		 
	     System.out.println("Login: ");
	     ComparacaoLogin = x.nextLine ();
	     System.out.println("Senha: ");
	     ComparacaoSenha = x.nextLine ();
	     
	     if(Login.equals(ComparacaoLogin) && Senha.equals(ComparacaoSenha))
	     { 
	         System.out.println("Login Efetuado com Sucesso!");
	     }
	     else {
	         System.out.println("Usuário e/ou senha incorretos");	     	}
		}
}
