package exceptions;

import java.lang.Exception;

public class ExcepcionDivisionPorCero extends Exception {

	public ExcepcionDivisionPorCero() {
		super("No se permiten Dividir por cero.");
	}

}