package java2023;

import java.util.Scanner;

public class Fatorial{
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero;
		int fatorial = 1;
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		for (int i = 1; i <= numero; i++){
			fatorial = fatorial * i;
			
		}
		System.out.println("O fatorial de " + numero + " é: " + fatorial);
	}
}