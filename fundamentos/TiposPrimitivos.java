package fundamentos;

// TODO: Auto-generated Javadoc
/**
 * The Class TiposPrimitivos.
 */
public class TiposPrimitivos {

	/**
	 * The main method.
	 *
	 * @author eduardoaf
	 * @version 1.0
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//Tipo primitivo Boolean
		boolean bo1 = true;
		boolean bo2 = false;
		System.out.printf(" %b %b \n" ,bo1, bo2);
		
		
		//Tipo Primitivo Caracter
		char c1 = 'a';
		char c2 = '!';
		char c3 = '1';
		char c4 = '\u0050';
		System.out.println("----------Caracters-----------");
		System.out.println(c1 + "\n" + c2 + "\n" +  c3 + "\n" + c4);
		
		//Tipos Primitivos Inteiros
		byte b = 127;
		short s = 32767;
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L;
		System.out.println("----------Inteiros-----------");
		System.out.printf("%d %d %d %d\n",b ,s ,i ,l);
		
		//Imprimir Variáveis no Formato Binário 
		System.out.println("----------Binários-----------");
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
		
		//Tipos Primitivos Reais (Ponto Flutuante)
		float f = 3.1416f;
		double d = 9.95;
		
		System.out.println(f + "\n" + d );
		
	}

}
