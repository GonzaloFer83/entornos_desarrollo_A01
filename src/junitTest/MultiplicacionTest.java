package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import entornos_desarrollo_A01.Multiplicacion;
import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExceptionExpAlto;

class MultiplicacionTest {

	Multiplicacion multi = new Multiplicacion();

	@Test
	void testMultiNumRealesDoubleDouble() throws ExcepcionErrorCero, ExcepcionNumeroNegativo {
		//preparar
	double multiplicando = 2.1;
	double multiplicador = 2.3;
	double esperado = 4.83;
	double resultado;
		//ejecutar
	resultado = multi.multiNumReales(multiplicando, multiplicador);
	 //Assert
	assertEquals(esperado, resultado, "La multiplicacion entre 2.1 y 2.2 tiene que ser 4.62");
	}

	@Test
	void testMultiNumEnteros() throws ExcepcionErrorCero, ExcepcionNumeroNegativo {
		//preparar
		int multiplicando = 2;
		int multiplicador = 5;
		int esperado = 10;
		double resultado;
			//ejecutar
		resultado = multi.multiNumEnteros(multiplicando, multiplicador);
		 //Assert
		assertEquals(esperado, resultado, "La multiplicacion entre 2 y 5 tiene que ser 10");
		}

	@Test
	void testMultiNumRealesDoubleDoubleDouble() throws ExcepcionErrorCero, ExcepcionNumeroNegativo {
		//preparar
		double multiplicando = 2;
		double multiplicador1 = 5;
		double multiplicador2 = 3;
		double esperado = 30;
		double resultado;
			//ejecutar
		resultado = multi.multiNumReales(multiplicando, multiplicador1, multiplicador2);
		 //Assert
		assertEquals(esperado, resultado, "La multiplicacion entre 2 ,5  y 3 tiene que ser 30");
	}

	@Test
	void testPotencia() throws ExceptionExpAlto {
		//preparar
		int base = 5;
		double expontente = 2;
		double esperado = 25;
		double resultado;
		//ejecutar
		resultado= multi.potencia(base, expontente);
		//Assert
		assertEquals(esperado, resultado, "La potencia de 5 elevado a 2 es 25");
	}

}
