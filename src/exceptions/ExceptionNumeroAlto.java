package exceptions;

public class ExceptionNumeroAlto extends ExcepcionParametroNoValido {
	private static final long serialVersionUID = 1L;

	/*
	 * Se implementa un error especifico para que no acepte el valores muy elevados
	 * para el exponente
	 * 
	 */
	public ExceptionNumeroAlto() {
		super("Ese valor es demasiado alto");
	}

}
