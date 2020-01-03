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
			
			System.out.println("A área é de: " + area + " m²");
			
			System.out.printf("A área é de: %f m²", area);
		}
}
