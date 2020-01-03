package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra{
	String segredoDoCasal = "Meu Marido está quase sendo demitido";
		
		public static void main(String[] args) {
			 Filha euMesma = new Filha();
			 System.out.println("Meus pais não sabem" + euMesma.segredoDoCasal);
			 
			 /*Genro maridao = new Genro();
			 System.out.println(maridao.segredo);*/
			 
			 Sogro papis = new Sogro();
			 System.out.println(papis.gostaDeCerveja);
			 
			 /*Sogra mamis = new Sogra();
			 System.out.println(mamis.segredoDeFamilia);*/
			 System.out.println(euMesma.segredoDeFamilia);
		}
}
