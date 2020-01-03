package controle;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		Scanner valida = new Scanner(System.in);
		double somaNotas = 0;
		double nota = 0;
		int indice = 0;

		System.out.println("Digite as 3 notas: ");
		while (indice < 3) {
			nota = valida.nextDouble();

			if (nota <= 10 && nota >= 0) {
				somaNotas += nota;
				indice++;
			}

		}
		valida.close();
		System.out.println("A média é: " + somaNotas / 3);

		if (somaNotas / 3 >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}
}