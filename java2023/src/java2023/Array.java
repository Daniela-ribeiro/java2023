package java2023;

import java.util.Random;

public class Array{
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int [] numeros = new int[100];
		
		for (int i = 0; i < numeros.length; i++) {
			int numero = aleatorio.nextInt(100);
			numeros [i] = numero;
			System.out.println();
		}
		for(int numero : numeros){			
			System.out.format("\n %d é um numéro aleatório e o %d é o seu sucessor.  ", numero, numero++);
		}
	}
}