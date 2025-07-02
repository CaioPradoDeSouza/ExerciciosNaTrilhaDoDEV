package com.lista.exercicios.ex;

import java.util.Random;
import java.util.Scanner;

public class SimuladorDeDadoEx42 {

	public static void main(String[] args) {
		
		 int opcao = 0;
		
		 Random random = new Random();
	        
	     int resultado = random.nextInt(6) + 1; 
	     
	     Scanner scan = new Scanner(System.in);
	     System.out.println("-------------------------");
	     System.out.println(" Digite - 1 para jogar o dado ");
	     opcao =  scan.nextInt();
	     
	     if(opcao == 1) {
	    	 System.out.println("você jogou o dado e o resultado é : " + resultado);
	     }
	     

	}
	
}
