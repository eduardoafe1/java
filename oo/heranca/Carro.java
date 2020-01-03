package oo.heranca;

public class Carro {
	protected int velocidadeMax = 200;
	private int velocidadeAtual = 0;
	
	protected final void aceleraMais(int velocidade){
		if(velocidadeAtual + velocidade > velocidadeMax){
			velocidadeAtual = velocidadeMax;
		}
		else{
			velocidadeAtual += velocidade;
		}
	}
	
	protected final void frearMais(int velocidade){
		if(velocidadeAtual - velocidade < 0 ){
			velocidadeAtual = 0;
		}
		else{
			velocidadeAtual -= velocidade;
		}
	}
	
	public void acelerar(){
		aceleraMais(5);
	}
	
	public void frear(){
		frearMais(5);
	}
	
	public int getVelocidadeAtual(){
		return velocidadeAtual;
	}
	
}
