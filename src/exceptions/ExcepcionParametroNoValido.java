package exceptions;
import java.lang.Exception;


public class ExcepcionParametroNoValido extends Exception {
	
	public ExcepcionParametroNoValido(String error) {
		super(error);
	}

}
