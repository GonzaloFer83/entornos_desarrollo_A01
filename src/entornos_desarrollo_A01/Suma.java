package entornos_desarrollo_A01;

import exceptions.ExcepcionErrorCero;
import exceptions.ExcepcionNumeroNegativo;
import exceptions.ExceptionNumeroAlto;

/**
 * Esta clase es para realizar sumas.
 * 
 * @since 19/01/2021
 * @author Alvaro Moreno Chihcarro
 * @version 1.1
 */
public class Suma {
	/**
	 * @param acumulador es el valor que se acumula en todas las operaciones.
	 */
	private double acumulador;
	
	public Suma() {
		
	}


	/**
	 * 
	 * @param sumando1 recibe un numero real
	 * @param sumando2 recibe un numero real
	 * @see ExcepcionNumerosNegativos() este metodo comprueba que no haya numero negativo.
	 * @see ExcepcionErrorCero()  en este metodo comprueba que el numero no sea 0.
	 * @return Devuelve una suma de dos numeros reales que guarda el valor
	 *         acumulado.
	 * @throws ExcepcionErrorCero 
	 */
	double suma2NumeroReales(double sumando1, double sumando2)throws ExcepcionNumeroNegativo, ExcepcionErrorCero,ExceptionNumeroAlto {
		sumando1 = comprobarValores(sumando1);
		sumando2 = comprobarValores(sumando2);
		acumulador = sumando1 + sumando2;
			return acumulador;	
		
	}

	/**
	 * Realiza la suma de dos numeros enteros,y lo transforma a double llamando a un
	 * metodo privado.
	 * 
	 * @see convertirEnteros() este metodo convierte los numeros enteros en double.
	 * @see ExcepcionNumerosNegativos() este metodo comprueba que no haya numero negativo.
	 * @see ExcepcionErrorCero() en este metodo comprueba que el numero no sea 0.
	 * @param sumando1 recibe un numero entero
	 * @param sumando2 recibe un numero entero
	 * @return devuelve el valor de la suma en un numero real.
	 */
	public  double sumaNumerosEnteros(int sumando1, int sumando2)
			throws ExcepcionNumeroNegativo, ExcepcionErrorCero,ExceptionNumeroAlto{
		int a;
		sumando1 = comprobarValores(sumando1);
		sumando2 = comprobarValores(sumando2);
		a= sumando1+sumando2;
		acumulador= convertirEnteros(a);
			return acumulador;	
	}

	/**
	 * 
	 * @param sumando1 recibe un numero real
	 * @param sumando2 recibe un numero real
	 * @param sumando3 recibe un numero real
	 * @see ExcepcionNumerosNegativos()  este metodo comprueba que no haya numero negativo.
	 * @see ExcepcionErrorCero()  en este metodo comprueba que el numero no sea 0.
	 * @return devuelve la suma de los otros parametros.
	 */
	public double suma3NumeroReales(double sumando1, double sumando2, double sumando3) throws ExcepcionNumeroNegativo, ExcepcionErrorCero,ExceptionNumeroAlto {
		sumando1 = comprobarValores(sumando1);
		sumando2 = comprobarValores(sumando2);
		sumando3 = comprobarValores(sumando3);
		acumulador= sumando1+sumando2+sumando3;
		
			return acumulador;	
	}

	/**
	 * @see ExcepcionNumerosNegativos() este metodo comprueba que no haya numero negativo.
	 * @see ExcepcionErrorCero () en este metodo comprueba que el numero no sea 0.
	 * @param sumando valor que le damos
	 * @return devuelve un valor, acumulador mas un parametro
	 */
	public double sumaAcumulada(double sumando)throws ExcepcionNumeroNegativo, ExcepcionErrorCero,ExceptionNumeroAlto {
		sumando = comprobarValores(sumando);
		acumulador = acumulador +sumando;
		return acumulador;
	}

	/**
	 * Este metodo es privado dado que solo se usa dentro de esta clase
	 * 
	 * @param i recibe cualquier numero entero
	 * @return convierte el numero entero recibido en un double o numero real
	 */

	private double convertirEnteros(int  i) {
		return (double) i;
	}
	private double comprobarValores(double valor) throws ExcepcionErrorCero, ExcepcionNumeroNegativo,ExceptionNumeroAlto{
		if (valor == 0) {
			throw new ExcepcionErrorCero();
		} else if (valor < 0 ) {
			throw new ExcepcionNumeroNegativo();
		}else if (valor >Double.MAX_VALUE) {
			throw new ExceptionNumeroAlto();
		}
		return valor;
	}
	private int comprobarValores(int valor) throws ExceptionNumeroAlto, ExcepcionNumeroNegativo, ExcepcionErrorCero {
		if (valor == 0) {
			throw new ExcepcionErrorCero();
		} else if (valor < 0 ) {
			throw new ExcepcionNumeroNegativo();
		}else if (valor >Integer.MAX_VALUE) {
			throw new ExceptionNumeroAlto();
		}
		return valor;
	}


}
