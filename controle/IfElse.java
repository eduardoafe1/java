package controle;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class IfElse.
 */
public class IfElse {

	/**
	 * The main method.
	 *
	 * @author eduardoaf
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Scanner contador = new Scanner(System.in);

		System.out.println("Digite a nota");
		double nota = contador.nextDouble();
		
		if (nota >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Recuperação!");
		}

	}

}
