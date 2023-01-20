package java2023;

import java.util.Scanner;

public class ExerNotaMaior{
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int nota;
	int cont = 1;
	int maior = 1;
	int soma = 0;
	
	do {
		System.out.println("Numero " + cont + ":");
		nota = leia.nextInt();
		cont ++;
		soma = soma+ nota;
		
		if(nota > maior) {
			maior = nota;
		}
		
	}while(cont < 6);
	
	System.out.println("Maior numero é :" + maior);

	
	System.out.println("A media é :" + (soma)/5);
	}
}