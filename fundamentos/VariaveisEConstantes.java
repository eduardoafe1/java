package fundamentos;

// TODO: Auto-generated Javadoc
/**
 * The Class VariaveisEConstantes.
 */
public class VariaveisEConstantes {

		/**
		 * The main method.
		 *
		 * @param args the arguments
		 */
		public static void main(String[] args) {
			double raio = 4.5;
			final double PI = 3.1416;
			double area = PI * raio * raio;
			
			System.out.println("A �rea � de: " + area + " m�");
			
			System.out.printf("A �rea � de: %f m�", area);
		}
}
