package com.lista.exercicios.ex;

import java.util.Scanner;

public class CalculoMediaPonderadaEx36 {
	
	public static void main(String[] args) {
		
		int nota1=0,nota2=0,nota3=0;
		int peso1=0,peso2=0,peso3=0;
		int resultado = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculador de notas ponderadas !");
		System.out.println("--------------------------------");
		System.out.println("Digite a primeira nota : ");
		nota1=scan.nextInt();
		System.out.println("Digite o peso da primeira nota :");
		peso1=scan.nextInt();
		System.out.println("--------------------------------");
		System.out.println("Digite a segunda nota : ");
		nota2=scan.nextInt();
		System.out.println("Digite o peso da segunda nota :");
		peso2=scan.nextInt();
		System.out.println("--------------------------------");
		System.out.println("Digite a terceira nota : ");
		nota3=scan.nextInt();
		System.out.println("Digite o peso da terceira nota :");
		peso3=scan.nextInt();
		
		resultado = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
		
		System.out.println("A nota poderada considerando as notas e os pesos atribuidos é : " + resultado);
		scan.close();
		
	}
	
}
