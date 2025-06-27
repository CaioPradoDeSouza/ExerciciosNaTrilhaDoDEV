package com.lista.exercicios.ex;

import java.util.Scanner;

public class CalculadoraEx11 {
	
	public static void main(String[] args) {
		
		int num1=0;
		int num2=0;
		int operacao=0;
		int resultado=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número :");
		num1=scan.nextInt();
		
		System.out.println("Digite a operação desejada :");
		System.out.println(" 1 - somar | 2 - subtrair | 3 - multiplicar | 4 - dividir ");
		operacao=scan.nextInt();
		
		System.out.println("Digite o segundo número :");
		num2=scan.nextInt();
		
		switch(operacao) {
		case 1:
			resultado = num1 + num2;
			System.out.println("O resultado da operação " + num1 + " + " + num2 +  " é : " + resultado);
			break;
		case 2:
			resultado = num1 - num2;
			System.out.println("O resultado da operação " + num1 + " - " + num2 +  " é : " + resultado);
			break;
		case 3:	
			resultado = num1 * num2;
			System.out.println("O resultado da operação " + num1 + " x " + num2 +  " é : " + resultado);
			break;
		case 4:
			resultado = num1 / num2;
			System.out.println("O resultado da operação " + num1 + " / " + num2 +  " é : " + resultado);
			break;
		}
		
		
		scan.close();
		
	}
	
}
