package entornos_desarrollo_A01;

/**
 * 
 * Esta clase es para realizar diverso tipo de restas 
 * 
 * @author Frida Abella Fernández
 * @version 1.0
 * @since 19/01/2021
 * 
 */
public class Resta {
	
	
	/** 
	 * Aquï¿½ acumulamos el valor de las operaciones
	 */
	private double acumulador;
	
	
	
	/**
	 * 
	 * @param minuendo recibe un nï¿½mero real
	 * @param substraendo recibe un nï¿½mero real 
	 * @return devuelve la resta de los parï¿½metros x e y
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * Dentro de este mï¿½todo, comprobaremos que los parï¿½metros introducidos no son negativos o igual a 0
	 * llamando a estos mï¿½todos privados 
	 */
	public double restaNumerosReales (double minuendo, double substraendo) {	
		return acumulador;
	}
	
	
	
	/**
	 * 
	 * @param minuendo recibe un nï¿½mero entero
	 * @param substraendo recibe un nï¿½mero entero
	 * @return devuelve un nï¿½mero real, resultado de la resta de los parï¿½metros x e y
	 * 
	 * @see convertirEnteros()
	 * Dentro de este mï¿½todo, se llama a este mï¿½todo para convertir los nï¿½meros enteros en reales
	 * 
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * Dentro de este mï¿½todo, comprobaremos que los parï¿½metros introducidos no son negativos o igual a 0
	 * llamando a estos mï¿½todos privados 
	 */
	public double restaNumerosEnteros (int minuendo, int substraendo) { 
		return acumulador;
	}
	
	
	
	/**
	 * 
	 * @param minuendo recibe un nï¿½mero real	
	 * @param substraendo1 recibe un nï¿½mero real
	 * @param substraendo2 recibe un nï¿½mero real
	 * @return devuelve la resta del primer parï¿½metro (x), menos el segundo (y), menos el tercero (z)
	 * 
	 * @see errorNumerosNegativos()
	 * @see errorCero() 
	 * Dentro de este mï¿½todo, comprobaremos que los parï¿½metros introducidos no son negativos o igual a 0
	 * llamando a estos mï¿½todos privados 
	 */
	public double resta3NumerosReales (double minuendo, double substraendo1, double substraendo2) {
		return acumulador;
		
	}
	
	
	
	/**
	 * 
	 * @param substraendo recibe nï¿½mero real 
	 * @return devolverï¿½ el resultado de la resta de un valor un valor acumulado w y el parï¿½metro z
	 * 
	 * @see errorNumerosNegativos()
	 * @see errorCero()  
	 * Dentro de este mï¿½todo, comprobaremos que los parï¿½metros introducidos no son negativos o igual a 0
	 * llamando a estos mï¿½todos privados 
	 */
	public double restaValorAcumulado (double substraendo) {
		return acumulador;
	}
	
	
	
	/**
	 * Este mï¿½todo es privado dado que sï¿½lo se usa dentro de esta clase
	 * @param i recibe cualquier nï¿½mero entero 
	 * @return convierte el nï¿½mero entero recibido en un double o nï¿½mero real
	 */
	
	private double convertirEnteros (int i) {
		return (double) i;
	}
	
	
	/**
	 * Este mï¿½todo es privado, dado que sï¿½lo se usa dentro de esta clase
	 * Devuelve "Error" por pantalla cuando se introduce un nï¿½mero negativo
	 * dado el caso de que la calculadora no operase con nï¿½meros negativos
	 * @param i recibe cualquier nï¿½mero, se comprueba si es negativo
	 * @return devuelve "Error" si el nï¿½mero es negativo"
	 * @deprecated Este mï¿½todo podrï¿½ dejar de ser utilizado con excepciones
	 */
	private String errorNumerosNegativos (int i) {
		return "Error";
	}
	
	
	
	/**
	 * Este mï¿½todo es privado, dado que sï¿½lo se usa dentro de esta clase
	 * Devuelve "Error" por pantalla cuando el nï¿½mero introducido es igual a O
	 * dado el caso de que la calculadora no operase con ceros
	 * @param i recibe cualquier nï¿½mero, se comprueba si es igual a 0
	 * @return devuelve "Error"
	 * @deprecated Este mï¿½todo podrï¿½ dejar de ser utilizado con excepciones
	 */
	private String errorCero (int i) {
		return "Error";
	}
	
}
