package fundamentos;

// TODO: Auto-generated Javadoc
/**
 * The Class OperadoresAritmeticos.
 */
public class OperadoresAritmeticos {
	
	/**
	 * The main method.
	 * @author eduardoaf
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		
		//Operadores: + - * / %
		int soma = num1 + num2 + num3 + 80;
		System.out.println(soma);
		System.out.println(num1-num2-num3);
		
		//Cuidado com a precedência
		System.out.println(num1+num2*num3/2);
		System.out.println((num1+num2)*num3/2);
		
		//Resto da divisão
		System.out.println(10%3);
		System.out.println(10%2);
	}

}
