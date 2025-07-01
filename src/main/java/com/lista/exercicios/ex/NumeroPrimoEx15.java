package com.lista.exercicios.ex;

import java.util.Scanner;

public class NumeroPrimoEx15 {
	
	public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	
	
	public static void main(String[] args) {
		
		int numero = 0 ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		numero = scan.nextInt();
		
		if(isPrimo(numero)) {
				System.out.println("O número é primo !");
		}else {
				System.out.println("O número não é primo ! ");
		};
		
		scan.close();
		
	}
	
}
