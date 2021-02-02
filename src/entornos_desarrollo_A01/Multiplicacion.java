package entornos_desarrollo_A01;

import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExceptionExpAlto;

/**
 * Documentando Multiplicacion con JavaDoc
 * 
 * @autor Adrian Fernandez Herrero
 * @version 1.2
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
	public double multiNumReales(double multiplicando, double multiplicador) throws ExcepcionErrorCero,ExcepcionNumeroNegativo {
		if (multiplicando == 0 ||  multiplicador == 0) {
			throw new ExcepcionErrorCero();
		} else if (multiplicando < 0 || multiplicador < 0 ) {
			throw new ExcepcionNumeroNegativo();
		}else {
			return acumulador *= (multiplicando * multiplicador);
		}

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
	public double multiNumEnteros(int multiplicando, int multiplicador) throws ExcepcionErrorCero,ExcepcionNumeroNegativo {
		if (multiplicando == 0 ||  multiplicador == 0) {
			throw new ExcepcionErrorCero();
		} else if (multiplicando < 0 || multiplicador < 0 ) {
			throw new ExcepcionNumeroNegativo();
		}else {
			return acumulador *= (multiplicando * multiplicador);
		}

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
	public double multiNumReales(double multiplicando, double multiplicador1, double multiplicador2) throws ExcepcionErrorCero,ExcepcionNumeroNegativo {
		if (multiplicando == 0 ||  multiplicador1 == 0 || multiplicador2 == 0) {
			throw new ExcepcionErrorCero();
		} else if (multiplicando < 0 || multiplicador1 < 0 ||multiplicador2 < 0 ) {
			throw new ExcepcionNumeroNegativo();
		}else {
			return acumulador *= (multiplicando * multiplicador1 * multiplicador2);
		}
		
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
	public double potencia(int base, double expontente) throws ExceptionExpAlto{
		
		if (expontente > Float.MAX_EXPONENT) {
			throw new ExceptionExpAlto(expontente);
		} else {
			return acumulador *= Math.pow(base, expontente);
		}
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

}
