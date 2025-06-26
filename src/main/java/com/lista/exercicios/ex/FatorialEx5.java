package com.lista.exercicios.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FatorialEx5 {
	
	public static void main(String[] args) {
		
		int num = 0;
		int fat = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero : ");
		num = scan.nextInt();
		
		
		for(int i =1; i <= num; i++) {
			fat = fat * i;
			
		}
		System.out.println("O fatorial " + num +" é : " + fat );
		
		scan.close();
		
	}
}
