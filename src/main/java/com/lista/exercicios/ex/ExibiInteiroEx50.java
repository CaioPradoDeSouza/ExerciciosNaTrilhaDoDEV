package com.lista.exercicios.ex;

import java.util.Scanner;

public class ExibiInteiroEx50 {
	
	public static void main(String[] args) {
		
		float numero = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("Digite um número com casa decimal : ");
		numero = scan.nextFloat();
		
		int inteiro = (int) numero;
		
		System.out.println("A parte inteira de " + numero+ " é " + inteiro);
		
		scan.close();
		
	}
}
