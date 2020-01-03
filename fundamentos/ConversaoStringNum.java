package fundamentos;

import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class ConversaoStringNum.
 */
public class ConversaoStringNum {
	
	/**
	 * The main method.
	 * @author eduardoaf
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String resposta1 = JOptionPane.showInputDialog("Qual a 1ª Nota");
		String resposta2 = JOptionPane.showInputDialog("Qual a 2ª Nota");
		
		double nota1 = Double.parseDouble(resposta1);
		double nota2 = Double.parseDouble(resposta2);
		double media = nota1 + nota2;
		
		System.out.println("A média é: " + media/2);
		
		Double notaA = 7.43;
		System.out.println(notaA.parseDouble(resposta1));
		
		
	}
}
