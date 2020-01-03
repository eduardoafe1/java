package controle;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class SwitchComBreak.
 */
public class SwitchComBreak {

	/**
	 * The main method.
	 *
	 * @author eduardoaf
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Scanner valida = new Scanner(System.in);
		String conceito = "";
		
		System.out.println("Digite sua nota: ");
		int nota = valida.nextInt();

		switch (nota) {

		case 10:
		case 9:
			conceito = "A";
			break;

		case 8:
		case 7:
			conceito = "B";
			break;

		case 6:
		case 5:
			conceito = "C";
			break;

		case 4:
		case 3:
			conceito = "D";
			break;

		case 2:
		case 1:
		case 0:
			conceito = "E";
			break;

		default:
			conceito = null;
			break;
		}

		if (conceito != null) {
			System.out.println("Sua nota é " + conceito);
		}

		else {
			System.out.println("Nota Invalida");
		}
	}

}
