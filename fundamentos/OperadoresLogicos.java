package fundamentos;

// TODO: Auto-generated Javadoc
/**
 * The Class OperadoresLogicos.
 */
public class OperadoresLogicos {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		boolean exec1 = false;
		boolean exec2 = true;
		
		boolean compSorv = exec1 || exec2;
		boolean compTV50 = exec1 && exec2;
		boolean compTV32 = exec1 ^ exec2;
		
		System.out.println("Sorvete = " + compSorv );
		System.out.println("TV 50 = " + compTV50 );
		System.out.println("TV 32 = " + compTV32 );
		
		//Operador Unário
		System.out.println("Fome = " + !compSorv);
		
	}
}
