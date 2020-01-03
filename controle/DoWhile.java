package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner valida = new Scanner (System.in);
		double somaNotas = 0;
		double nota = 0;
		int numeroNotas = 0;
		
		System.out.println("Digite as notas |  Digite -1 para calcular a média");
		do{
			nota = valida.nextDouble();
			
			if(nota>=0&&nota<=10){
				somaNotas += nota;
				numeroNotas ++;
			}
		}while(nota != -1);
		
		valida.close();
		System.out.println("A média é " + somaNotas / numeroNotas);
	}

}
