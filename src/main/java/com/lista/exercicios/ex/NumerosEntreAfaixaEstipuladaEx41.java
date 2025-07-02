package com.lista.exercicios.ex;

import java.util.Scanner;

public class NumerosEntreAfaixaEstipuladaEx41 {
	
	public static void main(String[] args) {
		
		int inicio=0,fim=0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.println("Digite dois números um inicial e outro final que eu te mostro os números entre os dois ! ");
		System.out.println("----------------------------------");
		System.out.println("Digite o número inicial : ");
		inicio=scan.nextInt();
		System.out.println("----------------------------------");
		System.out.println("Digite o número final : ");
		fim=scan.nextInt();
		System.out.println("----------------------------------");
		for(int i = 0; inicio < fim; i++) {
			System.out.println(inicio);
			inicio++;
			
			System.out.println(inicio);
			
		}
		
		
		scan.close();
		
	}
}
