package com.lista.exercicios.ex;

import java.util.Scanner;

public class MostraPrimeiroNomeEx48 {

	public static void main (String[] args) {
		
		String nome;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("-------------------------");
		System.out.println("Digite o seu nome completo : ");
		nome = scan.nextLine();
		
		String[] palavras = nome.split(" ");
		
		if (palavras.length > 0) {
            String primeiraPalavra = palavras[0];
            System.out.println("O seu primeiro nome é : " + primeiraPalavra);
        }
		

		scan.close();
		
		
	}
}
