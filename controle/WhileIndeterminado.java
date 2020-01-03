package controle;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class WhileIndeterminado.
 */
public class WhileIndeterminado {
	
	/**
	 * The main method.
	 *
	 * @author eduardoaf
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner valida = new Scanner(System.in);
		
		double somaNotas = 0;
		double nota = 0;
		int numeroNotas = 0;
		
		System.out.println("Digite as notas (Digite -1 quando quiser calcula-las) ");
		while(nota != -1){
			nota = valida.nextDouble();
			
			if(nota<=10 && nota >= 0){
				somaNotas += nota;
				numeroNotas ++;
			}
			
		}
		valida.close();
		System.out.println("A média é: " + somaNotas / numeroNotas);
		
		
				
	}

}
