package colecoes;

import java.util.List;
import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("Satan");
		aprovados.add("Baphomet");
		aprovados.add("Natas");
		aprovados.add("Mochila de Criança");
		aprovados.add("Tinhoso");
		aprovados.add("João");
		
		System.out.println("Get...");
		System.out.println(aprovados.get(1));
		
		System.out.println("Add...");
		System.out.println(aprovados.add("Satan"));
		System.out.println(aprovados.size());
		
		System.out.println("Remove...");
		System.out.println(aprovados.remove("Satan"));
		
		System.out.println("Size...");
		System.out.println(aprovados.size());
		
		for(String nome: aprovados){
			System.out.println(nome);
		}
	}
}
