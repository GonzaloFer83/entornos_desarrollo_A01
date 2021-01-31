package entornos_desarrollo_A01;

import exceptions.ExcepcionNumeroNegativo;

/**
 * Esta clase es para realizar sumas.
 * 
 * @since 19/01/2021
 * @author Alvaro Moreno Chihcarro
 * @version 1.1
 */
public class Suma {
	/**
	 * @param acumulador es el valor que se acumula en todas las operaciones.
	 */
	private double acumulador;
	
	public Suma() {
		
	}


	/**
	 * 
	 * @param sumando1 recibe un numero real
	 * @param sumando2 recibe un numero real
	 * @see ExcepcionNumerosNegativos()
	 * @see errorCero()
	 * @return Devuelve una suma de dos numeros reales que guarda el valor
	 *         acumulado.
	 */
	double suma2NumeroReales(double sumando1, double sumando2)throws ExcepcionNumeroNegativo {
		if (sumando1==0||sumando2==0) {
			errorCero();
		}
		if (sumando1<0 || sumando2<0) {
			throw new ExcepcionNumeroNegativo();
		}
		acumulador = sumando1 + sumando2;
			return acumulador;	
		
	}

	/**
	 * Realiza la suma de dos numeros enteros,y lo transforma a double llamando a un
	 * metodo privado.
	 * 
	 * @see convertirEnteros()
	 * @see ExcepcionNumerosNegativos()
	 * @see errorCero()
	 * @param sumando1 recibe un numero entero
	 * @param sumando2 recibe un numero entero
	 * @return devuelve el valor de la suma en un numero real.
	 */
	public  double sumaNumerosEnteros(int sumando1, int sumando2)
			throws ExcepcionNumeroNegativo{
		int a;
		if (sumando1==0||sumando2==0) {
			errorCero();
		}
		if (sumando1<0 || sumando2<0) {
			throw new ExcepcionNumeroNegativo();
		}
		a= sumando1+sumando2;
		acumulador= convertirEnteros(a);
			return acumulador;	
	}

	/**
	 * 
	 * @param sumando1 recibe un numero real
	 * @param sumando2 recibe un numero real
	 * @param sumando3 recibe un numero real
	 * @see ExcepcionNumerosNegativos()
	 * @see errorCero()
	 * @return devuelve la suma de los otros parametros.
	 */
	public double suma3NumeroReales(double sumando1, double sumando2, double sumando3) throws ExcepcionNumeroNegativo {
		if (sumando1==0||sumando2==0) {
			errorCero();
		}
		if (sumando1<0 || sumando2<0|| sumando3<0 ) {
			throw new ExcepcionNumeroNegativo();
		}
		acumulador= sumando1+sumando2+sumando3;
		
			return acumulador;	
	}

	/**
	 * @see ExcepcionNumerosNegativos()
	 * @param sumando valor que le damos
	 * @return devuelve un valor, acumulador mas un parametro
	 */
	public double sumaAcumulada(double sumando)throws ExcepcionNumeroNegativo {
			if (sumando<0) {
				throw new ExcepcionNumeroNegativo();
			}
		acumulador = acumulador +sumando;
		return acumulador;
	}

	/**
	 * Este metodo es privado dado que solo se usa dentro de esta clase
	 * 
	 * @param i recibe cualquier numero entero
	 * @return convierte el numero entero recibido en un double o numero real
	 */

	private double convertirEnteros(int  i) {
		return (double) i;
	}


	/**
	 * Este metodo es privado, dado que solo se usa dentro de esta clase Devuelve
	 * "Error" por pantalla cuando el numero introducido es igual a O dado el caso
	 * de que la calculadora no operase con ceros
	 * 
	 * @param i recibe cualquier numero, se comprueba si es igual a 0
	 * @return devuelve "Error"
	 */
	private String errorCero() {
		return "Error";
	}

}
