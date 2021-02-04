package exceptions;

public class ExcepcionErrorCero extends ExcepcionParametroNoValido {
	private static final long serialVersionUID = 1L;

	/*
	 * Se implementa un error especifico para que no acepte el valor cero
	 * 
	 */
	public ExcepcionErrorCero() {
		super("El valor es cero y es invalido");
	}

}