package com.lista.exercicios.ex;

import java.util.Scanner;

public class TranformaPrimeiraLetraDeCadaPalavraEmMaiusculaEx39 {
	
	public static void main(String[] args) {
		
		String frase ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma frase que eu vou transformas as letras inicias de cada palavra em maiúsculo : ");
		frase = scan.nextLine();
		
		String[] palavras = frase.split(" ");
		StringBuilder stringModificada = new StringBuilder();
		
		for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                String palavraModificada  = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase();
                stringModificada.append(palavraModificada).append(" ");
            }
        }
		
		
		
		System.out.println("O resultado é : " + stringModificada.toString().trim());
		
		scan.close();
	}
	
}
