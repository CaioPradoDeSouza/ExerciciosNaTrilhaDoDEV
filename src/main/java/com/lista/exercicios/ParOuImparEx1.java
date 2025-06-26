package com.lista.exercicios;

import java.util.Scanner;

public class ParOuImparEx1 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número :");
		num = scan.nextInt();
		
		
		
		if(num % 2 == 0) {
			System.out.println("O número digitado foi :" + num + " este número é par.");
		}else {
			System.out.println("O número digitado foi :" + num + " este número é impar.");
		}
			
		
		scan.close();
		
	}
	
	
}
