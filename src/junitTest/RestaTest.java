package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entornos_desarrollo_A01.Resta;
import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroMuyBajo;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExcepcionParametroNoValido;
import exceptions.ExceptionNumeroAlto;

class RestaTest {
	private Resta rest;

	@BeforeEach
	public void setUp() {
		rest = new Resta();
	}
	@AfterEach
	public void tearDown() {
	}	
	@Test
	void testValorZero() {
	Assertions.assertThrows(ExcepcionErrorCero.class, () ->rest.restaNumerosEnteros(5, 9));
			
	}
	@Test
	void testValornegativo() {
	Assertions.assertThrows(ExcepcionNumeroNegativo.class, () ->rest.restaNumerosEnteros(5, 9));
	}

	@Test
	void  testrestaNumerosReales() throws ExcepcionParametroNoValido {
		//variables
		double minuendo = 15.6;
		double substraendo = 5.5;
		double esperado = 10.1;
		double resultado = rest.restaNumerosReales(minuendo, substraendo);
		
		//ejecutar
		resultado = rest.restaNumerosReales(minuendo, substraendo) ;
		
		//Assert
		assertEquals(esperado, resultado,"la resta de 15.6 menos 5.5 debe ser 10.1");		
	}
	@Test
	void restaNumerosEnteros() throws ExcepcionParametroNoValido {
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
	void resta3NumerosReales() throws ExcepcionParametroNoValido {
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
	void restaValorAcumulado() throws ExcepcionParametroNoValido {
		//variables
		
		
		double minuendo = 15.3;
		double substraendo1 = 5.3;
		double substraendo2 = 4.3;
		double esperado = 5.7;
		double resultado;
		//ejecutar
		rest.restaNumerosReales(minuendo, substraendo1);
		resultado = rest.restaValorAcumulado(substraendo2);
		
		
		//Assert
		assertEquals(esperado, resultado,"la resta entre 15.3 menos 4.3 debe ser 5.7");
		
	}
	
	
}
