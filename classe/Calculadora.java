package classe;

// TODO: Auto-generated Javadoc
/**
 * The Class Calculadora.
 */
public class Calculadora {
	
	/** The resultado. */
	double resultado;

	/**
	 * Somar.
	 *
	 * @param a the a
	 * @param b the b
	 * @return the double
	 */
	double somar(double a, double b) {
		resultado = a + b;
		return resultado;
	}

	/**
	 * Acrescentar.
	 *
	 * @param a the a
	 */
	void acrescentar(double a) {
		resultado += a;
	}
	
	/**
	 * Obter resultado.
	 *
	 * @return the double
	 */
	double obterResultado(){
		return resultado; 
	}
	
	/**
	 * Limpar.
	 */
	void limpar(){
		resultado = 0;
	}

}
