package co.edu.unbosque.controller;

import co.edu.unbosque.model.MemoriaCalculadora;
import co.edu.unbosque.view.Consola;

public class Controlador {

	private MemoriaCalculadora calculadora;
	private Consola consola;

	public void ejecutar() {
		calculadora = new MemoriaCalculadora();
		consola = new Consola();
		
		int opcion;
		do {
			opcion = consola.mostrarMenu();
			
			switch (opcion) {
			//Operaciones Aritmeticas Basicas
			case 1 ->{
			double primerNumero = consola.pedirPrimerNumero();
			double segundoNumero = consola.pedirSegundoNumero();
			
			double resultado = calculadora.suma(primerNumero, segundoNumero);
			consola.mostrarMensaje("Resultado Suma: " +  resultado);
			}
			case 2 ->{
			double primerNumero = consola.pedirPrimerNumero();
			double segundoNumero = consola.pedirSegundoNumero();
				
			double resultado = calculadora.resta(primerNumero, segundoNumero);
			consola.mostrarMensaje("Resultado Resta: " +  resultado);
			}
			case 3 ->{
			double primerNumero = consola.pedirPrimerNumero();
			double segundoNumero = consola.pedirSegundoNumero();
			
			double resultado = calculadora.multiplicacion(primerNumero, segundoNumero);
			consola.mostrarMensaje("Resultado Multiplicacion: " +  resultado);
			}
			case 4 ->{
			double primerNumero = consola.pedirPrimerNumero();
			double segundoNumero = consola.pedirSegundoNumero();
				
			double resultado = calculadora.division(primerNumero, segundoNumero);
			consola.mostrarMensaje("Resultado Division: " +  resultado);
			}

			//Area Circulo
			case 5 ->{
			double areaCirculo = consola.pedirRadio();
			
			double resultado = calculadora.areaCirculo(areaCirculo);
			consola.mostrarMensaje("Resultado Area Circulo: " + resultado);
			}
			//Area Triangulo
			case 6 ->{
			double baseTriangulo = consola.pedirBaseTriangulo();
			double alturaTriangulo = consola.pedirAlturaTriangulo();
			
			
			double resultado = calculadora.areaTriangulo(baseTriangulo, alturaTriangulo);
			consola.mostrarMensaje("Resultado Area Triangulo: " + resultado);
			}
			//Area Cuadrado
			case 7 ->{
			double ladoCuadrado = consola.pedirLadoCuadrado();
			double resultado = calculadora.areaCuadrado(ladoCuadrado);
			
			consola.mostrarMensaje("Resultado Area Cuadrado: " + resultado);
			}
			//Area Rectangulo
			case 8 ->{
			double baseRectangulo = consola.pedirBaseRectangulo();
			double alturaRectangulo = consola.pedirAlturaRectangulo();
			
			double resultado = calculadora.areaRectangulo(baseRectangulo, alturaRectangulo);
			consola.mostrarMensaje("Resultado Area Rectangulo: " + resultado);
			}
			case 9 ->{
				consola.mostrarMensaje("Saliendo De La Calculadora...");
			}
			default->{
				consola.mostrarMensaje("Ingrese una opcion valida: ");
			}
			//Cerrar Switch, Very Important
			}
		}while (opcion != 9);
		
		}
}
