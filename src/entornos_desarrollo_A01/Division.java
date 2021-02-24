package entornos_desarrollo_A01;

import java.text.DecimalFormat;

import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroMuyBajo;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExceptionNumeroAlto;

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
	 * @throws ExceptionNumeroAlto 
	 * @throws ExcepcionNumeroMuyBajo 
	 */
	public double divisionNumReales(double dividendo, double divisor)
			throws ExcepcionErrorCero, ExcepcionNumeroNegativo, ExceptionNumeroAlto, ExcepcionNumeroMuyBajo {

		dividendo = comprobarValores(dividendo);
		divisor = comprobarValores(divisor);
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
	 * @throws ExceptionNumeroAlto 
	 * @throws ExcepcionNumeroMuyBajo 
	 */
	public double sumNumEnteros(int dividendo, int divisor) throws ExcepcionErrorCero, ExcepcionNumeroNegativo, ExceptionNumeroAlto, ExcepcionNumeroMuyBajo {
		dividendo = comprobarValores(dividendo);
		divisor = comprobarValores(divisor);		
		acumulador = dividendo / divisor;

		return acumulador;
	}

	/**
	 * Metodo para realizar el inverso de un valor real
	 * 
	 * @param numeroInversor numero entero al que averiguaremos su inverso
	 * @return devuelve el resultado de dividir uno entre el valor dado
	 * @throws ExcepcionNumeroNegativo
	 * @throws ExcepcionErrorCero 
	 * @throws ExceptionNumeroAlto 
	 * @throws ExcepcionNumeroMuyBajo 
	 */
	public double inversoValor(int numeroInversor) throws ExcepcionNumeroNegativo, ExceptionNumeroAlto, ExcepcionErrorCero, ExcepcionNumeroMuyBajo {

		numeroInversor = comprobarValores(numeroInversor);
		acumulador = (double)1/numeroInversor;
		acumulador = eliminacionPeriodos(acumulador);
		return acumulador;
	}

	/**
	 * Metodo para realizar la raiz de un valor real
	 * 
	 * @param numeroRaiz es el valor para calcular su raiz
	 * @return devuelve el resultado de la raiz de un valor dado
	 * @throws ExcepcionDivisionPorCero
	 * @throws ExcepcionNumeroNegativo  {@link Multiplicacion #potencia()}
	 * @throws ExceptionNumeroAlto 
	 * @throws ExcepcionNumeroMuyBajo 
	 * @throws  
	 * @throws ExceptionExpAlto 
	 */
	public double raizDeNumero(int numeroRaiz) throws ExcepcionErrorCero, ExcepcionNumeroNegativo, ExceptionNumeroAlto, ExcepcionNumeroMuyBajo {
		numeroRaiz=comprobarValores(numeroRaiz);
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
	
	/**
	 * Este ,etpdp es privado, lo utilizaremos para comprobar que cada valor es correcto y se puede 
	 * trabajar con el
	 * @param valor
	 * @return
	 * @throws ExcepcionErrorCero
	 * @throws ExcepcionNumeroNegativo
	 * @throws ExceptionNumeroAlto
	 * @throws ExcepcionNumeroMuyBajo 
	 */
	private double comprobarValores(double valor) throws ExcepcionErrorCero, ExcepcionNumeroNegativo,ExceptionNumeroAlto, ExcepcionNumeroMuyBajo{
		if (valor == 0) {
			throw new ExcepcionErrorCero();
		} else if (valor < 0 ) {
			throw new ExcepcionNumeroNegativo();
		}else if (valor >=Double.MAX_VALUE) {
			throw new ExceptionNumeroAlto();
		}else if (Double.isNaN(valor)) {
			throw new ArithmeticException();
		}else if (valor <=Double.MIN_VALUE) {
			throw new ExcepcionNumeroMuyBajo();
			}
		return valor;
	}
	
	/**
	 * Este metodo es privado, lo utilizaremos para comprobar que cada valor es correcto y se puede 
	 * trabajar con el
	 * @param valor
	 * @return
	 * @throws ExcepcionErrorCero
	 * @throws ExcepcionNumeroNegativo
	 * @throws ExceptionNumeroAlto
	 * @throws ExcepcionNumeroMuyBajo 
	 */
	private int comprobarValores(int valor) throws ExceptionNumeroAlto, ExcepcionNumeroNegativo, ExcepcionErrorCero, ExcepcionNumeroMuyBajo {
		if (valor == 0) {
			throw new ExcepcionErrorCero();
		} else if (valor < 0 ) {
			throw new ExcepcionNumeroNegativo();
		}else if (valor >=Integer.MAX_VALUE) {
			throw new ExceptionNumeroAlto();
		}else if (valor <=Integer.MIN_VALUE) {
			throw new ExcepcionNumeroMuyBajo();
			}
		return valor;
	}

}
