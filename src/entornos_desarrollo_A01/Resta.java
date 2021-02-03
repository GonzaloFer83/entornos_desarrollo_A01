package entornos_desarrollo_A01;

import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroNegativo;

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
	 * El método restaNumerosReales realiza la resta de dos números reales 
	 * @param minuendo recibe un numero real
	 * @param substraendo recibe un numero real 
	 * @return devuelve la resta de los parametros minuendo y sustraendo
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * Dentro de este metodo, comprobaremos que los parametros introducidos no son negativos o igual a 0
	 * llamando a las siguientes clases:  
	 * @throws ExcepcionErrorCero 
	 * @throws ExcepcionNumeroNegativo 
	 */
	public double restaNumerosReales (double minuendo, double substraendo) throws ExcepcionErrorCero, ExcepcionNumeroNegativo {
			if (minuendo == 0 || substraendo == 0) {
				throw new ExcepcionErrorCero();
			} else if (minuendo < 0 || substraendo < 0) {
				throw new ExcepcionNumeroNegativo();
			}
		acumulador = minuendo - substraendo;	
		return acumulador;
	}
	
	
	
	/**
	 * El método restaNumerosEnteros realiza la resta de dos números enteros
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
	 *  
	 */
	public double restaNumerosEnteros (int minuendo, int substraendo) throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
		int a;
		if (minuendo == 0||substraendo == 0) {
			throw new ExcepcionErrorCero();
		}
		if (minuendo < 0 || substraendo  <0) {
			throw new ExcepcionNumeroNegativo();
		}
		
		a =  minuendo - substraendo;
		acumulador = convertirEnteros(a);
		return acumulador;
	}
	
	
	
	/**
	 * El método resta3NumerosReales realiza la operación de restarle a un número real el valor de otros dos números reales
	 * @param minuendo recibe un numero real	
	 * @param substraendo1 recibe un numero real
	 * @param substraendo2 recibe un numero real
	 * @return devuelve la resta del primer parametro minuendo, substraendo1 y substraendo2
	 * 
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * Dentro de este metodo, comprobaremos que los parametros introducidos no son negativos o igual a 0
	 * llamando a estos metodos privados 
	 */
	public double resta3NumerosReales (double minuendo, double substraendo1, double substraendo2) throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
		if (minuendo == 0|| substraendo1 == 0 || substraendo2 == 0) {
			throw new ExcepcionErrorCero();		}
		if (minuendo<0 || substraendo1<0|| substraendo2<0 ) {
			throw new ExcepcionNumeroNegativo();
		}
		
		acumulador = minuendo - substraendo1 - substraendo2;
		return acumulador;
		
	}
	
	
	
	/**
	 * 
	 * @param substraendo recibe numero real 
	 * @return devolver el resultado de la resta de un valor un valor acumulado  y el parametro substraendo
	 * 
	 * @see errorNumerosNegativos()
	 * @see errorCero()  
	 * Dentro de este metodo, comprobaremos que los parametros introducidos no son negativos o igual a 0
	 * llamando a estos metodos privados 
	 */
	public double restaValorAcumulado (double substraendo) {
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
	
	

	
}
