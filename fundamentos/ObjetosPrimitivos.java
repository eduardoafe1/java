package fundamentos;

// TODO: Auto-generated Javadoc
/**
 * The Class ObjetosPrimitivos.
 */
public class ObjetosPrimitivos {

	/**
	 * The main method.
	 *
	 * @author eduardoaf
	 * @version 1.0
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//Objetos Primitivos
		Character c = 'a';
		Boolean bo = true;
		
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		
		Float f = 5.1f;
		Double d = 6.1;
		
		//Objetos Primitivos permitem que sejam atribuidas funções de objetos para eles.
		System.out.println(bo.toString().length());
		//A atribuição acima seria a mesma coisa do que fazer essa outra.
		System.out.println("true".length());
		
		

	}

}
