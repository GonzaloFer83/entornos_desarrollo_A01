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
		 * @param acumulador 
		 */
	double acumulador;
	/**
	 *	
	 * @param x
	 * @param y
	 * @return Devuelve una suma de dos n�meros reales que guarda el valor acumulado.
	 */
double suma2NumeroReales(double x, double y){
			return acumulador;
	}
	/**
	 * 
	 * @param x
	 * @param y
	 * @return De
	 */
	public double sumaNumerosEnteros (int x, int y) {
			return acumulador;
	}
	/**
	 * 
	 * @param x
	 * @param y
	 * @param w
	 * @return
	 */
	public double suma3NumeroReales(double x,double y,double w){
			return acumulador;
	}
	
	/**
	 * 
	 * @param z valor que le damos
	 * @return devuelve un valor que se acumula.
	 */
	public double sumaAcumulada (double z) {
		return acumulador;
	}
	
	
	/**
	 * Este m�todo es privado porque solo se usa dentro de otro metodo.
	 *@return pasa el n�mero de entero a double.
	 *@see sumaNumerosEnteros()
	 */
	private double pasarNumerosDouble (int s) {
		return (double) s;
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



