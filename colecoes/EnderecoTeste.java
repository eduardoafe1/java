package colecoes;

public class EnderecoTeste {
	public static void main(String[] args) {
		Endereco end1 = new Endereco("Rua batata", 42, "Casa do seu Joaquim");
		Endereco end2 = new Endereco("Rua batata", 42, "Casa do seu Joaquim");
		System.out.println(end1==end2);
		System.out.println(end1.equals(end2));
	}
	

}
