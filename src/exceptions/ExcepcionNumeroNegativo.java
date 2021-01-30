package exceptions;

import java.lang.Exception;

public class ExcepcionNumeroNegativo extends Exception {

	public ExcepcionNumeroNegativo() {
		super("No se permiten numeros negativos.");
	}

}