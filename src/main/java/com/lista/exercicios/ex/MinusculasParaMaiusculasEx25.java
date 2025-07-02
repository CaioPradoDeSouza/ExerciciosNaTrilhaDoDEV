package com.lista.exercicios.ex;

import java.util.Scanner;

public class MinusculasParaMaiusculasEx25 {
	
	public static void main(String[] args) {
		
		String frase;
		String resultado = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma frase que eu converso para maiúsculo para você : ");
		frase = scan.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }

            resultado += c;
        }

        System.out.println("Resultado: " + resultado);
		
		
		
		scan.close();
		
		
	}
	
}
