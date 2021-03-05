package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entornos_desarrollo_A01.Division;
import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroMuyBajo;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExcepcionParametroNoValido;
import exceptions.ExceptionNumeroAlto;

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
	void divisionRealEntre12_2_y_6_3DebeSer1_94()
			throws ExcepcionParametroNoValido {
		double dividiendo = 12.2;
		double divisor = 6.3;
		double esperado = 1.94;
		double obtenido = div.divisionNumReales(dividiendo, divisor);
		assertEquals(esperado, obtenido, "La division entre 12.2 y 6.3 debe ser 1.94");
	}

	@Test
	void laDivisionEnteraEntre12y6DebeSer2()
			throws ExcepcionParametroNoValido {
		int dividiendo = 12;
		int divisor = 6;
		int esperado = 2;
		double obtenido = div.divisionNumEnteros(dividiendo, divisor);
		assertEquals(esperado, obtenido, "La division entre 12 y 6 debe ser 2");
	}

	@Test
	void elValorInversoDe12Es0_08()
			throws ExcepcionParametroNoValido {
		int numeroInverso = 12;
		double esperado = 0.08;
		double obtenido = div.inversoValor(numeroInverso);
		assertEquals(esperado, obtenido, "El inverso de 12 ha de ser 0.08");
	}

	@Test
	void laRaizDe49DebeSer7()
			throws ExcepcionParametroNoValido {
		int numeroRaiz = 49;
		int esperado = 7;
		double obtenido = div.raizDeNumero(numeroRaiz);
		assertEquals(esperado, obtenido, "La raiz cuadrada de 49 debe ser 7");
	}

	@Test
	void testQuePasaSiDivisorEsCero() {
		int dividendo = 12;
		int divisor = 0;
		Assertions.assertThrows(ExcepcionErrorCero.class, () -> div.divisionNumEnteros(dividendo, divisor));
	}

	@Test
	void testQuePasaSiUnoDeLosParametrosEsNegativo() {
		int dividendo = 12;
		int divisor = -5;
		Assertions.assertThrows(ExcepcionNumeroNegativo.class, () -> div.divisionNumEnteros(dividendo, divisor));
	}
	@Test
	void divisorMasAltoQueElTipoDatoPrimitivoPermitido()
			throws ExcepcionParametroNoValido {
		int dividiendo = 12;
		Assertions.assertThrows(ExceptionNumeroAlto.class,
				() -> div.divisionNumReales(dividiendo, Double.POSITIVE_INFINITY));
	}
	@Test
	void divisorMasBajoQueElTipoDeDatoPrimitivo()
			throws ExcepcionParametroNoValido {
		int dividiendo = 12;
		Assertions.assertThrows(ExcepcionNumeroMuyBajo.class,
				() -> div.divisionNumReales(dividiendo, Double.MIN_VALUE));
	}

}
