package entornos_desarrollo_A01;

/**
 * Esta clase es para realizar sumas.
 * 
 * @since 19/01/2021
 * @author Alvaro
 * @version 1.0
 */
public class Suma {
	/**
	 * @param acumulador es el valor que se acumula en todas las operaciones.
	 */
	private double acumulador;

	/**
	 * 
	 * @param sumando1 recibe un n�mero real
	 * @param sumando2 recibe un n�mero real
	 * @see errorNumerosNegativos()
	 * @see errorCero()
	 * @return Devuelve una suma de dos n�meros reales que guarda el valor
	 *         acumulado.
	 */
	double suma2NumeroReales(double sumando1, double sumando2) {
		return acumulador;
	}

	/**
	 * Realiza la suma de dos numeros enteros,y lo transforma a double llamando a un
	 * metodo privado.
	 * 
	 * @see convertirEnteros()
	 * @see errorNumerosNegativos()
	 * @see errorCero()
	 * @param sumando1 recibe un numero entero
	 * @param sumando2 recibe un numero entero
	 * @return devuelve el valor de la suma en un numero real.
	 */
	public double sumaNumerosEnteros(int sumando1, int sumando2) {
		return acumulador;
	}

	/**
	 * 
	 * @param sumando1 recibe un n�mero real
	 * @param sumando2 recibe un n�mero real
	 * @param sumando3 recibe un n�mero real
	 * @see errorNumerosNegativos()
	 * @see errorCero()
	 * @return devuelve la suma de los otros parametros.
	 */
	public double suma3NumeroReales(double sumando1, double sumando2, double sumando3) {
		return acumulador;
	}

	/**
	 * 
	 * @param sumando valor que le damos
	 * @return devuelve un valor, acumulador m�s un par�metro
	 */
	public double sumaAcumulada(double sumando) {
		return acumulador;
	}

	/**
	 * Este m�todo es privado dado que s�lo se usa dentro de esta clase
	 * 
	 * @param i recibe cualquier n�mero entero
	 * @return convierte el n�mero entero recibido en un double o n�mero real
	 */

	private double convertirEnteros(int i) {
		return (double) i;
	}

	/**
	 * Este m�todo es privado, dado que s�lo se usa dentro de esta clase Devuelve
	 * "Error" por pantalla cuando se introduce un n�mero negativo dado el caso de
	 * que la calculadora no operase con n�meros negativos
	 * 
	 * @param i recibe cualquier n�mero, se comprueba si es negativo
	 * @return devuelve "Error" si el n�mero es negativo"
	 * @deprecated Este m�todo podr� dejar de ser utilizado con excepciones
	 */

	private String errorNumerosNegativos(int i) {
		return "Error";
	}

	/**
	 * Este m�todo es privado, dado que s�lo se usa dentro de esta clase Devuelve
	 * "Error" por pantalla cuando el n�mero introducido es igual a O dado el caso
	 * de que la calculadora no operase con ceros
	 * 
	 * @param i recibe cualquier n�mero, se comprueba si es igual a 0
	 * @return devuelve "Error"
	 * @deprecated Este m�todo podr� dejar de ser utilizado con excepciones
	 */
	private String errorCero(int i) {
		return "Error";
	}

}
