package com.lista.exercicios.ex;

import java.util.Scanner;

public class RaioDoCirculoEx35 {
	
	public static void main(String[] args) {
		
		double pi = 3.14159;
		double raio = 0;
		double resultado = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o raio do círculo que eu te mostro a área deste círculo :");
		raio=scan.nextDouble();
		
		resultado = pi * raio * raio;
		System.out.printf("A área do círculo com raio " + raio + " é " + String.format("%.2f", resultado) + " cm². ");
		
		scan.close();
		
	}
	
}
