package fundamentos;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class ExerciciosConceitosBasicos.
 */
public class ExerciciosConceitosBasicos {

	/**
	 * The main method.
	 * 
	 * @author eduardoaf
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Celsius e converta para
		// Fahrenheit.

		/*
		 * Scanner conversor = new Scanner(System.in);
		 * 
		 * System.out.println("Digite a Temperatura em Celsius: "); double temp
		 * = conversor.nextDouble();
		 * 
		 * System.out.println(temp +"�C em Fahrenheit � " + ((temp * 9/5) + 32)
		 * + "�F");
		 * 
		 * //Criar um programa que leia a temperatura em Fahrenheit e converta
		 * para Celsius.
		 * System.out.println("Digite a Temperatura em Fahrenheit: "); double
		 * tempF = conversor.nextDouble();
		 * 
		 * System.out.println(tempF +"�F em Celsius � " + ((tempF -32) * 5/9) +
		 * "�C");
		 * 
		 * 
		 * //Criar um programa que leia o peso e a altura do usu�rio e imprima
		 * no console o IMC. double imc; Scanner memoria = new
		 * Scanner(System.in); System.out.println("Digite o seu peso: "); double
		 * peso = memoria.nextDouble();
		 * 
		 * System.out.println("Digite a sua Altura: "); double altura =
		 * memoria.nextDouble();
		 * 
		 * imc = peso /(altura*altura);
		 * 
		 * System.out.println(imc);
		 * 
		 * 
		 * //Criar um programa que leia um valor e apresente os resultados ao
		 * quadrado e ao cubo do valor. int quadrado; int cubo;
		 * 
		 * Scanner eleva = new Scanner(System.in);
		 * 
		 * System.out.println(
		 * "Digite o valor para ser elevado ao Quadrado e ao Cubo"); int valor =
		 * eleva.nextInt();
		 * 
		 * quadrado = valor*valor; cubo = valor*valor*valor;
		 * 
		 * System.out.println(valor + "� �: " + quadrado + " | " + valor
		 * +"� �: " + cubo );
		 * 
		 * 
		 * //Criar um programa que leia o valor da base e da altura de um
		 * tri�ngulo e calcule a �rea. int areaT; Scanner leitor = new Scanner
		 * (System.in);
		 * 
		 * System.out.println("Digite o valor em metros da base do tri�ngulo: ");
		 * int baseT = leitor.nextInt();
		 * 
		 * System.out.println("Digite o valor em metros da altura do tri�ngulo: "
		 * ); int alturaT = leitor.nextInt();
		 * 
		 * areaT = baseT * alturaT;
		 * System.out.println("A �rea do Tri�ngulo � de: " + areaT + " m�");
		 */

		// Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0)
		// utilizando a f�rmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		int delta;
		int x;
		Scanner calc = new Scanner(System.in);

		System.out.println("Digite o valor de a: ");
		int a = calc.nextInt();

		System.out.println("Digite o valor de b: ");
		int b = calc.nextInt();

		System.out.println("Digite o valor de c: ");
		int c = calc.nextInt();

		delta = (b * b) - (4 * a * c);
		System.out.println("Delta = " + delta);

		if (delta <= 0) {
			System.out.println("SEU DELTA N�O � REAL");
		}

		else {
			double x1 = (-b + Math.sqrt(delta) / (2 * a));
			double x2 = (-b - Math.sqrt(delta) / (2 * a));

			System.out.println("Delta = " + delta + " | x� = " + x1 + "| x� = " + x2);
			System.out.println("Deltas s�o reais se voc� acredita neles");
		}

	}

}
