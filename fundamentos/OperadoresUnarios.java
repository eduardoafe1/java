package fundamentos;

// TODO: Auto-generated Javadoc
/**
 * The Class OperadoresUnarios.
 */
public class OperadoresUnarios {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		//Incremento e decremento
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
		//Complemento Binário
		System.out.println(Integer.toBinaryString(6));
		System.out.println(Integer.toBinaryString(~6));
		
		//Negação Lógica
		System.out.println(!true);
		System.out.println(!false);
	}
}
