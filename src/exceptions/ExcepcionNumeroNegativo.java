package exceptions;

public class ExcepcionNumeroNegativo extends ExcepcionParametroNoValido {
	private static final long serialVersionUID = 1L;
	public ExcepcionNumeroNegativo() {
		super("No se permite numeros negativos.");
	}

}