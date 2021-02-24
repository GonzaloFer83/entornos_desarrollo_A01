package exceptions;

public class ExcepcionNumeroMuyBajo extends ExcepcionParametroNoValido{
	private static final long serialVersionUID = 1L;

	/*
	 * Se implementa un error especifico para que no acepte el valores muy bajos
	 * para las operaciones
	 * 
	 */
	public ExcepcionNumeroMuyBajo() {
		super("Ese valor es muy bajo");
	}

}


