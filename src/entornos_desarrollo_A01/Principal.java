package entornos_desarrollo_A01;

import exceptions.ExcepcionParametroNoValido;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Crearemos los objetos que nos hagan falta para realizar una prueba de alguno
		 * de nuestros metodos de cada clase
		 */
		Division div = new Division();
		try {
			System.out.println("El valor de la Raiz Cuadrada de 81 es: " + div.raizDeNumero(81));	
		} catch (ExcepcionParametroNoValido error) {
			System.out.println(error.getMessage());
		}
		Suma sum = new Suma();
		 try {
			 System.out.println("valor: " + sum.sumaNumerosEnteros(5, 3));
		 }catch (ExcepcionParametroNoValido error) {
			 System.out.println(error.getMessage());
		 }
		 Resta res = new Resta();
		 try {
			 System.out.println("valor: " + res.resta3NumerosReales(12, 3, 4));
		 }catch (ExcepcionParametroNoValido error) {
			 System.out.println(error.getMessage());
		 }
	}
}
