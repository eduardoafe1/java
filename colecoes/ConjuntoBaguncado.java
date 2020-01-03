package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("batata");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add...");
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(42));
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains('a'));
		
		System.out.println("");
		System.out.println("Remove...");
		System.out.println(conjunto.remove('a'));
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains('a'));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		conjunto.retainAll(nums);
		
		System.out.println("");
		System.out.println("Size...");
		System.out.println(conjunto.size());
		
		System.out.println("");
		System.out.println("Cleaning...");
		conjunto.clear();
		System.out.println(conjunto.isEmpty());
		
		
	}
}
