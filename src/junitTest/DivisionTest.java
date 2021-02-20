package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entornos_desarrollo_A01.Division;
import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExceptionExpAlto;

class DivisionTest {
	private Division div;

	@BeforeEach
	public void setUp() {
		div = new Division();
	}

	@AfterEach
	public void tearDown() {
	}

	@Test
	void divisionRealEntre12_2_y_6_3DebeSer1_94() throws ExcepcionErrorCero, ExcepcionNumeroNegativo {
		double dividiendo = 12.2;
		double divisor = 6.3;
		double esperado = 1.94;
		double obtenido = div.divisionNumReales(dividiendo, divisor);
		assertEquals(esperado, obtenido, "La division entre 12.2 y 6.3 debe ser 1.94");
	}

	@Test
	void laDivisionEntre12y6DebeSer2() throws ExcepcionErrorCero, ExcepcionNumeroNegativo {
		int dividiendo = 12;
		int divisor = 6;
		int esperado = 2;
		double obtenido = div.sumNumEnteros(dividiendo, divisor);
		assertEquals(esperado, obtenido, "La division entre 12 y 6 debe ser 2");
	}
	@Test
	void laRaizDe49DebeSer7() throws ExcepcionErrorCero, ExcepcionNumeroNegativo, ExceptionExpAlto {
		int numeroRaiz = 49;
		int esperado = 7;
		double obtenido = div.raizDeNumero(numeroRaiz);
		assertEquals(esperado, obtenido,"La raiz cuadrada de 49 debe ser 7");
	}

}
