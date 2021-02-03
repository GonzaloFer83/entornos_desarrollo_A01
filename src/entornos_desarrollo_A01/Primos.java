package entornos_desarrollo_A01;

import entornos_desarrollo_A01.Multiplicacion;
import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroNegativo;


/**
 * esta clase sirve para realizar numeros primos
 * 
 *@author Sergio Blázquez Fernández
 *@since 19/01/2021
 *@version 1.1
 */

public class Primos {
	/**
	 * creamos las variables esPrimo, c, m, t.
	 */
	boolean esPrimo;
	Multiplicacion multiplicacion1 = new Multiplicacion();
		/**
		 * 
		 * @param boolean x
		 * @return esPrimo el cual te dice si el numero es primo o no. 
		 * @throws ExcepcionNumeroNegativo 
		 * @throws ExcepcionErrorCero 
		 * @see errorNumerosNegativos()
	     * @see errorCero()
		 */
	 public boolean esPrimo(int x) throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
				
				
		 if (x<0) {
			throw new ExcepcionNumeroNegativo();
		 }
		 if (x==0) {
			 throw new ExcepcionErrorCero();
		 }
			
		boolean esPrimo=true;
				
			if(x==1 || x%2==0) {
						esPrimo= false;
			}
			else {
				for(int i=2; i<Math.sqrt(x);i++) {
					if(x%i==0) {
						esPrimo= false;
				    }
				}
			}

			return esPrimo;
     }
			
				
		
		/**
		 * @param x 
		 * @return resultado. Devuelve el numero primo que esta en la posicion que le has indicado.
		 * @throws ExcepcionNumeroNegativo 
		 * @throws ExcepcionErrorCero 
		 * @see errorNumerosNegativos()
	     * @see errorCero()
		 */
			
		
		public int iesimo(int x) throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
			if (x<0) {
				throw new ExcepcionNumeroNegativo();
			}
			if (x==0) {
				 throw new ExcepcionErrorCero();
			}
			
			int contadorprimos=0;
			int resultado=1;
			
			for(int i=1;i<100;i++) {
				if(esPrimo(i)) {
					contadorprimos++;
					if(contadorprimos==x) {
						resultado=i;
						break;						
					}
				}
			}
			return resultado;
		}
		/**
		 * 
		 * @param double x
		 * @param double y
		 * @return resultado. Devuelve el porcentaje de la variable 1 por la variable 2 entre 100.
		 * @link     -- llamar a la clase Multiplicacion --
		 * @throws ExcepcionNumeroNegativo 
		 * @throws ExcepcionErrorCero 
		 * @see errorNumerosNegativos()
	     * @see errorCero()
		 */
		
		public double porcentaje (double x,double y) throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
			if (x<0) {
				throw new ExcepcionNumeroNegativo();
			}
			if (x==0) {
				 throw new ExcepcionErrorCero();
			}
			double resultado = multiplicacion1.multiNumReales(x, y/100);
			return resultado;
		}
		/**
		 * 
		 * @param x
		 * @return acumulador devuelve un factorial de un numero entero.
		 * @throws ExcepcionNumeroNegativo 
		 * @throws ExcepcionErrorCero 
		 * @see errorNumerosNegativos()
	     * @see errorCero() 
	     * @link     -- llamar a la clase Multiplicacion --
	     * Dentro de este método, comprobaremos que los parámetros introducidos no son negativos o iguales a 0
	     * llamando a estos métodos privados. 
		 */
		
		public int factorial (int x) throws ExcepcionNumeroNegativo, ExcepcionErrorCero {
			 if (x<0) {
					throw new ExcepcionNumeroNegativo();
			 }
			 if (x==0) {
					 throw new ExcepcionErrorCero();
			 }

			 int acumulador= x;
				
				
			for(int i =1; i<x;i++) {	
				acumulador=(int) multiplicacion1.multiNumEnteros(acumulador, i);
			}
			return acumulador;
			}
		
		}

