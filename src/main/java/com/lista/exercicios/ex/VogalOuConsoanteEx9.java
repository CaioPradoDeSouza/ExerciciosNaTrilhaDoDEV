package com.lista.exercicios.ex;

import java.util.Scanner;

public class VogalOuConsoanteEx9 {
	
	public static void main(String[] args) {
		
		String letra;
		String[] vogais = {"a", "e", "i","o","u"};
		Boolean estaNaLista = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra : ");
		letra=scan.nextLine();
		
		for(int i=0; i < vogais.length;i++) {
			if(letra.equals(vogais[i])) {
				estaNaLista = true;
			}
		}
		
		if(estaNaLista == true) {
			System.out.println("A letra " + letra + " é uma vogal !");
		}else {
			System.out.println("A letra " + letra + " é uma consoante !");
		}
		
		
		scan.close();
		
	}
}
