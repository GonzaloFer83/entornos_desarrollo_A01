package entornos_desarrollo_A01;

/**
 * Documentando Multiplicacion con JavaDoc
 * 
 * @autor Adrian Fernandez Herrero
 * @version 1.1
 * @since 31/01/2020
 * 
 */
public class Multiplicacion {
	/**
	 * Aqui acumulamos el valor de las operaciones
	 */
	private double acumulador;

	/**
	 * En el constructor por defecto se incializa el campo acumulador
	 */
	public Multiplicacion() {
		super();
		this.acumulador = 1;
	}

	/**
	 *Metodo para realizar el producto con dos numeros reales
	 * 
	 * @return devuelve el resultado del producto con dos numeros reales
	 * @param multiplicando numero real para realizar el producto
	 * @param multiplicador numero real para realizar el producto
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public double multiNumReales(double multiplicando, double multiplicador) {
		return acumulador *= (multiplicando * multiplicador);
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
		return acumulador *= (multiplicando * multiplicador);
	}

	/**
	 * Metodo para realizar el producto con dos numeros enteros
	 * 
	 * @return devuelve el resultado del producto con dos numeros enteros
	 * @param multiplicando  numero entero para realizar el producto
	 * @param multiplicador1 numero entero para realizar el producto
	 * @param multiplicador2 numero entero para realizar el producto
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public double multiReales(double multiplicando, double multiplicador1, double multiplicador2) {

		return acumulador *= (multiplicando * multiplicador1 * multiplicador2);
	}

	/**
	 * Metodo para realizar el producto con dos numeros enteros
	 * 
	 * @return devuelve el resultado del producto con dos numeros enteros
	 * @param base       sera el factor que se repite
	 * @param expontente numero de veces que se repite el factor
	 * @see errorCero() si el exponente es 0 devolvera 1 , y si es otro valor
	 * 
	 * 
	 * @see comprobarExponente()
	 */
	public double potencia(int base, double expontente) {
		if (comprobarExponente(expontente) != true) {
			return acumulador *= 1;
		}
		return acumulador *= Math.pow(base, expontente);
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
	private boolean comprobarExponente(double exp) {
		if (exp > Float.MAX_VALUE) {
			return false;
		}
		return true;
	}
}
