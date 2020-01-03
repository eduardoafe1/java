package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set <String>aprovados = new TreeSet<String>();
		aprovados.add("Zilmar");
		aprovados.add("Sudir");
		aprovados.add("HAIL");
		aprovados.add("SATAN");
		
		for(String nome: aprovados){
			System.out.println(nome);
		}
		
	}
}
