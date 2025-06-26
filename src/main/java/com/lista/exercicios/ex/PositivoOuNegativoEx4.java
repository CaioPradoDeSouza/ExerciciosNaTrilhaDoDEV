package com.lista.exercicios.ex;

import java.util.Scanner;

public class PositivoOuNegativoEx4 {
	public static void main(String[] args) {
		int num = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero : ");
		num = scan.nextInt();
		
		if(num < 0) {
			System.out.println("O número digitado é " + num + " ele é um número negativo, portanto é inválido.");
		}else if(num == 0) {
			System.out.println("O número digitado é " + num + " ele é um número negativo, portanto é inválido.");

		}else {
			System.out.println("O número digitado é " + num + " ele é um número positivo, portanto é válido.");
		}
		
		scan.close();
		
	}
}
