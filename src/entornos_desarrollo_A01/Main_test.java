package entornos_desarrollo_A01;

import exceptions.ExcepcionParametroNoValido;

public class Main_test {
	public static void main(String args[]) {

		Division div = new Division();
		try {
			System.out.println("Valor: " + div.divisionNumReales(10, 2));
		} catch (ExcepcionParametroNoValido error) {
			System.out.println(error.getMessage());
		}
		
		Suma sum = new Suma();
		 try {
			 System.out.println("valor: " + sum.sumaNumerosEnteros(5, 3));
		 } catch (ExcepcionParametroNoValido error) {
			 System.out.println(error.getMessage());
		 }
		 
		 Resta res = new Resta();
		 try {
			 System.out.println("valor: " + res.resta3NumerosReales(12, 3, 4));
		 }catch (ExcepcionParametroNoValido error) {
			 System.out.println(error.getMessage());
		 }
		 
	}
	
}
