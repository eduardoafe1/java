package api;

public class ExplorandoString {
		public static void main(String[] args) {
			String nome = new String("Leonardo");
			nome = "Jooj" + "in";
			
			System.out.println(nome.toUpperCase());
			System.out.println(nome.length());
			System.out.println(nome.substring(0, 3));
			System.out.println(nome.indexOf('i'));
			System.out.println(nome.equalsIgnoreCase("joojin"));
			System.out.println(nome.startsWith("Jooj"));
			System.out.println(nome.isEmpty());
			System.out.println(nome.concat(" gosta de Batata").concat("!!!!"));
			
			System.out.println(nome);
			
			nome = nome.toUpperCase().substring(0, 3).concat(" pão de batata!!");
			System.out.println(nome);
		}

}
