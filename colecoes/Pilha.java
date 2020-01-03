package colecoes;

import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		Stack <String> pilha = new Stack<>();
		pilha.push("O Arqueiro");
		pilha.push("O Nome do Vento");
		pilha.push("Prince of Thorns");
		
		System.out.println("peek...");
		System.out.println(pilha.peek());
		
		System.out.println("pop...");
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
	}
}
