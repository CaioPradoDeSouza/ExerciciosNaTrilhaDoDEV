package com.lista.exercicios.ex;

import java.util.Scanner;

public class InversorDeStringsEx30 {
	
	public static void main(String[] args) {
		
		String frasePalavra ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra ou frase que eu te mostro ela de trás para frente :");
		frasePalavra = scan.nextLine();
		
		String invertida = new StringBuilder(frasePalavra).reverse().toString();
		
		System.out.println(invertida);
		scan.close();
		
	}
}
