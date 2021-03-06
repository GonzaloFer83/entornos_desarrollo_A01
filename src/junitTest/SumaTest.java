package junitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import entornos_desarrollo_A01.Suma;
import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroMuyBajo;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExcepcionParametroNoValido;
import exceptions.ExceptionNumeroAlto;

public class SumaTest {

	private Suma sum;

	@BeforeEach
	public void setUp() {
		sum = new Suma();
	}
	@AfterEach
	public void tearDown() {
		
	}
	
	@Test
	void testNumeroRealConNumeroNegativo() {
		// preparar
		double sumando1 = 6;
		double sumando2 = -4;

		// ejecutar

		// Assert
		Assertions.assertThrows(ExcepcionNumeroNegativo.class,
				() -> sum.suma2NumerosReales(sumando1, sumando2));
	}

	@Test
	void testNumeroConNumero0() {
		// preparar
		double sumando1 = 12;
		double sumando2 = 0;

		// ejecutar

		// Assert
		Assertions.assertThrows(ExcepcionErrorCero.class, () -> sum.suma2NumerosReales(sumando1, sumando2));
	}

	@Test
	void testNumeroAlto() {
		// preparar
		double sumando1 = Double.MAX_VALUE;
		double sumando2 = 5;

		// ejecutar

		// Assert
		Assertions.assertThrows(ExceptionNumeroAlto.class, () -> sum.suma2NumerosReales(sumando1, sumando2));
	}

	@Test
	void testNumeroMuyBajo() {
		// preparar
		double sumando1 = Double.MIN_VALUE;
		double sumando2 = 5;

		// ejecutar

		// Assert
		Assertions.assertThrows(ExcepcionNumeroMuyBajo.class, () -> sum.suma2NumerosReales(sumando1, sumando2));
	}
	
	
	@Test
	void  testSuma2NumerosReales() throws ExcepcionParametroNoValido {
		//variables
		double sumando1 = 4.3;
		double sumando2 = 12.3;
		double esperado = 16.6;
		double resultado;
		
		//ejecutar
		resultado = sum.suma2NumerosReales(sumando1, sumando2);
		
		//Assert
		assertEquals(esperado, resultado,"la suma de 4.3 mas 12.3 debe ser 16.6");		
	}
	
	
	@Test
	void testRestaNumerosEnteros() throws ExcepcionParametroNoValido {
		//variables
		int sumando1 = 4;
		int sumando2 = 9;
		int esperado = 13;
		double resultado ;
		
		//ejecutar
		resultado = sum.sumaNumerosEnteros(sumando1, sumando2);
		
		//Assert
		assertEquals(esperado, resultado,"la suma de 4 mas 9 debe ser 13");
	}
	
	
	@Test
	void TestSuma3NumerosReales() throws ExcepcionParametroNoValido {
		//variables
	
		double sumando1 = 5.5;
		double sumando2 = 7.2;
		double sumando3 = 2.4;
		double esperado = 15.1;
		double resultado ;
		
		//ejecutar
		resultado = sum.suma3NumeroReales(sumando1, sumando2, sumando3);
		
		//Assert
		assertEquals(esperado, resultado,"la suma de 5.5 mas 7.2 mas 2.4 debe ser 15.1");
	}
	
	
	@Test
	void TestSumaValorAcumulado() throws ExcepcionParametroNoValido {
		//variables
		
		double sumando1 = 4.1;
		double sumando2 = 2.2;
		
		double sumando3 = 5.5;
		double esperado = 11.8;
		double resultado;
		sum.suma2NumerosReales(sumando1, sumando2);
		

		//ejecutar
		resultado = sum.sumaAcumulada(sumando3);

		
		//Assert
		assertEquals (esperado, resultado, "La suma de 6.3 y 5.5 debe ser 11.8");
		
	}

}
