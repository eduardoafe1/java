package controle;

import java.util.Random;
import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class ExerciciosControle.
 */
public class ExerciciosControle {

	/**
	 * The main method.
	 *
	 * @author eduardoaf
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Scanner verifica = new Scanner(System.in);
		/*
		 * // Criar um programa que receba um número e verifique se ele está
		 * entre 0 e 10 e é par; System.out.println("Digite um número: "); int
		 * num = verifica.nextInt();
		 * 
		 * if (num <= 10 && num >= 0) {
		 * System.out.println("Seu número está entre 0 e 10"); if (num % 2 == 0)
		 * { System.out.println("Seu número é par"); } else {
		 * System.out.println("Seu número é impar"); } } else {
		 * System.out.println("Seu número não está entre 0 e 10"); }
		 */

		// Criar um programa informa se o ano atual é um ano bissexto;
		/*
		 * int ano = 2018; System.out.println("O ano é " + ano); if (ano % 4 ==
		 * 0 && ano % 100 != 0 || ano % 400 == 0) {
		 * System.out.println("Ano Bissexto"); } else {
		 * System.out.println("O Ano não é bissexto"); }
		 */

		// Criar um programa que receba duas notas parciais, calcular a média
		// final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
		// "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no
		// console "Recuperação", caso contrário imprime no console
		// "Reprovado".
		/*
		 * double media; System.out.println("Digite a primeira nota: "); double
		 * nota1 = verifica.nextDouble();
		 * 
		 * System.out.println("Digite a segunda nota: "); double nota2 =
		 * verifica.nextDouble();
		 * 
		 * media = (nota1 + nota2) / 2; if (media >= 7) {
		 * System.out.println("Sua média é -> " + media +
		 * " Você está Aprovado!"); }
		 * 
		 * else if (media < 7 && media > 4) {
		 * System.out.println("Sua média é -> " + media +
		 * " Você está de Recuperação"); }
		 * 
		 * else { System.out.println("Sua média é -> " + media +
		 * " Você está Reprovado"); }
		 */

		// Criar um programa que receba um número e diga se ele é um número
		// primo.
		/*
		 * System.out.println("Digite um número: "); int num =
		 * verifica.nextInt(); int contador = 0;
		 * 
		 * for (int i = 2; i < num; i++ ){ if (num % i == 0){ contador++; } } if
		 * (contador == 0 ){ System.out.println(num + " é primo"); }
		 * 
		 * else{ System.out.println(num + " não é primo"); }
		 */

		// programa que diga se um número primo. Em switch
		/*
		 * System.out.println("Digite um número: "); int num =
		 * verifica.nextInt(); int contador = 0;
		 * 
		 * for (int i = 2; i < num; i++) { if (num % i == 0) { contador++; } }
		 * switch (contador) { case 0: System.out.println(num + " é primo");
		 * break;
		 * 
		 * default: System.out.println(num + " não é primo"); }
		 */

		// Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
		// Armazene um numero aleatório em uma variável. O Jogador tem 10
		// tentativas para adivinhar o número gerado. Ao final de cada
		// tentativa, imprima a quantidade de tentativas restantes, e imprima se
		// o número inserido é maior ou menor do que o número armazenado.
		/*
		 * Random aleatorio = new Random();
		 * 
		 * int num = aleatorio.nextInt(100);
		 * System.out.println("Digite um número entre 0 e 100: "); for (int i =
		 * 9; i >= 0; i--) { int n2 = verifica.nextInt();
		 * 
		 * if (n2 == num) { System.out.println("Você Acertou!!!"); } else { if
		 * (n2 > num) { System.out.println("O número digitado é maior" +
		 * " || Tentativas: " + i); } else {
		 * System.out.println("O número digitado é menor" + " || Tentativas: " +
		 * i); if(i <= 0){
		 * System.out.println("Você ficou sem tentativas meu consagrado"); }
		 * else{ } } } }
		 */

		// Criar um programa que enquanto estiver recebendo números positivos,
		// imprime no console a soma dos números inseridos, caso receba um
		// número negativo, encerre o programa. Tente utilizar a estrutura do
		// while.
		/*
		 * int contador = 0; int num = 0; int somaNum = 0;
		 * System.out.println("Digite números positivos para soma-los");
		 * 
		 * while(num >= 0){ num = verifica.nextInt();
		 * 
		 * if(num >= 0 ){ somaNum += num; contador++; }
		 * 
		 * else{ System.out.println("Soma encerrada"); } } verifica.close();
		 * 
		 * System.out.println("A soma dos números é " + somaNum);
		 */

		// Criar um programa que receba uma palavra e imprime no console letra
		// por letra.
		/*
		 * System.out.println("Digite uma palavra "); String palavra =
		 * verifica.next();
		 * 
		 * for(int i = 0; i < palavra.length(); i++){
		 * System.out.println(palavra.charAt(i));
		 * 
		 * }
		 */

		// Crie um programa que recebe 10 valores e ao final imprima o maior
		// número.
		int maiorVal = 0;
		int contador = 1;

		do {
			System.out.println("Digite o " + contador + " valor");
			int val = verifica.nextInt();
			if (maiorVal < val) {
				maiorVal = val;
			}
			contador++;
		} while (contador <= 10);

		System.out.println("O maior valor foi " + maiorVal);

	}
}
