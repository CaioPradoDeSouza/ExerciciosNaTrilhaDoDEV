package com.lista.exercicios.ex;

import java.util.Scanner;

public class NumerosParesEx8 {

		public static void main(String[] args) {
			
			int num = 0;
			int ini = 1;
			int cont = 0;
			int total = 0;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite um número : ");
			num=scan.nextInt();
			
			while(ini <= num) {
				ini = ini +1;
				if(ini % 2 == 0) {
					total = total +1;
				}
			}
			
			System.out.println("A quantidade de números pares entre 1 e " + num + " é " + total);
			scan.close();
			
		}
}
