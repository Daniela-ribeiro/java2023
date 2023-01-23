package java2023;

import java.util.Random;

public class Matriz {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int [][] numeros = new int[4][4];
		int numero, k;
		
		for(int i = 0; i < numeros.length ; i ++ ) {
			for(k = 0; k < numeros[i].length ; k ++)
				numeros [i][k] = aleatorio.nextInt(9); 
		}
		for (int linha[]: numeros) {
			for (int coluna: linha) {
				System.out.print(coluna + "  ");
				
			}
			System.out.println();
			
		}
	}
}