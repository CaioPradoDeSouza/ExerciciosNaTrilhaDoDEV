package com.lista.exercicios.ex;

import java.util.Scanner;

public class QualNumeroEMaiorEx29 {

	public static void main(String[] args) {
		
		int num1=0,num2=0,num3=0;
		int maiorNumero = 0;
		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro numero : ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo numero : ");
		num2 = scan.nextInt();
		System.out.println("Digite o terceiro numero : ");
		num3 = scan.nextInt();
		
		int[] numeros= {num1,num2,num3};
		
		for(int numero : numeros) {
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		
		System.out.println("O maior número digitado foi : " + maiorNumero);
		
		scan.close();
		
		
	}
}
