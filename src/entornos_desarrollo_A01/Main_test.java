package entornos_desarrollo_A01;

import exceptions.ExcepcionParametroNoValido;

public class Main_test {
	public static void main(String args[]) {

		 Division div = new Division();
		 try {
			 System.out.println("valor: " + div.inversoValor(12));
		 }catch (ExcepcionParametroNoValido error) {
		
		 }
	}
	
}
