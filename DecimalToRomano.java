
package conversorromano;

/**
 *
 * @author Jonata
 */

public class DecimalToRomano {
	static String valorRomano = "";

	public DecimalToRomano() {

	}

	public static String converter(int numero) {
		int x = 0;
		if (numero < 4000) {

			if (numero >= 1000) {
				valorRomano += "" + "M";
				converter(numero -= 1000);

			} else if (numero >= 900) {
				valorRomano += "" + "CM";
				converter(numero -= 900);
			} else if (numero >= 500) {
				valorRomano += "" + "D";
				converter(numero -= 500);
			} else if (numero >= 400) {
				valorRomano += "" + "CD";
				converter(numero -= 400);
			} else if (numero >= 100) {
				valorRomano += "" + "C";
				converter(numero -= 100);
			} else if (numero >= 90) {
				valorRomano += "" + "XC";
				converter(numero -= 90);
			} else if (numero >= 50) {
				valorRomano += "" + "L";
				converter(numero -= 50);
			} else if (numero >= 40) {
				valorRomano += "" + "XL";
				converter(numero -= 40);
			} else if (numero >= 10) {
				valorRomano += "" + "X";
				converter(numero -= 10);
			} else if (numero >= 9) {
				valorRomano += "" + "IX";
				converter(numero -= 9);
			} else if (numero >= 5) {
				valorRomano += "" + "V";
				converter(numero -= 5);
			} else if (numero >= 4) {
				valorRomano += "" + "IV";
				converter(numero -= 4);
			} else if (numero >= 1) {
				valorRomano += "" + "I";
				converter(numero -= 1);
			}
			return "O Valor em Romano é: " + valorRomano;
		} else {
			return "Valor Inválido!";
		}

	}
}

