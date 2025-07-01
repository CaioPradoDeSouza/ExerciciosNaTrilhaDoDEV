package com.lista.exercicios.ex;

import java.util.Scanner;

public class ContadorRegressivoEx19 {
	
	public static void main(String[] args) {
		
		int numero = 0;
		int in = 0;
		int res = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número : ");
		numero = scan.nextInt();
		
		for(int i = 0; in <= numero; i++) {
			
			System.out.println(numero --);
		}
		
		
		
		scan.nextInt();
		
	}
}
