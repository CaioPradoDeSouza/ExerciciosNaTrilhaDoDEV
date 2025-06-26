package com.lista.exercicios.ex;

import java.util.Scanner;

public class NumerosAteNEx6 {
	
	public static void main(String[] args) {
		
		int n = 0;
		int i = 1;
		int valor = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero : ");
		n=scan.nextInt();
		
		while(valor < n) {
			valor=valor + i;
			
			System.out.println(valor);
		}
			
		scan.close();
	}
}
