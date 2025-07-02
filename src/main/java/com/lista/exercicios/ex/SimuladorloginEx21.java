package com.lista.exercicios.ex;

import java.util.Scanner;

public class SimuladorloginEx21 {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite o nome de usuário :");
	String login = scan.nextLine();
	System.out.println("Digite a senha :");
	String senha = scan.nextLine();
	
	String loginC = "caio";
	String senhaC="caio";
	
	if(login.equals(loginC) && (senha.equals(senhaC))){
		System.out.println("Login realizado com sucesso ! ");
	}else {
		System.out.println("Usuário ou senha incorretos ! ");
	}
	
	
	scan.close();
	
	
	
	
	}
}
