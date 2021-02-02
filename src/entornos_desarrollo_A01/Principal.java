package entornos_desarrollo_A01;

import exceptions.ExcepcionParametroNoValido;

public class Principal {

	public static void main(String[] args) {

		Division div = new Division();
		try {
			System.out.println("El valor de la Raiz Cuadrada de 81 es: " + div.raizDeNumero(81));
		} catch (ExcepcionParametroNoValido error) {
			System.out.println(error.getMessage());
		}
	}

}
