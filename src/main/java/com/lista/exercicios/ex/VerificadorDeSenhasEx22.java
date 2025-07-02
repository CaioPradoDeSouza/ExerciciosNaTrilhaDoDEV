package com.lista.exercicios.ex;

import java.util.Scanner;

public class VerificadorDeSenhasEx22 {
	
	public static void main(String[] args) {
		
		String senha;
		String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a senha : ");
		senha = scan.nextLine();
		
		if(senha.matches(pattern)) {
			System.out.println("Senha valida !");
		}else {
			System.out.println("Senha invalida !");
		}
		
		
		
		scan.close();
		
	}
}
