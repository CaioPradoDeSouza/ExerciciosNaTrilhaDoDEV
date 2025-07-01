package com.lista.exercicios.ex;

import java.util.Scanner;

public class TabuadaEx14 {
	
	public static void main(String[] args) {
		
		int numero = 0;
		int contador = 0;
		int resultado = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva o número que deseja a tabuada : ");
		numero = scan.nextInt();
		
		
		for(int i=0; contador < 10; i++) {
			contador = contador + 1;
			resultado = numero * contador;
			System.out.println(numero + " x " + contador + " = " + resultado);
			i++;
		}
		
		
		
		
		
		scan.close();
		
	}
}
