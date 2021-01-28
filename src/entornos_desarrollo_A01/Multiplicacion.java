package entornos_desarrollo_A01;

/**
 * Documentando Multiplicacion con JavaDoc
 * 
 * @autor Adrian Fernandez Herrero
 * @version 1.0
 * @since 19/01/2020
 * 
 */
public class Multiplicacion {
	/** 
	 * Aqui acumulamos el valor de las operaciones
	 */
	private double acumulador;

	/**
	 * Metodo para realizar el producto con dos numeros reales
	 * 
	 * @return devuelve el resultado del producto con dos numeros reales
	 * @param multiplicando numero real para realizar el producto
	 * @param multiplicador numero real para realizar el producto
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public double multiNumReales(double multiplicando, double multiplicador) {

		return acumulador;
	}

	/**
	 * Metodo para realizar el producto con dos numeros enteros
	 * 
	 * @return devuelve el resultado del producto con dos numeros enteros
	 * @param multiplicando numero entero para realizar el producto
	 * @param multiplicador numero entero para realizar el producto
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public double multiNumEnteros(int multiplicando, int multiplicador) {

		return acumulador;
	}

	/**
	 * Metodo para realizar el producto con dos numeros enteros
	 * 
	 * @return devuelve el resultado del producto con dos numeros enteros
	 * @param multiplicando numero entero para realizar el producto
	 * @param multiplicador1 numero entero para realizar el producto
	 * @param multiplicador2 numero entero para realizar el producto
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public double multiTresReales(double multiplicando, double multiplicador1, double multiplicador2) {

		return acumulador;
	}

	/**
	 * Metodo para realizar el producto con dos numeros enteros
	 * 
	 * @return devuelve el resultado del producto con dos numeros enteros
	 * @param base       sera el factor que se repite
	 * @param expontente numero de veces que se repite el factor
	 * @see errorCero() si el exponente es 0 devolvera 1 , y si es otro valor
	 * 
	 * {@link Division #raizDeNumero()},
	 * @see comprobarExponente()
	 */
	public double potencia(int base, double expontente) {
		return acumulador;
	}

	/**
	 * Este metodo es privado, dado que si lo se usa dentro de esta clase Devuelve
	 * "Error" por pantalla cuando se introduce un numero negativo dado el caso de
	 * que la calculadora no operase con numeros negativos
	 * 
	 * @param i recibe cualquier numero, se comprueba si es negativo
	 * @return devuelve "Error" si el numero es negativo"
	 * @deprecated Este metodo podria dejar de ser utilizado con excepciones
	 */

	private String errorNumerosNegativos(int i) {
		return "Error";
	}

	/**
	 * Este metodo es privado, dado que si lo se usa dentro de esta clase Devuelve
	 * "Error" por pantalla cuando el numero introducido es igual a O dado el caso
	 * de que la calculadora no operase con ceros
	 * 
	 * @param i recibe cualquier numero, se comprueba si es igual a 0
	 * @return devuelve "Error"
	 * @deprecated Este metodo podria dejar de ser utilizado con excepciones
	 */
	private String errorCero(int i) {
		return "Error";
	}

	/**
	 * *Este metodo es privado, dado que si lo se usa dentro de esta clase Devuelve
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
