package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.nome = "Batata";
		produto1.preco = 2.15;
		
		Produto.desconto = 0.10;
		
		Produto produto2 = new Produto("Banana", 1.52);

		System.out.println(produto1.precoDesconto());
		System.out.println(produto2.precoDesconto());
	}

}
