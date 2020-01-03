package oo.poliformismo;

public class Jantar {
	public static void main(String[] args) {
		Arroz arroz = new Arroz();
		arroz.setPeso(0.250);
		
		Feijao feijao = new Feijao();
		feijao.setPeso(0.265);
		
		Sorvete sorvete = new Sorvete();
		sorvete.setPeso(0.100);
		
		Pessoa joao = new Pessoa(80.75);
		joao.comer(arroz, feijao, sorvete);
		
		
		System.out.println(joao.getPeso());
	}

}
