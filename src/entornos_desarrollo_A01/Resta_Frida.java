package entornos_desarrollo_A01;

/**
 * 
 * Esta clase es para realizar diverso tipo de restas 
 * 
 * @author Frida
 * @version 1.0
 * @since 19/01/2021
 * 
 */
public class Resta_Frida {
	
	
	/** 
	 * Aqu� acumulamos
	 */
	double acumulador;
	
	
	
	/**
	 * 
	 * @param x recibe un n�mero real
	 * @param y recibe un n�mero real 
	 * @return devuelve la resta del par�metros x e y
	 */
	public double restaNumerosReales (double x, double y) {	
		return acumulador;
	}
	
	
	
	/**
	 * 
	 * @param x recibe un n�mero entero
	 * @param y recibe un n�mero entero
	 * @return devuelve un n�mero real, resultado de la resta de los par�metros x e y
	 * 
	 * @see convertirEnteros()
	 * En este m�todo se llama a este otro m�todo para convertir los n�meros enteros en reales
	 * 
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * Dentro de este m�todo, comprobaremos que los par�metros introducidos no son negativos o igual a 0
	 * llamando a estos m�todos privados 
	 */
	public double restaNumerosEnteros (int x, int y) { 
		return acumulador;
	}
	
	
	
	/**
	 * 
	 * @param x recibe un n�mero real	
	 * @param y recibe un n�mero real
	 * @param z recibe un n�mero real
	 * @return devuelve la resta del primer par�metro x, menos el segundo y, menos el tercero z
	 */
	public double resta3NumerosReales (double x, double y, double z) {
		return acumulador;
		
	}
	
	
	
	/**
	 * 
	 * @param z recibe n�mero real 
	 * @return devolver� el resultado de la resta de un valor un valor acumulado w y el par�metro z
	 */
	public double restaValorAcumulado (double z) {
		return acumulador;
	}
	
	
	
	/**
	 * Este m�todo es privado dado que s�lo se usa dentro de esta clase
	 * @param i recibe cualquier n�mero entero 
	 * @return convierte el n�mero entero recibido en un double o n�mero real
	 */
	
	private double convertirEnteros (int i) {
		return (double) i;
	}
	
	
	/**
	 * Este m�todo es privado, dado que s�lo se usa dentro de esta clase
	 * Devuelve "Error" por pantalla cuando se introduce un n�mero negativo
	 * dado el caso de que la calculadora no operase con n�meros negativos
	 * @param i recibe cualquier n�mero, se comprueba si es negativo
	 * @return devuelve "Error" si el n�mero es negativo"
	 * @deprecated Este m�todo podr� dejar de ser utilizado con excepciones
	 */
	private String errorNumerosNegativos (int i) {
		return "Error";
	}
	
	
	
	/**
	 * Este m�todo es privado, dado que s�lo se usa dentro de esta clase
	 * Devuelve "Error" por pantalla cuando el n�mero introducido es igual a O
	 * dado el caso de que la calculadora no operase con ceros
	 * @param i recibe cualquier n�mero, se comprueba si es igual a 0
	 * @return devuelve "Error"
	 * @deprecated Este m�todo podr� dejar de ser utilizado con excepciones
	 */
	private String errorCero (int i) {
		return "Error";
	}
	
}
