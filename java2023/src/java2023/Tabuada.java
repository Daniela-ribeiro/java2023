package java2023;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int cont = 0;
		int numero;
		int mult = 1;
		
		System.out.println(" Digite um numero:");
		numero = leia.nextInt();
		System.out.println("TABUADA DO " + numero + " :");
		
		do {
			if(numero < 0 || numero >10) {
				System.out.println(" Digite um numero de 0 à 10:");
				numero = leia.nextInt();
			}else {
				mult = numero * cont;
				
				System.out.println(numero + " x " + cont + " = " + mult);
				
				cont ++;
	
			}
			
		}while(cont < 10);
		
	}
}
