package com.lista.exercicios.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoDeNumeroEx16 {
	

	public static void main(String[] args) {
		
		int res = 0;
		List<Integer> caracteres = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número :");
		int numero = scan.nextInt();
		String numeroString = String.valueOf(numero);
		int[] algarismos = new int[numeroString.length()];
		
		 for (int i = 0; i < numeroString.length(); i++) {
	            algarismos[i] = Character.getNumericValue(numeroString.charAt(i));
	            res = res + algarismos[i];
	        }
		 
		 System.out.println(res);
		 
		 scan.close();
		
	
	}		
}
