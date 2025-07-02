package com.lista.exercicios.ex;

import java.util.Scanner;

public class ContadorDeEspacosEx38 {
	
	public static void main(String[] args) {
		
		String frase;
		int contador = 0;
		char caractere =' ';
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma frase que eu conto quantos espaços você digitou : ");
		frase = scan.nextLine();
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == caractere) {
				contador ++;
			}
		}
		
		
		System.out.println("A frase conte " + contador + " espaços");
		
		
		scan.close();
		
	}
	
}
