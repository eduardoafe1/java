package fundamentos;

// TODO: Auto-generated Javadoc
/**
 * The Class ConversaoNumeroString.
 */
public class ConversaoNumeroString {

	/**
	 * The main method.
	 * @author eduardoaf
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//Conversão de Int para String com o Wrapper
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//Conversão de Int para String transformando em Wrapper e depois convertendo
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		System.out.println((""+num2).length());
	}

}
