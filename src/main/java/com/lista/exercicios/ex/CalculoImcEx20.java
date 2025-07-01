package com.lista.exercicios.ex;

import java.util.Scanner;

public class CalculoImcEx20 {
	
	public static void main(String[] args) {
		
		double peso = 0;
		double altura = 0;
		double res = 0;
		
		String formatado = String.format("%.2f", res);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu peso : ");
		peso = scan.nextDouble();
		System.out.println("Digite o seu altura : ");
		altura = scan.nextDouble();
		res = peso / (altura * altura);
		
		
		
		
		if(res < 18) {
			System.out.printf("O seu IMC é " + String.format("%.2f", res) + " você está muito magro !");
		}else if((res > 18) && (res <= 24.9)) {
			System.out.printf("O seu IMC é " + String.format("%.2f", res) + " você com um peso saudável !");
		}else if((res >= 25) && (res <= 29.9)) {
			System.out.printf("O seu IMC é " + String.format("%.2f", res) + " você está com sobrepeso !");
		}else if((res >= 30) && (res <= 34.9)) {
			System.out.printf("O seu IMC é " + String.format("%.2f", res) + " você com obesidade grau 1 !");
		}else if((res >= 35) && (res <= 39.9)) {
			System.out.printf("O seu IMC é " + String.format("%.2f", res) + " você com obesidade grau 2 !");
		}else {
			System.out.printf("O seu IMC é " + String.format("%.2f", res) + " você com obesidade grau 3 !");
		}
		
		
		
		
		scan.close();
		
	}
	
}
