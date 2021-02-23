package junitTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import entornos_desarrollo_A01.Suma;
import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExcepcionParametroNoValido;

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
	void  testSuma2NumerosReales() throws ExcepcionErrorCero, ExcepcionNumeroNegativo {
		//variables
		double sumando1 = 4.3;
		double sumando2 = 12.3;
		double esperado = 16.6;
		double resultado = sum.suma2NumeroReales(sumando1, sumando2);
		
		//ejecutar
		resultado = rest.restaNumerosReales(minuendo, substraendo) ;
		
		//Assert
		assertEquals(esperado, resultado,"la resta de 15.6 menos 5.5 debe ser 10.1");		
	}
	@Test
	void restaNumerosEnteros() throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
		//variables
		int minuendo = 23;
		int substraendo = 11;
		int esperado = 12;
		double resultado = rest.restaNumerosEnteros(minuendo, substraendo);
		
		//ejecutar
		rest.restaNumerosEnteros(minuendo, substraendo);
		
		//Assert
		assertEquals(esperado, resultado,"la resta de 23 menos 11 debe ser 12");
	}
	@Test
	void resta3NumerosReales() throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
		//variables
	
		double minuendo = 17.3;
		double substraendo1 = 5.7;
		double substraendo2 = 2.8;
		double esperado = 8.8;
		double resultado = rest.resta3NumerosReales(minuendo, substraendo1, substraendo2);
		
		//ejecutar
		rest.resta3NumerosReales(minuendo, substraendo1, substraendo2);
		
		//Assert
		assertEquals(esperado, resultado,"la resta entre 17.3 menos 5.7 menos 2.8 debe ser 8.8");
	}
	@Test
	void restaValorAcumulado() throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
		//variables
		
		double substraendo = 3.7;
		
		//ejecutar
		
		//Assert
	}

}
