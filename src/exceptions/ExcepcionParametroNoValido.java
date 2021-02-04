package exceptions;

import java.lang.Exception;

public class ExcepcionParametroNoValido extends Exception {
	private static final long serialVersionUID = 1L;

	/*
	 * Se implementa un error padre, que sera la que se invocara para analizar todas
	 * las excepciones posibles
	 * 
	 */
	public ExcepcionParametroNoValido(String error) {
		super(error);
	}

}
