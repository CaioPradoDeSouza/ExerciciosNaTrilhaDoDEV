package com.lista.exercicios.ex;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class EsteAnoEBissextoEx10 {

	public static void main(String[] args) {
		
		int ano = 0;
		GregorianCalendar calendario = new GregorianCalendar();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o ano que deseja saber se é bissexto :");
		ano = scan.nextInt();
		
		if(calendario.isLeapYear(ano)) {
			System.out.println("O ano é bissexto ! ");
		}else {
			System.out.println("O ano não é bissexto ! ");
		}
		
			
			
		scan.close();	
	}
}
