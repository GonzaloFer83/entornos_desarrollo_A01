package exceptions;

public class ExcepcionErrorCero extends ExcepcionParametroNoValido {
	private static final long serialVersionUID = 1L;
	public ExcepcionErrorCero() {
		super("El valor es cero y es invalido");
	}

}