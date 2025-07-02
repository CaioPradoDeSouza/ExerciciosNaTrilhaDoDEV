package com.lista.exercicios.ex;

import java.util.Scanner;

public class VerificaSeONumeroEstaNoIntervaloEx40 {
	
	public static void main(String[] args) {
		
		int numero=0,limiteInferior=100,limiteSuperior=1500;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número para saber se ele está dentro da faixa aceitável : ");
		numero = scan.nextInt();
		
		if(numero < limiteInferior) {
			System.out.println(" Número negado menor que permitido na faixa !");
		}else if(numero > limiteSuperior) {
			System.out.println(" Número negado maior que permitido na faixa !");
		}else {
			System.out.println(" Número permitido dentro da faixa !");
		}
		
		
		
		scan.close();
		
	}
	
	
}
