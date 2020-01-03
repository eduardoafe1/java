package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
	Scanner avalia = new Scanner(System.in);
	
	System.out.println("Digite a nota");
	double nota = avalia.nextDouble();
	
	if (nota >= 9){
		System.out.println("Honra ao Mérito!!!");
	}
	else if(nota >= 7){
		System.out.println("Aprovado! :)");
	}
	else if(nota>= 4){
		System.out.println("Recuperação! :(");
	}
	else if(nota >=2){
		System.out.println("Recuperação com trabalho :'(");
	}
	else{
		System.out.println("Reprovado (TToTT)");
	}
	}

}
