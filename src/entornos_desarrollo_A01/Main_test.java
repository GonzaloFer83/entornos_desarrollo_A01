package entornos_desarrollo_A01;

public class Main_test {
	public static void main (String args[]) {

		Division div = new Division();
		try {
		System.out.println("Valor: " + div.divisionNumReales(6, -2));
		} catch(ExcepcionDivisionPorCero excepcionDivisionPorCero) {
			System.out.println(excepcionDivisionPorCero.getMessage());
		}catch(ExcepcionNumeroNegativo excepcionNumeroNegativo) {
			System.out.println(excepcionNumeroNegativo.getMessage());
		}
	}
}
