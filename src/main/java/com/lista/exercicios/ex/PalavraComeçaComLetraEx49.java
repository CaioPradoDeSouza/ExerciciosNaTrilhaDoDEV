package com.lista.exercicios.ex;

import java.util.Scanner;

public class PalavraComeçaComLetraEx49 {
	
	public static void main(String[] args) {
		
		String palavra = "Trilha do DEV ";
		String letra;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------");
		System.out.println("Digite uma letra para saber se ela inicia a frase :");
		letra=scan.nextLine();
		
		 if (palavra.toLowerCase().startsWith(String.valueOf(letra).toLowerCase())) {
			 	System.out.println("------------------------");
	            System.out.println("A palavra começa com a letra '" + letra + "'");
	        } else {
	        	System.out.println("------------------------");
	            System.out.println("A palavra NÃO começa com a letra " + letra  );
	        }
		
		scan.close();
		
		
	} 
}
