package com.lista.exercicios.ex;

import java.util.Scanner;

public class NumeroEMultiploDoOutroEx33 {
	
	public static void main(String[] args) {
		
		int num1=0;
		int num2=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois números que eu te mostro se o primeiro número é um multiplo do segundo ! ");
		System.out.println("Digite o primeiro numero :");
		num1=scan.nextInt();
		System.out.println("Digite o segundo numero :");
		num2=scan.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.println("O número " + num1 + " é um multiplo de " + num2 + " pois o resultado desta operação tem resto 0 !");
		}else {
			System.out.println("O número " + num1 + " não é um multiplo de " + num2 + " pois o resultado desta operação não tem resto 0 !");
		}
		
		scan.close();
		
	}
	
}
