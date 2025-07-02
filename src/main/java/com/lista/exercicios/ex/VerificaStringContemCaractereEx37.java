package com.lista.exercicios.ex;

import java.util.Scanner;

public class VerificaStringContemCaractereEx37 {
	
	public static void main(String[] args) {
		
		String frase = "O programador que programa de verdade não será substituido por IA !";
		String letra;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra que eu te digo se ela esta na frase secreta !");
		letra = scan.nextLine();
		
		if(frase.contains(String.valueOf(letra))){
			System.out.println("A letra " + letra + " está presente na frase secreta ! " );
			System.out.println("A frase é : " + frase);
		}else {
			System.out.println("A letra " + letra + " não está presente na frase secreta !" );
		}
		
		
		scan.close();
	}
}
