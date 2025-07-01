package com.lista.exercicios.ex;

import java.util.Scanner;

public class QuantasLetrasEx13 {
	public static void main(String[] args) {

		String palavraFrase;
		int count;
		String palavraTrim;

	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite uma palavra ou frase :");
	    palavraFrase = scan.nextLine();
	    
	    palavraTrim=palavraFrase.replaceAll("\\s","").trim();
	    
	    System.out.println(palavraTrim.length());

		scan.close();

	}
}
