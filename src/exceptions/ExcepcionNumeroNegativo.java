package exceptions;

public class ExcepcionNumeroNegativo extends ExcepcionParametroNoValido {
	private static final long serialVersionUID = 1L;

	/*
	 * Se implementa un error especifico para que no acepte los valores negativos
	 * 
	 */
	public ExcepcionNumeroNegativo() {
		super("No se permite numeros negativos.");
	}

}