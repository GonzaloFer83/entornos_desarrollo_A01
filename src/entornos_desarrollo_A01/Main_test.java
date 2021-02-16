package entornos_desarrollo_A01;

import exceptions.ExcepcionParametroNoValido;

public class Main_test {
	public static void main(String args[]) {

		 Primos prim = new Primos();
		 try {
			 System.out.println("valor: " + prim.porcentaje(100, 20));
		 }catch (ExcepcionParametroNoValido error) {
			 System.out.println(error.getMessage());
		 }
		 try {
			 System.out.println("valor: " + prim.factorial(5));
		 }catch (ExcepcionParametroNoValido error) {
			 System.out.println(error.getMessage());
		 }try {
			 System.out.println("valor: " + prim.iesimo(7));
		 }catch (ExcepcionParametroNoValido error) {
			 System.out.println(error.getMessage());
		 }
		 
	}
	
}
