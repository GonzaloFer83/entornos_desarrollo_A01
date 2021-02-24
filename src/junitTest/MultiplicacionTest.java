package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entornos_desarrollo_A01.Division;
import entornos_desarrollo_A01.Multiplicacion;
import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroMuyBajo;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExceptionNumeroAlto;

class MultiplicacionTest {

	private Multiplicacion multi;

	@BeforeEach
	public void setUp() {
		multi = new Multiplicacion();
	}

	@AfterEach
	public void tearDown() {
	}

	@Test
	void testMultiNumRealesDoubleDouble() throws ExcepcionErrorCero, ExcepcionNumeroNegativo, ExceptionNumeroAlto, ExcepcionNumeroMuyBajo {
		// preparar
		double multiplicando = 2.1;
		double multiplicador = 2.3;
		double esperado = 4.83;
		double resultado;
		// ejecutar
		resultado = multi.multiNumReales(multiplicando, multiplicador);
		// Assert
		assertEquals(esperado, resultado, "La multiplicacion entre 2.1 y 2.2 tiene que ser 4.62");
	}

	@Test
	void testNumeroRealConNumeroNegativo() {
		// preparar
		double multiplicando = 4;
		double multiplicador = -2;

		// ejecutar

		// Assert
		Assertions.assertThrows(ExcepcionNumeroNegativo.class,
				() -> multi.multiNumReales(multiplicando, multiplicador));
	}

	@Test
	void testNumeroConNumero0() {
		// preparar
		double multiplicando = 4;
		double multiplicador = 0;

		// ejecutar

		// Assert
		Assertions.assertThrows(ExcepcionErrorCero.class, () -> multi.multiNumReales(multiplicando, multiplicador));
	}

	@Test
	void testNumeroAlto() {
		// preparar
		double multiplicando = Double.MAX_VALUE;
		double multiplicador = 5;

		// ejecutar

		// Assert
		Assertions.assertThrows(ExceptionNumeroAlto.class, () -> multi.multiNumReales(multiplicando, multiplicador));
	}

	@Test
	void testMultiNumEnteros() throws ExcepcionErrorCero, ExcepcionNumeroNegativo, ExceptionNumeroAlto, ExcepcionNumeroMuyBajo {
		// preparar
		int multiplicando = 2;
		int multiplicador = 5;
		int esperado = 10;
		double resultado;
		// ejecutar
		resultado = multi.multiNumEnteros(multiplicando, multiplicador);
		// Assert
		assertEquals(esperado, resultado, "La multiplicacion entre 2 y 5 tiene que ser 10");
	}

	@Test
	void testMultiNumRealesDoubleDoubleDouble()
			throws ExcepcionErrorCero, ExcepcionNumeroNegativo, ExceptionNumeroAlto, ExcepcionNumeroMuyBajo {
		// preparar
		double multiplicando = 2;
		double multiplicador1 = 5;
		double multiplicador2 = 3;
		double esperado = 30;
		double resultado;
		// ejecutar
		resultado = multi.multiNumReales(multiplicando, multiplicador1, multiplicador2);
		// Assert
		assertEquals(esperado, resultado, "La multiplicacion entre 2 ,5  y 3 tiene que ser 30");
	}

	@Test
	void testPotencia() throws ExceptionNumeroAlto, ExcepcionNumeroNegativo, ExcepcionErrorCero, ExcepcionNumeroMuyBajo {
		// preparar
		int base = 5;
		double expontente = 2;
		double esperado = 25;
		double resultado;
		// ejecutar
		resultado = multi.potencia(base, expontente);
		// Assert
		assertEquals(esperado, resultado, "La potencia de 5 elevado a 2 es 25");
	}

}
