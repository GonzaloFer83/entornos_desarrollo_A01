package exceptions;

public class ExceptionExpAlto extends ExcepcionParametroNoValido {
	private static final long serialVersionUID = 1L;

	/*
	 * Se implementa un error especifico para que no acepte el valores muy elevados
	 * para el exponente
	 * 
	 */
	public ExceptionExpAlto(double newExpo) {
		super(newExpo + " es mas alto que el MAX_EXPONENT permitido");
	}

}
