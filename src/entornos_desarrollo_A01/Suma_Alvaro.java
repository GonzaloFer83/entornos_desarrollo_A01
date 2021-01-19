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
	 * @param x recibe un número real
	 * @param y recibe un número real
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * @return Devuelve una suma de dos números reales que guarda el valor acumulado.
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
	 * @param x recibe un número real
	 * @param y recibe un número real
	 * @param w recibe un número real
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
	 * @return devuelve un valor, acumulador más un parámetro
	 */
	public double sumaAcumulada (double z) {
		return acumulador;
	}
	
	
	

	/**
	 * Este método es privado dado que sólo se usa dentro de esta clase
	 * @param i recibe cualquier número entero 
	 * @return convierte el número entero recibido en un double o número real
	 */
	
	private double convertirEnteros (int i) {
		return (double) i;
	}
	
	/**
	 * Este método es privado, dado que sólo se usa dentro de esta clase
	 * Devuelve "Error" por pantalla cuando se introduce un número negativo
	 * dado el caso de que la calculadora no operase con números negativos
	 * @param i recibe cualquier número, se comprueba si es negativo
	 * @return devuelve "Error" si el número es negativo"
	 * @deprecated Este método podrá dejar de ser utilizado con excepciones
	 */
	
	private String errorNumerosNegativos (int i) {
		return "Error";
	}
	
	
	/**
	 * Este método es privado, dado que sólo se usa dentro de esta clase
	 * Devuelve "Error" por pantalla cuando el número introducido es igual a O
	 * dado el caso de que la calculadora no operase con ceros
	 * @param i recibe cualquier número, se comprueba si es igual a 0
	 * @return devuelve "Error"
	 * @deprecated Este método podrá dejar de ser utilizado con excepciones
	 */
	private String errorCero (int i) {
		return "Error";
	}
	
}



