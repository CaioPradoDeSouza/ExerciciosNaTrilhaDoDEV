package com.lista.exercicios.ex;

import java.util.Scanner;

public class SegundosParaMinutosEx18 {
  
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro : ");
		
		
		int numero = scan.nextInt();
		int horas =  numero / 3600;
		int minutos = (numero % 3600) / 60;
		int segundos = numero / 60;
		System.out.printf("%d segundos equivalem a: %02d:%02d:%02d%n", numero, horas, minutos, segundos);
		
		
		scan.close();
		
	}
}
