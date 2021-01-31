package entornos_desarrollo_A01;

import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroNegativo;

/**
 * Documentando Division con JavaDoc
 * 
 * @autor Gonzalo Fernandez Ruiz
 * @version 1.2
 * @since 19/01/2020
 * 
 */
public class Division {
	/**
	 * Aqu� acumulamos el valor de las operaciones
	 */
	private double acumulador;

	public Division() {

	}

	/**
	 * Metodo para realizar la division de dos numeros reales
	 * 
	 * @param dividendo numero real para realizar la division
	 * @param divisor   numero real para realizar la division
	 * @return devuelve el resultado de la division dos numeros reales
	 * @throws ExcepcionDivisionPorCero
	 * @throws ExcepcionNumeroNegativo
	 */
	public double divisionNumReales(double dividendo, double divisor)
			throws ExcepcionErrorCero, ExcepcionNumeroNegativo {

		if (divisor == 0) {
			throw new ExcepcionErrorCero();
		} else if (dividendo < 0 || divisor < 0) {
			throw new ExcepcionNumeroNegativo();
		}
		acumulador = dividendo / divisor;
		// eliminacion de los periodos, dedondeo
		acumulador = eliminacionPeriodos(acumulador);

		return acumulador;
	}

	/**
	 * Metodo para realizar la division de dos numeros enteros
	 * 
	 * @param dividendo numero entero para realizar la division
	 * @param divisor   numero entero para realizar la division
	 * @return devuelve el resultado de la division de dos numeros enteros
	 * @throws ExcepcionDivisionPorCero
	 * @throws ExcepcionNumeroNegativo
	 */
	public double sumNumEnteros(int dividendo, int divisor) throws ExcepcionErrorCero, ExcepcionNumeroNegativo {
		if (divisor == 0) {
			throw new ExcepcionErrorCero();
		} else if (dividendo < 0 || divisor < 0) {
			throw new ExcepcionNumeroNegativo();
		}
		acumulador = dividendo / divisor;

		return acumulador;
	}

	/**
	 * Metodo para realizar el inverso de un valor real
	 * 
	 * @param numeroInversor numero entero al que averiguaremos su inverso
	 * @return devuelve el resultado de dividir uno entre el valor dado
	 * @throws ExcepcionNumeroNegativo
	 */
	public double inversoValor(int numeroInversor) throws ExcepcionNumeroNegativo {
		if (numeroInversor < 0) {
			throw new ExcepcionNumeroNegativo();
		}
		acumulador = 1 / numeroInversor;

		return acumulador;
	}

	/**
	 * Metodo para realizar la raiz de un valor real
	 * 
	 * @param numeroRaiz es el valor para calcular su raiz
	 * @return devuelve el resultado de la raiz de un valor dado
	 * @throws ExcepcionDivisionPorCero
	 * @throws ExcepcionNumeroNegativo  {@link Multiplicacion #potencia()}
	 */
	public double raizDeNumero(int numeroRaiz) throws ExcepcionErrorCero, ExcepcionNumeroNegativo {
		if (numeroRaiz == 0) {
			throw new ExcepcionErrorCero();
		} else if (numeroRaiz < 0) {
			throw new ExcepcionNumeroNegativo();
		}
		Multiplicacion mul = new Multiplicacion();

		acumulador = mul.potencia(numeroRaiz, 0.5);
		// eliminacion de los periodos, dedondeo
		acumulador = eliminacionPeriodos(acumulador);

		return acumulador;
	}

	/**
	 * Este metodo es privado, lo utilizaremos para analizar los resultados y evitar
	 * el exceso de periodos repetidos y redondear los valores
	 * 
	 * @param valorAnalizar recibe cualquier n�mero, comprobaremos su periodicidad
	 * @return devuelve un valor redondeado
	 */
	private double eliminacionPeriodos(double valorAnalizar) {
		acumulador = valorAnalizar * Math.pow(10, 2);
		acumulador = Math.round(acumulador);
		acumulador = acumulador / Math.pow(10, 2);
		return acumulador;
	}

}
