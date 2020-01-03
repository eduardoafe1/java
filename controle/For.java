package controle;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner valida = new Scanner(System.in);

		double somaNotas = 0;
		double nota = 0;

		System.out.println("Digite as 3 notas: ");
		for (int indice = 0; indice < 3; indice++) {
			nota = valida.nextDouble();
			somaNotas += nota;
		}
		valida.close();
		System.out.println("A média é " + somaNotas / 3);

	}
}
