package com.lista.exercicios.ex;

import java.util.Scanner;

public class NumerosDivisiveisPor3Ex26 {
	
	public static void main(String[] args) {
	
	int numero = 0;
	int inicio = 1;
	int contador = 0;
	int res = 0;
	
	
	Scanner scan  = new Scanner(System.in);
	System.out.println("Digite um número que eu te mostro quantos números divisíveis por 3 há na sequencia : ");
	numero = scan.nextInt();
	
	for(int i = 0; inicio <= numero; i++) {
		contador += 1;
		inicio++;
		if(contador % 3 == 0 ) {
			System.out.println(contador +" é divisível ");
		}else {
			System.out.println(contador +" não é divisível ");
		}
		
		
	}
	
	//System.out.println("De 1 a " + numero + ", temos " + contador + " números divisíveis por 3 . ");
	scan.close();
	
	}
}
