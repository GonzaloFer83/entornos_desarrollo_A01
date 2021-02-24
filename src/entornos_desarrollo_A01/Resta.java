package entornos_desarrollo_A01;

import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroMuyBajo;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExceptionNumeroAlto;

/**
 * 
 * Documentando la clase Resta con JavaDoc
 * 
 * Esta clase es para realizar diverso tipo de restas 
 * 
 * @author Frida Abella Fernandez
 * @version 1.0
 * @since 19/01/2021
 * 
 */
public class Resta {
	
	
	/** 
	 * En esta variable acumulamos el valor de las operaciones
	 */
	private double acumulador;
	
	
	
	/**
	 * El m�todo restaNumerosReales realiza la resta de dos n�meros reales 
	 * @param minuendo recibe un numero real
	 * @param substraendo recibe un numero real 
	 * @return devuelve la resta de los parametros minuendo y sustraendo
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * Dentro de este metodo, comprobaremos que los parametros introducidos no son negativos o igual a 0
	 * llamando a las siguientes clases:  
	 * @throws ExcepcionErrorCero 
	 * @throws ExcepcionNumeroNegativo 
	 * @throws ExcepcionNumeroMuyBajo 
	 */
	public double restaNumerosReales (double minuendo, double substraendo) throws ExceptionNumeroAlto, ExcepcionErrorCero, ExcepcionNumeroNegativo, ExcepcionNumeroMuyBajo {
		
		minuendo = comprobarValores(minuendo);
		substraendo = comprobarValores(substraendo);
		
		acumulador = minuendo - substraendo;	
		return acumulador;
	}
	
	
	
	/**
	 * El m�todo restaNumerosEnteros realiza la resta de dos n�meros enteros
	 * @param minuendo recibe un numero entero
	 * @param substraendo recibe un numero entero
	 * @return devuelve un numero real, resultado de la resta de los parametros minuendo y substraendo
	 * 
	 * @see convertirEnteros()
	 * Dentro de este metodo, se llama a este metodo para convertir los numeros enteros en reales
	 * 
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * Dentro de este metodo, comprobaremos que los parametros introducidos no son negativos o igual a 0
	 * llamando a las clases siguientes:
	 * @throws ExcepcionNumeroNegativo
	 * @throws ExcepcionErrorCero
	 * @throws ExcepcionNumeroMuyBajo 
	 *  
	 */
	public double restaNumerosEnteros (int minuendo, int substraendo) throws ExceptionNumeroAlto, ExcepcionNumeroNegativo, ExcepcionErrorCero, ExcepcionNumeroMuyBajo {
		int a;
		minuendo = comprobarValores(minuendo);
		substraendo = comprobarValores(substraendo);
				
		a =  minuendo - substraendo;
		acumulador = convertirEnteros(a);
		return acumulador;
	}
	
	
	
	/**
	 * El m�todo resta3NumerosReales realiza la operaci�n de restarle a un n�mero real el valor de otros dos n�meros reales
	 * @param minuendo recibe un numero real	
	 * @param substraendo1 recibe un numero real
	 * @param substraendo2 recibe un numero real
	 * @return devuelve la resta del primer parametro minuendo, substraendo1 y substraendo2
	 * @throws ExcepcionNumeroMuyBajo 
	 * 
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * Dentro de este metodo, comprobaremos que los parametros introducidos no son negativos o igual a 0
	 * llamando a estos metodos privados 
	 */
	public double resta3NumerosReales (double minuendo, double substraendo1, double substraendo2) throws ExceptionNumeroAlto, ExcepcionNumeroNegativo, ExcepcionErrorCero, ExcepcionNumeroMuyBajo {
		
		minuendo = comprobarValores(minuendo);
		substraendo1 = comprobarValores(substraendo1);
		substraendo2 = comprobarValores(substraendo2);

		
		acumulador = minuendo - substraendo1 - substraendo2;
		return acumulador;
		
	}
	
	
	
	/**
	 * Este m�todo acumula operaciones de resta sobre un valor
	 * @param substraendo recibe numero real 
	 * @return Devuelve el resultado de un valor al que se le van restando acumulativamente los valores introducidos
	 * @throws ExcepcionNumeroMuyBajo 
	 * 
	 * @see errorNumerosNegativos() 
	 * @see errorCero()
	 * Dentro de este metodo, comprobaremos que los parametros introducidos no son negativos ni iguales a cero
	 */
	public double restaValorAcumulado (double substraendo) throws ExceptionNumeroAlto, ExcepcionNumeroNegativo, ExcepcionErrorCero, ExcepcionNumeroMuyBajo {
		
		substraendo = comprobarValores(substraendo);
			
		acumulador = acumulador - substraendo;
		return acumulador;
		
	}
	
	
	
	/**
	 * Este metodo es privado dado que solo se usa dentro de esta clase
	 * @param i recibe cualquier numero entero 
	 * @return convierte el numero entero recibido en un double o numero real
	 */
	
	private double convertirEnteros (int i) {
		return (double) i;
	}
	
	
	private double comprobarValores(double valor) throws ExcepcionErrorCero, ExcepcionNumeroNegativo,ExceptionNumeroAlto, ExcepcionNumeroMuyBajo{
		if (valor == 0) {
			throw new ExcepcionErrorCero();
		} else if (valor < 0 ) {
			throw new ExcepcionNumeroNegativo();
		}else if (valor >=Double.MAX_VALUE) {
			throw new ExceptionNumeroAlto();
		}else if (Double.isNaN(valor)) {
			throw new ArithmeticException();
		}else if (valor <=Double.MIN_VALUE) {
			throw new ExcepcionNumeroMuyBajo();
			}
		return valor;
	}
	private int comprobarValores(int valor) throws ExceptionNumeroAlto, ExcepcionNumeroNegativo, ExcepcionErrorCero, ExcepcionNumeroMuyBajo {
		if (valor == 0) {
			throw new ExcepcionErrorCero();
		} else if (valor < 0 ) {
			throw new ExcepcionNumeroNegativo();
		}else if (valor >=Integer.MAX_VALUE) {
			throw new ExceptionNumeroAlto();
		}else if (valor <=Integer.MIN_VALUE) {
			throw new ExcepcionNumeroMuyBajo();
			}
		return valor;
	}

	
}
