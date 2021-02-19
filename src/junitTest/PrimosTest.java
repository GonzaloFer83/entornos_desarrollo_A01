package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entornos_desarrollo_A01.Primos;
import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExcepcionParametroNoValido;

class PrimosTest {
	private Primos prim;

	@BeforeEach
	public void setUp() {
		prim = new Primos();
	}
	@AfterEach
	public void tearDown() {
		
	}

	@Test
	void testEsPrimo() throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
		int primo = 7;
		boolean esperado = true;
		boolean resultado = prim.esPrimo(primo);
		assertEquals(esperado, resultado, "7 es un numero Primo");
		
	}
	@Test
	void testValorZero() {
		int primo = 0;
		Assertions.assertThrows(ExcepcionErrorCero.class, () ->prim.iesimo(primo));
		
	}
	@Test
	void testValornegativo() {
		int primo = -8;
		Assertions.assertThrows(ExcepcionNumeroNegativo.class, () ->prim.iesimo(primo));

		
	}
	@Test
	void testIesimo() throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
		int primo = 7;
		int esperado = 4;
		int resultado = prim.iesimo(primo);
		assertEquals(esperado, resultado, "7 tiene 4 numeros primos delante");
	}

	@Test
	void testPorcentaje() throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
		double valor1 = 100;
		double valor2 = 20;
		double esperado = 20;
		double resultado = prim.porcentaje(valor1, valor2);
		assertEquals(esperado, resultado, "El 20 por ciento de 100 es 20");
		
	}

	@Test
	void testFactorial() throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
		int factorial = 5;
		int esperado = 120;
		int resultado = prim.factorial(factorial);
		assertEquals(esperado, resultado,"5! es 120");
	}
}
