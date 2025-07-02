package com.lista.exercicios.ex;

import java.util.Scanner;

public class SomaNumerosParesEx31 {
	
	public static void main(String[] args) {
		
		int numero = 0;
		int resultado =0;
		int contador = 1;
		int valor = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero que eo somo todos os números pares da sequência de 1 até o número que você digitou :");
		numero = scan.nextInt();
		
		for(int i = 0; contador < numero;i++) {
			contador++;
			if(contador % 2 == 0) {
				resultado = resultado + contador;
			}
			
			
		}
		System.out.println("A soma dos números pares de 1 até " + numero + " é " + resultado);
		
		scan.close();
		
	}
}
