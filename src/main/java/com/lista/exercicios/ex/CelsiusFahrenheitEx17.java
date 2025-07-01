package com.lista.exercicios.ex;

import java.util.Scanner;

public class CelsiusFahrenheitEx17 {
	
	public static void main(String[] args) {
		
		double temperatura=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura : ");
		temperatura = scan.nextDouble();
		
		double res = (temperatura * 1.8) + 32;
		
		System.out.println("A temperatura de " + temperatura + " graus celsius em fahrenheit é : " + res);
		scan.close();
		
	}
}
