package co.edu.unbosque.interfaces;

public interface OperacionesInterface {
	// Aritmetica simple
	double suma(double numero1, double numero2);

	double resta(double numero1, double numero2);

	double multiplicacion(double numero1, double numero2);

	double division(double numero1, double numero2);

	// Circulo
	double areaCirculo(double radioCirculo);

	// Triangulo
	double areaTriangulo(double baseTriangulo, double alturaTriangulo);

	// Cuadrado
	double areaCuadrado(double ladoCuadrado);

	// Rectangulo
	double areaRectangulo(double baseRectangulo, double alturaRectangulo);

}
