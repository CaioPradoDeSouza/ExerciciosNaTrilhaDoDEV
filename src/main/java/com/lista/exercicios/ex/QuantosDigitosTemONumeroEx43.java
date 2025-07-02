package com.lista.exercicios.ex;

import java.util.Scanner;

public class QuantosDigitosTemONumeroEx43 {

	public static void main(String[] args) {
		
		int numero=0;
		int	resultado=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro que eu te mostro quantos algarismos tem nele : ");
		numero=scan.nextInt();
		
		String numeroModificado = String.valueOf(numero);
		
		for(int i =0; resultado < numeroModificado.length();i++) {
			resultado ++;
		}
		
		System.out.println("A quantidade de algarismo presentes no número "+ numero + " é " +resultado);
		
		
		scan.close();
		
		
	}
	
	
}
