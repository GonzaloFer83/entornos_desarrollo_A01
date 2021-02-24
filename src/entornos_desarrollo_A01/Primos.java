package entornos_desarrollo_A01;

import entornos_desarrollo_A01.Multiplicacion;
import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroMuyBajo;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExceptionNumeroAlto;


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
		 * @throws ExceptionNumeroAlto
		 * @see errorNumerosNegativos()
	     * @see errorCero()
		 */
	 public boolean esPrimo(int x) throws ExcepcionNumeroNegativo, ExcepcionErrorCero, ExceptionNumeroAlto {
				
		 x = comprobarValores(x);
			
		boolean esPrimo=true;
			if(x==1 ) {
						esPrimo= false;
			}
			else {
				for(int i=2; i<x;i++) {
					if(x%i==0) {
						esPrimo= false;
						break;
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
		 * @throws ExceptionNumeroAlto
		 * @see errorNumerosNegativos()
	     * @see errorCero()
		 */
			
		
		public int iesimo(int x) throws ExcepcionNumeroNegativo, ExcepcionErrorCero, ExceptionNumeroAlto {
			x = comprobarValores(x);
			
			int contadorprimos=0;
			
			for(int i=1;i<=x;i++) {

				if(esPrimo(i)) {
					contadorprimos++;
				}
			}
			return contadorprimos;
		}
		/**
		 * 
		 * @param double x
		 * @param double y
		 * @return resultado. Devuelve el porcentaje de la variable 1 por la variable 2 entre 100.
		 * @link     -- llamar a la clase Multiplicacion --
		 * @throws ExcepcionNumeroNegativo 
		 * @throws ExcepcionErrorCero 
		 * @throws ExcepcionNumeroAlto
		 * @see errorNumerosNegativos()
	     * @see errorCero()
		 */
		
		public double porcentaje (double x,double y) throws ExcepcionNumeroNegativo, ExcepcionErrorCero, ExceptionNumeroAlto {
			x = comprobarValores(x);
			y = comprobarValores(y);
			
			double resultado = multiplicacion1.multiNumReales(x, y/100);
			return resultado;
		}
		/**
		 * 
		 * @param x
		 * @return acumulador devuelve un factorial de un numero entero.
		 * @throws ExcepcionNumeroNegativo 
		 * @throws ExcepcionErrorCero 
		 * @throws ExceptionNumeroAlto
		 * @see errorNumerosNegativos()
	     * @see errorCero() 
	     * @link     -- llamar a la clase Multiplicacion --
	     * Dentro de este método, comprobaremos que los parámetros introducidos no son negativos o iguales a 0
	     * llamando a estos métodos privados. 
		 */
		
		public int factorial (int x) throws ExcepcionNumeroNegativo, ExcepcionErrorCero, ExceptionNumeroAlto {
			 x = comprobarValores(x);

			 int acumulador= x;
				
				
			for(int i =1; i<x;i++) {	
				acumulador=acumulador*i;
			}
			return acumulador;
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
			}else if (valor >=Double.MIN_VALUE) {
				throw new ExcepcionNumeroMuyBajo();
				}
			return valor;
		}
		
		private int comprobarValores(int valor) throws ExceptionNumeroAlto, ExcepcionNumeroNegativo, ExcepcionErrorCero, ExcepcionNumeroMuyBajo {
			if (valor == 0) {
				throw new ExcepcionErrorCero();
			} else if (valor < 0 ) {
				throw new ExcepcionNumeroNegativo();
			}else if (valor >Integer.MAX_VALUE) {
				throw new ExceptionNumeroAlto();
			}else if (valor >=Integer.MIN_VALUE) {
				throw new ExcepcionNumeroMuyBajo();
				}
			return valor;
		}

		
}

