package entornos_desarrollo_A01;

/**
 * Documentando Multiplicación con JavaDoc
 * 
 * @autor Adrián Fernández
 * @version 1.0
 * @since 19/01/2020
 * 
 */
public class Multiplicacion {
	int w;
	double x;

	/**
	 * Metodo para realizar el producto con dos numeros reales
	 * 
	 * @return devuelve el resultado del producto con dos numeros reales
	 * @param num1 numero real para realizar el producto
	 * @param num2 numero real para realizar el producto
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public double sumNumReales(double num1, double num2) {

		return x;
	}

	/**
	 * Metodo para realizar el producto con dos numeros enteros
	 * 
	 * @return devuelve el resultado del producto con dos numeros enteros
	 * @param num1 numero entero para realizar el producto
	 * @param num2 numero entero para realizar el producto
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public int sumNumEnteros(int num1, int num2) {

		return w;
	}

	/**
	 * Metodo para realizar el producto con dos numeros enteros
	 * 
	 * @return devuelve el resultado del producto con dos numeros enteros
	 * @param num1 numero entero para realizar el producto
	 * @param num2 numero entero para realizar el producto
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public double sumTresReales(double num1, double num2, double num3) {

		return x;
	}

	/**
	 * Metodo para realizar el producto con dos numeros enteros
	 * 
	 * @return devuelve el resultado del producto con dos numeros enteros
	 * @param base       sera el factor que se repite
	 * @param expontente numero de veces que se repite el factor
	 * @see errorCero() si el exponente es 0 devolvera 1 , y si es otro valor
	 * 
	 * @link     -- llamar a la clase Division --
	 * @see comprobarExponente()
	 */
	public double potencia(int base, double expontente) {
		return w;
	}

	/**
	 * Este método es privado, dado que sólo se usa dentro de esta clase Devuelve
	 * "Error" por pantalla cuando se introduce un número negativo dado el caso de
	 * que la calculadora no operase con números negativos
	 * 
	 * @param i recibe cualquier número, se comprueba si es negativo
	 * @return devuelve "Error" si el número es negativo"
	 * @deprecated Este método podrá dejar de ser utilizado con excepciones
	 */

	private String errorNumerosNegativos(int i) {
		return "Error";
	}

	/**
	 * Este método es privado, dado que sólo se usa dentro de esta clase Devuelve
	 * "Error" por pantalla cuando el número introducido es igual a O dado el caso
	 * de que la calculadora no operase con ceros
	 * 
	 * @param i recibe cualquier número, se comprueba si es igual a 0
	 * @return devuelve "Error"
	 * @deprecated Este método podrá dejar de ser utilizado con excepciones
	 */
	private String errorCero(int i) {
		return "Error";
	}

	/**
	 * *Este método es privado, dado que sólo se usa dentro de esta clase Devuelve
	 * "Error" por pantalla cuando el exponente introducido excede del maximo
	 * permitido para ese tipo de dato primitivo
	 * 
	 * 
	 * @return devuelve "error" si el exponente es muy grande
	 * @param exp se comprobara si exponente supera el valor maximo permitido del
	 *            dato primitivo
	 */
	private String comprobarExponente(double exp) {
		return "Error";
	}
}
