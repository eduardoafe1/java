package controle;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class If.
 */
public class If {

	/**
	 * The main method.
	 *
	 * @author eduardoaf
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		boolean bomComportamento = false;
		Scanner registrador = new Scanner(System.in);

		System.out.println("Digite a nota do n1");
		double n1 = registrador.nextDouble();

		System.out.println("Comportamento Bom ou Ruim");
		String comp = registrador.next();

		if (n1 >= 9 && comp.equalsIgnoreCase("bom")) {
			System.out.println("Quadro de Honra!!!!");
		}

		else if (n1 >= 9 && comp.equalsIgnoreCase("ruim")) {
			System.out.println("Que pena, se comporte melhor");
		}

		else if (n1 >= 7) {
			System.out.println("Nota Azul, Parabéns!");
			if (comp.equalsIgnoreCase("bom")) {
				System.out.println("Comportamento Excelente!");
			} else {
				System.out.println("Melhore seu comportamento");
			}
		}

		else {
			System.out.println("Puxa não foi dessa vez, melhore suas notas");
		}
	}

}
