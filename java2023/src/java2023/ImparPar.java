package java2023;

import java.util.Scanner;

public  class ImparPar{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		int par;
		int impar;
		int somaPar = 0;
		int somaImpar = 0;
		int contImpar = 0;
		int contPar = 0;
		int contador = 0;
		int quantNumero;
		
		System.out.println("Com quantos números deseja trabalhar?");
		quantNumero = leia.nextInt();
		
		do {
			System.out.println("Numero:");
			numero = leia.nextInt();
			contador ++;
			if (numero % 2 == 0) {
				par = numero;
				somaPar = somaPar + numero;
				contPar ++;
			}else {
				impar = numero;
				somaImpar = somaImpar + numero;
				contImpar ++;
			}
			
		}while(contador < quantNumero);
		
		System.out.println("A quantidade dos números impares é : " + contImpar + " e a Soma dos numeros impares : " + somaImpar);
		System.out.println("A quantidade dos números pares é : " + contPar + " e a Soma dos numeros pares : " + somaPar);
		
	}
}