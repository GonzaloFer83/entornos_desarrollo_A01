package exceptions;

public class ExceptionExpAlto extends ExcepcionParametroNoValido {
	private static final long serialVersionUID = 1L;

	public ExceptionExpAlto(double newExpo) {
		super(newExpo +" es mas alto que el MAX_EXPONENT permitido");
	}

}
