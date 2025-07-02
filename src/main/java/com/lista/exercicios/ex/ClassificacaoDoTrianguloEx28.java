package com.lista.exercicios.ex;

import java.util.Scanner;

public class ClassificacaoDoTrianguloEx28 {
	
	public static void main(String[] args) {
		
double num1=0,num2=0,num3=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do primeiro lado :");
		num1=scan.nextDouble();
		System.out.println("Digite o tamanho do segundo lado :");
		num2=scan.nextDouble();
		System.out.println("Digite o tamanho do terceiro lado :");
		num3=scan.nextDouble();
		
		if (num1==num2  && num2==num3 && num1==num3) {
			System.out.println("Você digitou números que formam um triângulo equilátero, pois seus lados são todos iguais .");
		}else if(num1==num2  || num2==num3 || num1==num3) {
			System.out.println("Você digitou números que formam um triângulo isóceles, pois dois lados são iguais .");
		}else {
			System.out.println("Você digitou números que formam um triângulo escaleno, pois seus lados são todos diferentes.");
		}
		
		
		scan.close();
		
	}
}
