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
	 * Aquí acumulamos
	 */
	double acumulador;
	
	
	
	/**
	 * 
	 * @param x recibe un número real
	 * @param y recibe un número real 
	 * @return devuelve la resta del parámetros x e y
	 */
	public double restaNumerosReales (double x, double y) {	
		return acumulador;
	}
	
	
	
	/**
	 * 
	 * @param x recibe un número entero
	 * @param y recibe un número entero
	 * @return devuelve un número real, resultado de la resta de los parámetros x e y
	 * 
	 * @see convertirEnteros()
	 * En este método se llama a este otro método para convertir los números enteros en reales
	 * 
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * Dentro de este método, comprobaremos que los parámetros introducidos no son negativos o igual a 0
	 * llamando a estos métodos privados 
	 */
	public double restaNumerosEnteros (int x, int y) { 
		return acumulador;
	}
	
	
	
	/**
	 * 
	 * @param x recibe un número real	
	 * @param y recibe un número real
	 * @param z recibe un número real
	 * @return devuelve la resta del primer parámetro x, menos el segundo y, menos el tercero z
	 */
	public double resta3NumerosReales (double x, double y, double z) {
		return acumulador;
		
	}
	
	
	
	/**
	 * 
	 * @param z recibe número real 
	 * @return devolverá el resultado de la resta de un valor un valor acumulado w y el parámetro z
	 */
	public double restaValorAcumulado (double z) {
		return acumulador;
	}
	
	
	
	/**
	 * Este método es privado dado que sólo se usa dentro de esta clase
	 * @param i recibe cualquier número entero 
	 * @return convierte el número entero recibido en un double o número real
	 */
	
	private double convertirEnteros (int i) {
		return (double) i;
	}
	
	
	/**
	 * Este método es privado, dado que sólo se usa dentro de esta clase
	 * Devuelve "Error" por pantalla cuando se introduce un número negativo
	 * dado el caso de que la calculadora no operase con números negativos
	 * @param i recibe cualquier número, se comprueba si es negativo
	 * @return devuelve "Error" si el número es negativo"
	 * @deprecated Este método podrá dejar de ser utilizado con excepciones
	 */
	private String errorNumerosNegativos (int i) {
		return "Error";
	}
	
	
	
	/**
	 * Este método es privado, dado que sólo se usa dentro de esta clase
	 * Devuelve "Error" por pantalla cuando el número introducido es igual a O
	 * dado el caso de que la calculadora no operase con ceros
	 * @param i recibe cualquier número, se comprueba si es igual a 0
	 * @return devuelve "Error"
	 * @deprecated Este método podrá dejar de ser utilizado con excepciones
	 */
	private String errorCero (int i) {
		return "Error";
	}
	
}
