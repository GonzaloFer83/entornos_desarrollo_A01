package entornos_desarrollo_A01;

import exceptions.ExcepcionDivisionPorCero;
import exceptions.ExcepcionNumeroNegativo;

public class Main_test {
	public static void main (String args[]) {

		Division div = new Division();
		try {
		System.out.println("Valor: " + div.divisionNumReales(10, 3));
		} catch(ExcepcionDivisionPorCero excepcionDivisionPorCero) {
			System.out.println(excepcionDivisionPorCero.getMessage());
		}catch(ExcepcionNumeroNegativo excepcionNumeroNegativo) {
			System.out.println(excepcionNumeroNegativo.getMessage());
		}
	}
}
