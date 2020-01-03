package controle;

// TODO: Auto-generated Javadoc
/**
 * The Class Continue.
 */
public class Continue {

	/**
	 * The main method.
	 *
	 * @author eduardoaf
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++){
			if (i==2){
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Fim");
	}

}
