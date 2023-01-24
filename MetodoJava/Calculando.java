package MetodosJava;

import java.util.Scanner;

public class Calculando {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double numero1, numero2;
		
	

		// calculadora
	
		System.out.println(" Primeiro numero: ");
		numero1 = leia.nextDouble();
		System.out.println(" Digite qual tipo de operação deseja realizar: ");
		System.out.println(" 1-Somar \n 2-Subtrair \n 3-Multiplicar \n 4-Dividir");
		int operacao = leia.nextInt();
		System.out.println(" Segundo numero: ");
		numero2 = leia.nextDouble();
		
		if(operacao == 1) {
		CalculadoraBasica.somarNumeros(numero1, numero2);}
		
		else if (operacao == 2) {
		CalculadoraBasica.subtrairNumeros(numero1, numero2);}
		
		else if (operacao == 3) {
		CalculadoraBasica.multiplicarNumeros(numero1, numero2);}
		
		else if (operacao == 4) {
		CalculadoraBasica.dividirrNumeros(numero1, numero2);}
	}

}
