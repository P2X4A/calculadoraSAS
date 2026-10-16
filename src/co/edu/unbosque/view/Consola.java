package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {
	private Scanner consola;

	public Consola() {
		consola = new Scanner(System.in);
	}
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	public int mostrarMenu() {
		System.out.println("""
				Bienvenido A La Calculadora, Ingrese una opcion a realizar
				1. Suma
				2. Resta
				3. Multiplicacion
				4. Division
				5. Calcular Area De Un Circulo
				6. Calcular Area De Un Triangulo
				7. Calcular Area De Un Cuadrado
				8. Calcular Area De Un Rectangulo
				9. Salir Del Programa
				""");
		return consola.nextInt();
	}

	// Operaciones Aritmeticas Simples
	public double pedirPrimerNumero() {
		System.out.println("Ingrese el primer numero con punto Ej(2.0): ");
		return consola.nextDouble();
	}

	public double pedirSegundoNumero() {
		System.out.println("Ingrese el segundo numero con punto Ej(2.0): ");
		return consola.nextDouble();
	}

	// El radio del circulo
	public double pedirRadio() {
		System.out.println("Ingrese El Radio Del Cuadrado,Ej: (2.0)");
		return consola.nextDouble();
	}

	// Para el triangulo es (base * altura) / 2
	public double pedirBaseTriangulo() {
		System.out.println("Ingrese La Base Del Triangulo,Ej: (2.0) ");
		return consola.nextDouble();
	}

	public double pedirAlturaTriangulo() {
		System.out.println("Ingrese La Altura Del Triangulo,Ej: (2.0) ");
		return consola.nextDouble();
	}

	// Para obtener del cuadrado
	public double pedirLadoCuadrado() {
		System.out.println("Ingrese Un Lado Del Cuadrado,Ej: (2.0) ");
		return consola.nextDouble();
	}

	// Para obtener rectangulo
	public double pedirBaseRectangulo() {
		System.out.println("Ingrese La Base Del Rectangulo, Ej: (2.0)");
		return consola.nextDouble();
	}

	public double pedirAlturaRectangulo() {
		System.out.println("Ingrese La Altura Del Rectangulo, Ej: (2.0)");
		return consola.nextDouble();
	}
}
