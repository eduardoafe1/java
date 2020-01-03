package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data nascimento = new Data();
		/*nascimento.dia = 10;
		nascimento.mes = 06;
		nascimento.ano = 2018;*/
		
		Data casamento = new Data(17,12,2020);
		
		System.out.println(nascimento.formatar() + casamento.formatar());

	}

}
