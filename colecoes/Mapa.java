package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;




public class Mapa {
	public static void main(String[] args) {
		Map <Integer, String> aprovados = new HashMap<>();
		aprovados.put(1, "Jorge");
		aprovados.put(2, "Joao");
		aprovados.put(3, "Yugi");
		aprovados.put(4, "Satan");
		aprovados.put(5, "Gon");
		
		System.out.println(aprovados.keySet());
		System.out.println(aprovados.values());
		System.out.println(aprovados.entrySet());
		
		aprovados.put(3, "Yugi Mutto");
		System.out.println(aprovados.get(3));
		
		System.out.println(aprovados.containsKey(4));
		System.out.println(aprovados.containsValue("Yugi"));
		
		System.out.println("Chaves/Valores...");
		for(Entry<Integer,String> registro: aprovados.entrySet()){
			System.out.println(registro.getKey() + " - " + registro.getValue());
			
	}
	
		
	}
}
