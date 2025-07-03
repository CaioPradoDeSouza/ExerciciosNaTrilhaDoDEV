package com.lista.exercicios.ex;

import java.util.Scanner;

public class VerificaSeONumeroEDivisivelPor3E5Ex45 {
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero : ");
		numero = scan.nextInt();
		
		if(numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("O número " + numero + " é divisível por 3 e por 5 ");
		}else {
			System.out.println("O número " + numero + " não é divisível por 3 e por 5 ");
		}
		
		
		
		scan.close();
		
	}
}
