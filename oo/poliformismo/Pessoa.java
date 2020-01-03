package oo.poliformismo;

public class Pessoa {
	private double peso=0;
	
	public Pessoa(double pesoInicial){
		this.peso=pesoInicial;
	}

	public void comer(Arroz arroz){
		this.peso += arroz.getPeso();
	}
	
	public void comer(Feijao feijao){
		this.peso += feijao.getPeso();
	}
	
	public void comer(Sorvete sorvete){
		this.peso += sorvete.getPeso();
	}
	
	public void comer(Comida... comidas){
		for (Comida c: comidas){
			this.peso += c.getPeso();
		}
	}
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	

}
