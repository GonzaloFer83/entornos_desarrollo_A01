package entornos_desarrollo_A01;

public class Resta_Frida {

	double w;
	
	
	
	/**
	 * 
	 * @param x recibe un número real
	 * @param y recibe un número real 
	 * @return devuelve un número real 
	 */
	
	public double restaNumerosReales (double x, double y) {	
		return w;
	}
	
	
	/**
	 * 
	 * @param x recibe un número entero
	 * @param y recibe un número entero
	 * @return devuelve un número real
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
		return w;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public double resta3NumerosReales (double x, double y, double z) {
		return w;
		
	}
	
	/**
	 * 
	 * @param z
	 * @return Devolverá el resultado de un valor que se va acumulando al que se resta 
	 */
	
	
	public double restaValorAcumulado (double z) {
		return w;
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
