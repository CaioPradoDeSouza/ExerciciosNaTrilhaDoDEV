package com.lista.exercicios.ex;

import java.util.Scanner;

public class CalculaQuadradoEx34 {
	
	public static void main(String[] args) {
		
		int numero = 0 ;
		int resultado = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número que eu multiplico ao quadrado para você :");
		numero=scan.nextInt();
		
		resultado = numero * numero;
		System.out.println("O cálculo de " + numero +" ao quadrado é " + resultado + " !" );
		
		scan.close();
		
	}
}
