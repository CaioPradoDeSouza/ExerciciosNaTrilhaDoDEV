package com.lista.exercicios.ex;

import java.util.Scanner;

public class SimuladorCaixaEletronicoEx23 {
	
	public static void main(String[] args) {
		
		int valor = 0;
		int[] notas = {100, 50, 20, 10};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor desejado !");
		valor = scan.nextInt();
		
		if(valor % 10 != 0) {
			System.out.println("Valor inválido! Só são permitidos saques em múltiplos de 10.");
			
		}
		
		System.out.println("Você sacou " + valor + " lulacoins .");
		
		for (int nota : notas) {
            int quantidade = valor / nota;
            if (quantidade > 0) {
                System.out.println(quantidade + " nota(s) de R$ " + nota);
                valor -= quantidade * nota;
            }
        }
		
		
		
		
		scan.close();
		
	}
	
}
