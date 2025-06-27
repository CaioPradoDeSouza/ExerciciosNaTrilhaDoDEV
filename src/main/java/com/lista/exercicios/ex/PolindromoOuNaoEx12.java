package com.lista.exercicios.ex;

import java.util.Scanner;

public class PolindromoOuNaoEx12 {
	
	public static void main(String[] args) {
		
		String palavra;
		String palavraInversa;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra : ");
		palavra=scan.nextLine();
		
		String palavraInvertida = new StringBuilder(palavra).reverse().toString();
		palavraInversa=palavraInvertida;
		//System.out.println(palavraInvertida);
		
		if(palavraInvertida.equals(palavra)) {
			System.out.println("A palavra " + palavra + " é um políndromo, pois se lida de trás para frente tem o mesmo resultado ! ");
				
		}else {
			System.out.println("A palavra " + palavra + " não é um políndromo, pois se lida de trás para frente não tem o mesmo resultado ! ");
		}
		
		
		
		scan.close();
		
	}
}
