package com.lista.exercicios.ex;

import java.util.Scanner;

public class MaiorNumeroEx3 {
		public static void main(String[] args) {
			
			int num1=0,num2=0;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Escreva o primeiro numero :");
			num1= scan.nextInt();
			
			System.out.println("Escreva o segundo numero :");
			num2= scan.nextInt();
			
			if(num1 == num2) {
				System.out.println("Os números digitados são iguais !");
			}else if(num1 > num2) {
				System.out.println("O número " + num1 + " é maior o numero " + num2 );
			}else {
				System.out.println("O número " + num2 + " é maior o numero " + num1 );
			}
			
			
			
			
			
			scan.close();
		}
}
