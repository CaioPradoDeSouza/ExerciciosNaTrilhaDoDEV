package com.lista.exercicios.ex;

import java.util.Scanner;

public class ImprimirNumerosImparesEx32 {
	
	public static void main(String[] args) {
		
		int numero = 0;
		int inicial = 1;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número que eu te mostro todos os números ímpares de 1 até o número que você digitou :");
		numero = scan.nextInt();
		
		for(int i = 0; inicial < numero; i++) {
			inicial ++;
			
			if(inicial % 2 != 0) {
				System.out.println("O número " + inicial + " é impar !");
			}
		}
		
		scan.close();
		
		
	}
	
}
