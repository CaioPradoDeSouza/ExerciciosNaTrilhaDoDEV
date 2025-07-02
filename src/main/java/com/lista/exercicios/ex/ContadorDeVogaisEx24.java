package com.lista.exercicios.ex;

import java.util.Scanner;

public class ContadorDeVogaisEx24 {
	
	public static void main(String[] args) {
		
		String frase ;
		String vogais = "aeiouAEIOU"; 
		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digtite uma frase que eu te digo quantas vogais tem nela : ");
		frase = scan.nextLine();
		
		for(int i = 0; i < frase.length();i++) {
			char caractere = frase.charAt(i);
			if(vogais.indexOf(caractere) != -1) {
				contador ++;
			}
		}

		 System.out.println("Número de vogais: " + contador);
		
		scan.close();
		
		
		
	}
}
