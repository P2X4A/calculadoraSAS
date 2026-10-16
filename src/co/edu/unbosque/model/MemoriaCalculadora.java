package co.edu.unbosque.model;

import co.edu.unbosque.interfaces.OperacionesInterface;

public class MemoriaCalculadora implements OperacionesInterface{

	@Override
	public double suma(double numero1, double numero2) {
		return numero1 + numero2;
	}

	@Override
	public double resta(double numero1, double numero2) {
		return numero1 - numero2;
	}

	@Override
	public double multiplicacion(double numero1, double numero2) {
		return numero1 * numero2;
	}

	@Override
	public double division(double numero1, double numero2) {
		if(numero1 <= 0 || numero2 <= 0) {
			return 0;
		}else {
			return numero1 / numero2;
		}
	}

	@Override
	public double areaCirculo(double radioCirculo) {
		if (radioCirculo <= 0) {
			return 0;
		}else {
			return Math.PI * (radioCirculo * radioCirculo);						
		}
	}

	@Override
	public double areaTriangulo(double baseTriangulo, double alturaTriangulo) {
		if (baseTriangulo <= 0 || alturaTriangulo <= 0 ) {
			return 0;
		}else {
			return (baseTriangulo * alturaTriangulo) / 2;
			
		}
	}

	@Override
	public double areaCuadrado(double ladoCuadrado) {
		if (ladoCuadrado <= 0) {
			return 0;
		}
		return ladoCuadrado * ladoCuadrado;
	}

	@Override
	public double areaRectangulo(double baseRectangulo, double alturaRectangulo) {
		if (baseRectangulo <= 0 || alturaRectangulo <= 0) {
			return 0;
		}else {
			return baseRectangulo * alturaRectangulo;			
		}
	}

}
