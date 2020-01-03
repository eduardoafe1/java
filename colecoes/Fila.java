package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("Jusiscleyson");
		fila.add("Mirdyon");
		fila.add("Zamyr");
		fila.add("Zagram");
		fila.add("Elodin");
		
		System.out.println("Peek/Element...");
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Pool/Remove...");
		System.out.println("Pr�ximo: " + fila.poll());
		System.out.println("Pr�ximo: " + fila.remove());
		System.out.println("Pr�ximo: " + fila.poll());
		System.out.println("Pr�ximo: " + fila.poll());
		System.out.println("Pr�ximo: " + fila.poll());
		System.out.println("Pr�ximo: " + fila.poll());
		
	}
}
