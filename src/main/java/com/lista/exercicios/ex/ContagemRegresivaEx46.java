package com.lista.exercicios.ex;

import java.util.Scanner;

public class ContagemRegresivaEx46 {
	
	public static void main(String[] args) {
		
		int numero = 0;
		int res = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número que eu faço a contagem para voçê :");
		numero = scan.nextInt();
            	
            	while(res < numero) {
            		 System.out.println(numero--);
            		try {
                        Thread.sleep(1000);
                       
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            	}
        
        scan.close();
	}
        
	
}
