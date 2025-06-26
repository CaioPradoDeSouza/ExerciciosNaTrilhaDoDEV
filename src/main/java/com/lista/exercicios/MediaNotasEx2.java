package com.lista.exercicios;

import java.util.Scanner;

public class MediaNotasEx2 {
	
	public static void main(String[] args) {
		
		double nota1=0 ,nota2=0 ,nota3=0;
		double media = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota :");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota :");
		nota2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota :");
		nota3 = scan.nextDouble();
		
		media = (nota1 + nota2 + nota3)/3;
		
		if(media < 7.0) {
			System.out.println("A média final é " + media + " é menor que a nota mínima exigida o aluno está REPROVADO");
		}else {
			System.out.println("A média final é " + media + " é maior que a nota mínima exigida o aluno está APROVADO");
		}
		
		
		scan.close();
	}
}
