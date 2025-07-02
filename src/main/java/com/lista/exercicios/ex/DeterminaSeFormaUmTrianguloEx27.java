package com.lista.exercicios.ex;

import java.util.Scanner;

public class DeterminaSeFormaUmTrianguloEx27 {
	
	public static void main (String[] args) {
		
		Boolean IsTriangulo=false;
		double num1=0,num2=0,num3=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do primeiro lado :");
		num1=scan.nextDouble();
		System.out.println("Digite o tamanho do segundo lado :");
		num2=scan.nextDouble();
		System.out.println("Digite o tamanho do terceiro lado :");
		num3=scan.nextDouble();
		
		if(num1+num2>num3  || num2+num3>num1 || num1+num3>num2) {
			System.out.println("As medidas podem formar um triângulo ! ");
		}else {
			System.out.println("as medidas nao podem formar um triângulo ! ");
		}
		
		scan.close();
		
	}
}
