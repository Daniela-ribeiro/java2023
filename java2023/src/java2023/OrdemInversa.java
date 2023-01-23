package java2023;

import java.util.Scanner;

public class OrdemInversa{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int [] vetor = {6, 93, 10, 20, 45, 34};
		for(int i = (vetor.length -1) ; i >= 0 ; i--) {
			System.out.println(vetor[i]);
		}

	}
}