package entornos_desarrollo_A01;

import entornos_desarrollo_A01.Multiplicacion;
import exceptions.ExcepcionNumeroNegativo;


/**
 * esta clase sirve para realizar numeros primos
 * 
 *@author Sergio Blázquez Fernandez
 *@since 19/01/2021
 *@version 1.1
 */

public class Primos {
	/**
	 * creamos las variables esPrimo, c, m, t.
	 */
	boolean esPrimo;
	int c;
	double m;
	int t;
	Multiplicacion multiplicacion1 = new Multiplicacion();
		/**
		 * 
		 * @param boolean x
		 * @return esPrimo el cual te dice si el numero es primo o no. 
		 * @throws ExcepcionNumeroNegativo 
		 * @throws 
		 * @see errorNumerosNegativos()
	     * @see errorCero()
		 */
	 public boolean esPrimo(int x) throws ExcepcionNumeroNegativo {
				
				
		 if (x<0) {
				throw new ExcepcionNumeroNegativo();
			}
		 if (x=0) {
			
		
				
			if(x==1 || x%2==0) {
						return false;
			}
			else {
				for(int i=3; i<Math.sqrt(x);i++) {
					if(x%i==0) {
						return true;
				    }
				}
			}

			return true;
     }
			
				
		
		/**
		 * @param x 
		 * @return c devuelve la cantidad de numeros primos que hay.
		 * @see errorNumerosNegativos()
	     * @see errorCero()
		 */
			
		
		public int iesimo(int x) {
			return c;
		}
		/**
		 * 
		 * @param x
		 * @param y
		 * @return c devuelve el porcentaje de las dos variables x,y.
		 * @see errorNumerosNegativos()
	     * @see errorCero()
		 */
		
		public double porcentaje (double x,double y) {
			return m;
		}
		/**
		 * 
		 * @param x
		 * @return acumulador devuelve un factorial de un numero entero.
		 * @see errorNumerosNegativos()
	     * @see errorCero() 
	     * @link     -- llamar a la clase Multiplicacion --
	     * Dentro de este método, comprobaremos que los parámetros introducidos no son negativos o iguales a 0
	     * llamando a estos métodos privados. 
		 */
		
		public int factorial (int x) {

			 int acumulador= x;
				if (sumando1<0 || sumando2<0) {
					throw new ExcepcionNumeroNegativo();
				}
				a= sumando1+sumando2;
				acumulador= convertirEnteros(a);
				
			for(int i =1; i<x;x++) {	
				acumulador=(int) multiplicacion1.multiNumEnteros(acumulador, i);
			}
			return acumulador;
			}
		
		}

