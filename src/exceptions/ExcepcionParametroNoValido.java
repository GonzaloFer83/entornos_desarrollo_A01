package exceptions;
import java.lang.Exception;


public class ExcepcionParametroNoValido extends Exception {
	private static final long serialVersionUID = 1L;
	public ExcepcionParametroNoValido(String error) {
		super(error);
		
	}

}
