package com.lista.exercicios.ex;

import java.util.Scanner;

public class CalculaTodos1AteNEx7 {
	
	public static void main(String[] args) {
		
		int num = 0;
		int n = 1;
		int total = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número : ");
		num = scan.nextInt();
		
		while(n <= num) {
			
			total = total + n;
			
			n = n + 1;
				
		}
		
		 System.out.println(total);
		
		scan.close();
	}
}
