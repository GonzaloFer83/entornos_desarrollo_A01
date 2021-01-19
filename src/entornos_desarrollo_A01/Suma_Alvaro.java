package entornos_desarrollo_A01;

import java.util.Scanner;
/**
 * Esta clase es para realizar sumas.
 * @since 19/01/2021
 * @author Alvaro
 * @version 1.0
 */
public class Suma_Alvaro {
		/**
		 * @param acumulador es el valor que se acumula en todas las operaciones.
		 */
	double acumulador;
	/**
	 *	
	 * @param x recibe un n�mero real
	 * @param y recibe un n�mero real
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * @return Devuelve una suma de dos n�meros reales que guarda el valor acumulado.
	 */
double suma2NumeroReales(double x, double y){
			return acumulador;
	}
	/**
	 * Realiza la suma de dos numeros enteros,y lo transforma a double llamando a un metodo privado.
	 * @see convertirEnteros()
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * @param x recibe un numero entero
	 * @param yrecibe un numero entero
	 * @return devuelve el valor de la suma en un numero real.
	 */
	public double sumaNumerosEnteros (int x, int y) {
			return acumulador;
	}
	
	
	/**
	 * 
	 * @param x recibe un n�mero real
	 * @param y recibe un n�mero real
	 * @param w recibe un n�mero real
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * @return devuelve la suma de los otros parametros.
	 */
	public double suma3NumeroReales(double x,double y,double w){
			return acumulador;
	}
	
	/**
	 * 
	 * @param z valor que le damos
	 * @return devuelve un valor, acumulador m�s un par�metro
	 */
	public double sumaAcumulada (double z) {
		return acumulador;
	}
	
	
	

	/**
	 * Este m�todo es privado dado que s�lo se usa dentro de esta clase
	 * @param i recibe cualquier n�mero entero 
	 * @return convierte el n�mero entero recibido en un double o n�mero real
	 */
	
	private double convertirEnteros (int i) {
		return (double) i;
	}
	
	/**
	 * Este m�todo es privado, dado que s�lo se usa dentro de esta clase
	 * Devuelve "Error" por pantalla cuando se introduce un n�mero negativo
	 * dado el caso de que la calculadora no operase con n�meros negativos
	 * @param i recibe cualquier n�mero, se comprueba si es negativo
	 * @return devuelve "Error" si el n�mero es negativo"
	 * @deprecated Este m�todo podr� dejar de ser utilizado con excepciones
	 */
	
	private String errorNumerosNegativos (int i) {
		return "Error";
	}
	
	
	/**
	 * Este m�todo es privado, dado que s�lo se usa dentro de esta clase
	 * Devuelve "Error" por pantalla cuando el n�mero introducido es igual a O
	 * dado el caso de que la calculadora no operase con ceros
	 * @param i recibe cualquier n�mero, se comprueba si es igual a 0
	 * @return devuelve "Error"
	 * @deprecated Este m�todo podr� dejar de ser utilizado con excepciones
	 */
	private String errorCero (int i) {
		return "Error";
	}
	
}



