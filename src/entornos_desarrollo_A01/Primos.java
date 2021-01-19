package entornos_desarrollo_A01;

/**
 * esta clase sirve para realizar numeros primos
 * 
 * @author Sergio
 * @since 19/01/2021
 * @version 1.0
 */

public class Primos {
	/**
	 * creamos las variables esPrimo, c, m, t.
	 */
	private boolean esPrimo;
	private double acumulador;

	/**
	 * 
	 * @param valorPrimo valor al que le calcularemos si tiene valores primos 
	 * @return esPrimo el cual te dice si el numero es primo o no.
	 * @see errorNumerosNegativos()
	 * @see errorCero()
	 */
	public boolean siPrimo(int valorPrimo) {
		return esPrimo;

	}

	/**
	 * @param valorPrimos valor al que le comprovaremos cuantos primos tiene
	 * @return acumulador devuelve la cantidad de numeros primos que hay.
	 * @see errorNumerosNegativos()
	 * @see errorCero()
	 */
	public double SiIesimo(int valorPrimos) {
		return acumulador;
	}

	/**
	 * 
	 * @param valor1 valor al que le calcularemos el porcentaje
	 * @param valor2 el porcentaje a calcular
	 * @return acumulador devuelve el porcentaje de las dos variables valor1 y valor2.
	 * @see errorNumerosNegativos()
	 * @see errorCero()
	 */

	public double porcentaje(double valor1, double valor2) {
		return acumulador;
	}

	/**
	 * 
	 * @param valor
	 * @return acumulador devuelve un factorial de un numero entero.
	 * @see errorNumerosNegativos()
	 * @see errorCero() Dentro de este método, comprobaremos que los parámetros
	 *      introducidos no son negativos o iguales a 0 llamando a estos métodos
	 *      privados.
	 *  @link     -- llamar a la clase Multiplicacion para ayudarnos a hacer las multiplicaciones --
	 */

	public double factorial(int valor) {
		return acumulador;
	}

	/**
	 * Este metodo es privado, dado que solo se usa dentro de esta clase Devuelve
	 * "Error" en la consola cuando se introduce un numero negativo dado el caso de
	 * que la calculadora no operase con numeros negativos
	 * 
	 * @param i recibe cualquier numero, se comprueba si es negativo
	 * @return devuelve "Error" si el numero es negativo"
	 * @deprecated Este metodo podra dejar de ser utilizado con excepciones
	 */

	private String errorNumerosNegativos(int i) {
		return "Error";
	}

	/**
	 * Este metodo es privado, dado que s�lo se usa dentro de esta clase Devuelve
	 * "Error" por pantalla cuando el numero introducido es igual a O dado el caso
	 * de que la calculadora no operase con ceros
	 * 
	 * @param i recibe cualquier numero, se comprueba si es igual a 0
	 * @return devuelve "Error"
	 * @deprecated Este metodo podra dejar de ser utilizado con excepciones
	 */
	private String errorCero(int i) {
		return "Error";
	}

}
