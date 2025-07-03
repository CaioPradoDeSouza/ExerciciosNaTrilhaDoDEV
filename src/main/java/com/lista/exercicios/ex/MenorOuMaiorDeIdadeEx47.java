package com.lista.exercicios.ex;

import java.util.Scanner;

public class MenorOuMaiorDeIdadeEx47 {
	
	public static void main(String[] args) {
		
	int idade = 0;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("-----------------------------");
	System.out.println("Digite a sua idade :");
	idade = scan.nextInt();
	
	if(idade < 18) {
		System.out.println("Sua idade é " + idade + " Você é menor de idade ! ");
	}else {
		System.out.println("Sua idade é " + idade +" você é maior de idade !");
	}
	
	
	scan.close();
	
	}
}
