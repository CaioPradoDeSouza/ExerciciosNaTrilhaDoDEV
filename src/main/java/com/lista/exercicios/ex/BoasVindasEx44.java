package com.lista.exercicios.ex;

import java.util.Scanner;

public class BoasVindasEx44 {
	
	public static void main(String[] args) {
		
		String nome;
		String linguagem;
		int idade;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------");
		System.out.println("Digite o seu nome :");
		nome = scan.nextLine();
		System.out.println("----------------------");
		System.out.println("Digite a sua cor linguagem de programação favorita :");
		linguagem = scan.nextLine();
		System.out.println("----------------------");
		System.out.println("Digite a sua idade :");
		idade = scan.nextInt();
		System.out.println("----------------------");
		
		System.out.println("Olá,  " + nome + " você tem "+ idade + " anos, e a sua linguagem de programação favorita é " + linguagem +" ! ");
		System.out.println("Seja bem vindo a TRILHA DO DEV !!!");
		
		scan.close();
		
		
	}
}
