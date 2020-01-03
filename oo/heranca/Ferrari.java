package oo.heranca;

public class Ferrari extends Carro {
	
	public Ferrari(){
		velocidadeMax = 350;
	}
	
	public void acelerar(){
		super.aceleraMais(20);
	}

}
