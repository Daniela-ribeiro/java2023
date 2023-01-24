package MetodosJava;

public class CalculadoraBasica {
	
public static void somarNumeros( double numero1, double numero2 ) {
	double resultado = numero1 + numero2;
	System.out.println(" SOMA:");
	System.out.format(" %.0f + %.0f = %.1f", numero1, numero2, resultado);
}
public static void subtrairNumeros( double numero1, double numero2 ) {
	double resultado = numero1 - numero2;
	System.out.println("\n SUBTRAÇÃO:");
	System.out.format(" %.0f - %.0f = %.1f", numero1, numero2, resultado);
}
public static void multiplicarNumeros( double numero1, double numero2 ) {
	double resultado = numero1 * numero2;
	System.out.println("\n MULTIPLICAÇÃO:");
	System.out.format(" %.0f x %.0f = %.1f", numero1, numero2, resultado);
}
public static void dividirrNumeros( double numero1, double numero2 ) {
	double resultado = numero1 / numero2;
	System.out.println("\n DIVISÃO:");
	System.out.format(" %.0f / %.0f = %.2f", numero1, numero2, resultado);
}
}
