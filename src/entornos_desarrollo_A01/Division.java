package entornos_desarrollo_A01;

/**
 * Documentando Division con JavaDoc
 * 
 * @autor Gonzalo Fernandez Ruiz
 * @version 1.0
 * @since 19/01/2020
 * 
 */
public class Division {
	/** 
	 * Aqu� acumulamos el valor de las operaciones
	 */
	private double acumulador;
	public Division () {
		
	}

	/**
	 * Metodo para realizar la division de  dos numeros reales
	 * @param dividendo numero real para realizar la division
	 * @param divisor numero real para realizar la division
	 * @return devuelve el resultado de la division dos numeros reales
	 * @throws ExcepcionDivisionPorCero 
	 * @throws ExcepcionNumeroNegativo 
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public double divisionNumReales(double dividendo, double divisor) throws ExcepcionDivisionPorCero, ExcepcionNumeroNegativo {
		
		if(divisor==0) {
			throw new ExcepcionDivisionPorCero();
		}else if (dividendo<0 || divisor<0) {
			throw new ExcepcionNumeroNegativo();
		}
		acumulador = dividendo/divisor;

		return acumulador;
	}

	/**
	 * Metodo para realizar la division de dos numeros enteros
	 * @param dividendo numero entero para realizar la division
	 * @param divisor numero entero para realizar la division
	 * @return devuelve el resultado de la division de dos numeros enteros
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public double sumNumEnteros(int dividendo, int divisor) {

		return acumulador;
	}

	/**
	 * Metodo para realizar el inverso de un valor real
	 * @param numeroInversor numero entero al que averiguaremos su inverso
	 * @return devuelve el resultado de dividir uno entre el valor dado
	 * @see errorNumerosNegativos();
	 * @see errorCero();
	 */
	public double inversoValor(int numeroInversor) {

		return acumulador;
	}

	/**
	 * Metodo para realizar la raiz de un valor real
	 * 
	 * @param numeroRaiz es el valor para calcular su raiz
	 * @return devuelve el resultado de la raiz de un valor dado
	 * @see errorCero() si el exponente es 0 devolvera 1 , y si es otro valor
	 * @see comprobarExponente()
	 */
	public double raizDeNumero(int numeroRaiz) {
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
		return acumulador;
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

	private String errorNumerosNegativos(int comprobarNegativo) {
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
	private String errorCero(int comprobarCero) {
		return "Error";
	}
	
}
